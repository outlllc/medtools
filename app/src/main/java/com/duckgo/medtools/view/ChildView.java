package com.duckgo.medtools.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.duckgo.medtools.R;
import com.duckgo.medtools.view.adapter.TextAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChildView extends LinearLayout {

    private ListView regionListView;   // 主ListView
    private ListView plateListView;    // 子ListView

    // 主ListView每一个Item对应的text
    private String[] LeftFaString = new String[]{"综合", "内科          >", "外科          >", "妇产科       >",
            "儿科          >", "肿瘤科", "眼科", "急诊科", "麻醉疼痛科", "重症医学科", "皮肤性病科", "耳鼻喉头颈科", "精神心理科", "辅助科室       >", "其他科室       >"};
    // 子ListView每一个Item对应的text
    private String[][] LeftCh1String = new String[][]{
            {"全部", "常用计算"},
            {"大内科", "呼吸内科", "心血管内科", "消化内科", "血液内科", "肾内科", "内分泌科", "风湿免疫科", "老年医学科", "神经内科"},
            {"大外科", "普通外科", "骨科", "泌尿外科", "胸外科", "神经外科", "血管外科", "烧伤科", "肝胆外科", "肛肠外科"},
            {"妇产科综合", "妇科", "产科"},
            {"小儿综合内科", "小儿综合外科", "新生儿科", "小儿心内科", "小儿内分泌科", "小儿免疫科", "小儿骨科", "小儿急诊科", "儿童保健科"},
            {"肿瘤科"},
            {"眼科"},
            {"急诊科"},
            {"麻醉疼痛科"},
            {"重症医学科"},
            {"皮肤性病科"},
            {"耳鼻喉头颈科"},
            {"精神心理科"},
            {"检验科", "病理科", "药剂科", "医学影像科", "核医学科", "超声科", "介入科"},
            {"康复科", "营养科", "生殖医学科", "男科"}
    };

    private List<String> groups = new ArrayList<>();
    private List<String> childrenItem = new ArrayList<>();
    private SparseArray<List<String>> children = new SparseArray<>();

    private TextAdapter plateListViewAdapter;
    private TextAdapter earaListViewAdapter;
    private OnSelectListener mOnSelectListener;

    private int tEaraPosition = 0;
    private int tBlockPosition = 0;
    private String showString = "";

    public ChildView(Context context) {
        super(context);
        init(context);
    }

    public ChildView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_region, this, true);
        regionListView = findViewById(R.id.listView);
        plateListView = findViewById(R.id.listView2);

        for (int i = 0; i < LeftFaString.length; i++) {
            groups.add(LeftFaString[i]);
            List<String> tItem = new ArrayList<>();
            for (int j = 0; j < LeftCh1String[i].length; j++) {
                tItem.add(LeftCh1String[i][j]);
            }
            children.put(i, tItem);
        }

        earaListViewAdapter = new TextAdapter(context, groups, R.drawable.choose, R.drawable.choose_eara_item_selector);
        earaListViewAdapter.setTextSize(12);
        earaListViewAdapter.setSelectedPositionNoNotify(tEaraPosition);
        regionListView.setAdapter(earaListViewAdapter);

        earaListViewAdapter.setOnItemClickListener(new TextAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                tEaraPosition = position;
                updateChildList(position);
            }
        });

        if (tEaraPosition < children.size()) {
            childrenItem.addAll(children.get(tEaraPosition));
        }

        plateListViewAdapter = new TextAdapter(context, childrenItem, R.drawable.choose_item_right, R.drawable.choose_plate_item_selector);
        plateListViewAdapter.setTextSize(12);
        plateListViewAdapter.setSelectedPositionNoNotify(tBlockPosition);
        plateListView.setAdapter(plateListViewAdapter);

        plateListViewAdapter.setOnItemClickListener(new TextAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                tBlockPosition = position;
                showString = childrenItem.get(position);
                if (mOnSelectListener != null) {
                    mOnSelectListener.getValue(showString);
                }
            }
        });

        if (tBlockPosition < childrenItem.size()) {
            showString = childrenItem.get(tBlockPosition);
        }
    }

    private void updateChildList(int position) {
        childrenItem.clear();
        List<String> items = children.get(position);
        if (items != null) {
            childrenItem.addAll(items);
        }
        plateListViewAdapter.setSelectedPositionNoNotify(-1); // 重置子列表选中状态
        plateListViewAdapter.notifyDataSetChanged();
    }

    public void setDefaultSelect() {
        regionListView.setSelection(tEaraPosition);
        plateListView.setSelection(tBlockPosition);
    }

    public String getShowText() {
        return showString;
    }

    public void setOnSelectListener(OnSelectListener onSelectListener) {
        mOnSelectListener = onSelectListener;
    }

    public interface OnSelectListener {
        void getValue(String showText);
    }
}
