package com.wanglong;

public class zhishu {
	public static void main(String[] args) {
    int i=1,num=0;
    for(;i<=100;i++){
    	if(i==1){
    		continue;
    	}
    	else if(i==2){
    		System.out.println(i);
    		num=num+1;
    	}
   
    	else {
    		int j=2;
    		for(;j<=i-1;j++){
        		if(i%j==0){
        			break;
        		}
        	
		     }
    		if(j>i-1){
        		System.out.println(i);
        		num=num+1;
        		}
    		
    	}
  }
    System.out.println("The prime all have :"+num);
 }
}
