package com.duckgo.medtools.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import com.duckgo.medtools.R;

import java.util.ArrayList;

public class ExpandTabView extends LinearLayout implements OnDismissListener {

    private ToggleButton selectedButton;
    private ArrayList<String> mTextList = new ArrayList<>();
    private ArrayList<RelativeLayout> mViewList = new ArrayList<>();
    private ArrayList<ToggleButton> mToggleList = new ArrayList<>();

    private Context mContext;
    private int displayWidth;
    private int displayHeight;

    private PopupWindow popupWindow;
    private int selectPosition;
    private OnButtonClickListener mOnButtonClickListener;

    public ExpandTabView(Context context) {
        super(context);
        init(context);
    }

    public ExpandTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        DisplayMetrics dm = new DisplayMetrics();
        ((Activity) mContext).getWindowManager().getDefaultDisplay().getMetrics(dm);
        displayWidth = dm.widthPixels;
        displayHeight = dm.heightPixels;
        setOrientation(LinearLayout.HORIZONTAL);
    }

    public void setValue(ArrayList<String> textArray, ArrayList<View> viewArray) {
        if (mContext == null) return;

        removeAllViews();
        mViewList.clear();
        mToggleList.clear();
        if (popupWindow != null) {
            popupWindow.dismiss();
        }

        LayoutInflater inflater = LayoutInflater.from(mContext);
        mTextList = textArray;

        for (int i = 0; i < viewArray.size(); i++) {
            final RelativeLayout r = new RelativeLayout(mContext);
            int maxHeight = (int) (displayHeight * 0.7); // 增加高度限制到 0.7
            
            View view = viewArray.get(i);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            
            RelativeLayout.LayoutParams rl = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, maxHeight);
            r.addView(view, rl);
            mViewList.add(r);

            ToggleButton tButton = (ToggleButton) inflater.inflate(R.layout.toggle_button, this, false);
            addView(tButton);
            mToggleList.add(tButton);
            tButton.setTag(i);
            
            if (mTextList != null && i < mTextList.size()) {
                tButton.setText(mTextList.get(i));
                tButton.setTextOn(mTextList.get(i));
                tButton.setTextOff(mTextList.get(i));
            }

            r.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    onPressBack();
                }
            });

            r.setBackgroundColor(mContext.getResources().getColor(R.color.popup_main_background));

            tButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToggleButton tButton = (ToggleButton) view;
                    if (selectedButton != null && selectedButton != tButton) {
                        selectedButton.setChecked(false);
                    }
                    selectedButton = tButton;
                    selectPosition = (Integer) selectedButton.getTag();
                    startAnimation();
                    if (mOnButtonClickListener != null && tButton.isChecked()) {
                        mOnButtonClickListener.onClick(selectPosition);
                    }
                }
            });
        }
    }

    private void startAnimation() {
        if (popupWindow == null) {
            popupWindow = new PopupWindow(mContext);
            popupWindow.setWidth(displayWidth);
            popupWindow.setHeight(LayoutParams.WRAP_CONTENT); // 改为 WRAP_CONTENT
            popupWindow.setAnimationStyle(R.style.PopupWindowAnimation);
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setOnDismissListener(this);
        }

        if (selectedButton.isChecked()) {
            if (!popupWindow.isShowing()) {
                showPopup(selectPosition);
            } else {
                popupWindow.dismiss();
                // 如果已经在显示，再次点击同一个按钮应该隐藏，ToggleButton 状态由系统自动改变，
                // 但如果点击了另一个按钮，我们在 onClick 里已经处理了 checked 状态。
            }
        } else {
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        }
    }

    private void showPopup(int position) {
        View contentView = mViewList.get(position);
        popupWindow.setContentView(contentView);
        popupWindow.showAsDropDown(this, 0, 0);
    }

    public boolean onPressBack() {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            if (selectedButton != null) {
                selectedButton.setChecked(false);
            }
            return true;
        }
        return false;
    }

    @Override
    public void onDismiss() {
        if (selectedButton != null) {
            selectedButton.setChecked(false);
        }
    }

    public void setTitle(String valueText, int position) {
        if (position >= 0 && position < mToggleList.size()) {
            ToggleButton tButton = mToggleList.get(position);
            tButton.setText(valueText);
            tButton.setTextOn(valueText);
            tButton.setTextOff(valueText);
        }
    }

    public String getTitle(int position) {
        if (position >= 0 && position < mToggleList.size()) {
            return mToggleList.get(position).getText().toString();
        }
        return "";
    }

    public void setOnButtonClickListener(OnButtonClickListener l) {
        mOnButtonClickListener = l;
    }

    public interface OnButtonClickListener {
        void onClick(int selectPosition);
    }
}
