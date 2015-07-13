package com.geminno.tulingdemo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener;
import android.app.FragmentManager.BackStackEntry;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class MainActivity extends Activity implements HttpGetDataListener,OnBreadCrumbClickListener {
    @SuppressWarnings("unused")
	private HttpData mHttpData;
    private List<ListData> lists;
    private ListView lv;
    private EditText sendText;
    private Button sendButton;
    private String context_str;
    private TextAdapter adapter;
    
    private String[] welcome_array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
       
    }
private void initView(){
	lv=(ListView) findViewById(R.id.lv);
	sendText=(EditText) findViewById(R.id.sendText);
	sendButton=(Button) findViewById(R.id.sendBtn);
	lists= new ArrayList<ListData>();
	sendButton.setOnClickListener((OnClickListener) this);
	adapter=new TextAdapter(lists,this);
	lv.setAdapter(adapter);
	ListData listData=new ListData(getRandomWelcomeTips(),ListData.RECEIVER);
	lists.add(listData);
}

private String getRandomWelcomeTips(){
	String welcome_tip=null;
	welcome_array=this.getResources().getStringArray((Integer) R.array.welcome_tip);
	int index=(int) (Math.random()*(welcome_array.length-1));
	welcome_tip=welcome_array[index];
	return welcome_tip;
}
	@Override
	public void getDataurl(String data) {
		//System.out.println(data);
		parseText(data);	
	}
public void parseText(String str) {
	try {
		JSONObject jb=new JSONObject(str);
	//System.out.println(jb.getString("code"));	
	//System.out.println(jb.getString("text"));	
		ListData listData=new  ListData(jb.getString("text"),ListData.RECEIVER);
		lists.add(listData);
		adapter.notifyDataSetChanged();
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
public void onClick(View v){
	context_str=sendText.getText().toString();
	sendText.setText("");
	String a=context_str.replace(" ","");
	String str=a.replace("\n", "");
	 mHttpData=(HttpData) new HttpData ("http://www.tuling123.com/openapi/api?key=2467cca90f9c8ba6e980f54e542235be&info="+str,this).execute();
	 ListData listData=new ListData(context_str,ListData.SEND);
	 lists.add(listData);
	 adapter.notifyDataSetChanged();
}
@Override
public boolean onBreadCrumbClick(BackStackEntry backStack, int flags) {
	// TODO Auto-generated method stub
	return false;
}
}

