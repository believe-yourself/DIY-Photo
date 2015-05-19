package com.diy.photoalbum;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class welcome extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//设置全屏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏的
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	      setContentView(R.layout.welcome);
	      
	      final Intent it=new Intent(this,MainActivity.class);
	      Timer timer=new Timer();
	      TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				startActivity(it);
				
			}
		};
		timer.schedule(task, 1000*10);
	     
}}
