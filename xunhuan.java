package com.wanglong;

public class xunhuan {
	public static void main(String[] args) {
		int i=1;
		while(i<=100){
			if(i==1){
				i=i+1;
			}
			else if(i==2){
				System.out.println(i);
				i=i+1;
			}
			
			else{
				int j=2;
				while(j<=i-1&&j>=2){
					if(i%j==0){
						break;
					}
					else {
						j++;
						continue;
				}
				}	
					if(j>i-1){
						System.out.println(i);
						}
				i++;
				
			}
			
		}
	}

}
