package com.wanglong;

public class tofifty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
	    for(;i<=50;i++){
	      if(i==2){
	    		System.out.println(i);
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
	        		}
	    		
	    	}
	  }
	}

}
