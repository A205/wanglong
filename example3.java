package com.wanglong;

import java.util.Scanner;

public class example3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    String dayString=scanner.nextLine();
    int day=0;
    switch(dayString.toLowerCase()){
    case "monday":day=1;break;
    case "tuesday":day=2;break;
    case "wednesday":day=3;break;
    case "thursday":day=4;break;
    case "friday":day=5;break;
    case "saturday":day=6;break;
    case "sunday":day=7;break;
    default:day=0;
    }
    if(day==0){
    	System.out.println("Invalid input");
    }
    else{
    	System.out.println(day);
    }
	}	

}
