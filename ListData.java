package com.geminno.tulingdemo;

public class ListData {
     private String countent;
     public static final int SEND=1;
     public static final int RECEIVER=2;
  
     private int flag;
     public ListData(String content,int flag){
	     setCountent( countent);
	     setFlag(flag);
     }
     public void ListData1(String context_str, int send2) {
		// TODO Auto-generated constructor stub
	}
	public String getCountent() {
    	 return countent;
     }
     public void setCountent(String countent) {
    	 this.countent = countent;
     }
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	}