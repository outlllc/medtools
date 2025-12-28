package com.duckgo.medtools.view.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.duckgo.medtools.R;
import java.util.List;

public class TextAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mListData;
    private String[] mArrayData;
    private int selectedPos = -1;
    private int normalDrawableId;
    private Drawable selectedDrawable;
    private float textSize = 12;
    private OnItemClickListener mOnItemClickListener;

    public TextAdapter(Context context, List<String> listData, int sId, int nId) {
        this.mContext = context;
        this.mListData = listData;
        this.selectedDrawable = ContextCompat.getDrawable(mContext, sId);
        this.normalDrawableId = nId;
    }

    public TextAdapter(Context context, String[] arrayData, int sId, int nId) {
        this.mContext = context;
        this.mArrayData = arrayData;
        this.selectedDrawable = ContextCompat.getDrawable(mContext, sId);
        this.normalDrawableId = nId;
    }

    @Override
    public int getCount() {
        if (mListData != null) return mListData.size();
        if (mArrayData != null) return mArrayData.length;
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if (mListData != null) return mListData.get(position);
        if (mArrayData != null) return mArrayData[position];
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setSelectedPosition(int pos) {
        selectedPos = pos;
        notifyDataSetChanged();
    }

    public void setSelectedPositionNoNotify(int pos) {
        selectedPos = pos;
    }

    public int getSelectedPosition() {
        return selectedPos;
    }

    public void setTextSize(float tSize) {
        textSize = tSize;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        TextView view;
        if (convertView == null) {
            view = (TextView) LayoutInflater.from(mContext).inflate(R.layout.choose_item, parent, false);
        } else {
            view = (TextView) convertView;
        }

        String mString = (String) getItem(position);
        view.setText(mString);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);

        if (selectedPos == position) {
            view.setBackground(selectedDrawable);
        } else {
            view.setBackground(ContextCompat.getDrawable(mContext, normalDrawableId));
        }

        int paddingLeft = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, mContext.getResources().getDisplayMetrics());
        view.setPadding(paddingLeft, 0, 0, 0);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPos = position;
                notifyDataSetChanged();
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(v, position);
                }
            }
        });
        return view;
    }

    public void setOnItemClickListener(OnItemClickListener l) {
        mOnItemClickListener = l;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
}
