package com.wanglong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class onefive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			
			System.out.println("|1.Add a student|");
			System.out.println("|2.Show all students|");
			System.out.println("|3.Exit procedure|");
			System.out.println("|Please enter a choice（1-3）:");
			
			
			BufferedReader br=new BufferedReader(new 
	InputStreamReader(System.in));
			
			String str="";
			int i=0;
			
			try{
				str=br.readLine();
				i=Integer.parseInt(str);
			}catch(IOException e){
			
			}catch(NumberFormatException e1){
				System.out.println("input error");
				continue;
			}
			
			
			switch(i){
				case 1:System.out.println("hello, you add a student.");break;
				case 2:System.out.println("hello, you show all students.");break;
	
				case 3:System.out.println("hello, you exit procedure");break;
	
				
			}
			}
		}

}
