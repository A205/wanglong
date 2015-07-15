package com.lightway.tulingdemo;


import com.lightway.tulingdemo.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class NewActivity extends Activity  {

   private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enteritem);
        button2=(Button)findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    //跳转第二个界面。。。
				Intent intent=new Intent(NewActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});

    }

	private void setContentView(Class<layout> class1) {
		// TODO Auto-generated method stub
		
	}

	public boolean  onCreatOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}
}
