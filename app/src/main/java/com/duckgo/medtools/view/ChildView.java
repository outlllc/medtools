package com.duckgo.medtools.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.duckgo.medtools.R;
import com.duckgo.medtools.adapter.TextAdapter;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChildView extends LinearLayout {
	
	private ListView regionListView;   //主ListView
	private ListView plateListView;    //子ListView
	
	//主ListView每一个Item对应的text
	private String LeftFaString[] = new String[] { "综合", "内科          >", "外科          >", "妇产科       >",
			"儿科          >", "肿瘤科", "眼科", "急诊科", "麻醉疼痛科", "重症医学科", "皮肤性病科", "耳鼻喉头颈科", "精神心理科", "辅助科室       >", "其他科室       >" };
	//子ListView每一个Item对应的text..采用了二维数组的实现方式..
	private String LeftCh1String[][] = new String[][] {
			{ "全部", "常用计算" },
			{ "大内科", "呼吸内科", "心血管内科", "消化内科", "血液内科", "肾内科", "内分泌科", "风湿免疫科", "老年医学科", "神经内科" },
			{ "大外科", "普通外科", "骨科", "泌尿外科", "胸外科", "神经外科", "血管外科", "烧伤科", "肝胆外科", "肛肠外科" },
			{ "妇产科综合", "妇科", "产科" },
			{ "小儿综合内科", "小儿综合外科", "新生儿科", "小儿心内科", "小儿内分泌科", "小儿免疫科", "小儿骨科", "小儿急诊科", "儿童保健科" },
			{ "肿瘤科" },
			{ "眼科" },
			{ "急诊科" },
			{ "麻醉疼痛科" },
			{ "重症医学科" },
			{ "皮肤性病科" },
			{ "耳鼻喉头颈科" },
			{ "精神心理科" },
			{ "检验科", "病理科", "药剂科", "医学影像科", "核医学科", "超声科", "介入科" },
			{ "康复科", "营养科", "生殖医学科", "男科" }
		};

	//添加主ListView中的数据信息
	private ArrayList<String> groups = new ArrayList<String>();
	
	//添加子ListView中的数据信息
	private LinkedList<String> childrenItem = new LinkedList<String>();
	
	//稀疏数组
	private SparseArray<LinkedList<String>> children = new SparseArray<LinkedList<String>>();
	//为ListView设置适配器
	private TextAdapter plateListViewAdapter;
	private TextAdapter earaListViewAdapter;
	//监听事件的设置
	private OnSelectListener mOnSelectListener;
	
	private int tEaraPosition = 0;     //用于保存当前主ListView被点击的Item对应的Position.
	private int tBlockPosition = 0;	   //用于保存当前子ListView被点击的Item对应的Position.
	
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
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		//加载布局,绑定ID.
		inflater.inflate(R.layout.view_region, this, true);
		regionListView = (ListView) findViewById(R.id.listView);
		plateListView = (ListView) findViewById(R.id.listView2);

		//初始化ListView中每一个item对应的text
		for(int i=0;i<LeftFaString.length;i++){
			groups.add(LeftFaString[i]);
			LinkedList<String> tItem = new LinkedList<String>();
			for(int j=0;j<LeftCh1String[i].length;j++){
				
				tItem.add(LeftCh1String[i][j]);
				
			}
			children.put(i, tItem);
		}

		//主ListView列表项的适配器
		earaListViewAdapter = new TextAdapter(context, groups,
				R.drawable.choose,
				R.drawable.choose_eara_item_selector);
		earaListViewAdapter.setTextSize(12);
		earaListViewAdapter.setSelectedPositionNoNotify(tEaraPosition);
		
		regionListView.setAdapter(earaListViewAdapter);
		
		earaListViewAdapter
				.setOnItemClickListener(new TextAdapter.OnItemClickListener() {

					@Override
					public void onItemClick(View view, int position) {
						if (position < children.size()) {
							childrenItem.clear();
							//获取这一页的所有数据信息..然后唤醒适配器更新数据
							childrenItem.addAll(children.get(position));
							plateListViewAdapter.notifyDataSetChanged();
						}
					}
				});
		
		if (tEaraPosition < children.size())
			childrenItem.addAll(children.get(tEaraPosition));
		
		
		//子ListView的适配器
		plateListViewAdapter = new TextAdapter(context, childrenItem,
				R.drawable.choose_item_right,
				R.drawable.choose_plate_item_selector);
		plateListViewAdapter.setTextSize(12);
		plateListViewAdapter.setSelectedPositionNoNotify(tBlockPosition);
		plateListView.setAdapter(plateListViewAdapter);
		//设置当Item被点击后触发的监听.
		plateListViewAdapter
				.setOnItemClickListener(new TextAdapter.OnItemClickListener() {

					@Override
					public void onItemClick(View view, final int position) {
						//获取被点击的Item的文字数据
						showString = childrenItem.get(position);
						if (mOnSelectListener != null) {
							
							mOnSelectListener.getValue(showString);
						}

					}
				});
		
		if (tBlockPosition < childrenItem.size())
			showString = childrenItem.get(tBlockPosition);
		setDefaultSelect();

	}
    
	//设置当前Item的Position.
	public void setDefaultSelect() {
		//默认选择的Item项
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
		public void getValue(String showText);
	}

}
