package com.wanglong;

public class erweishuzu {
	public static void main(String[] args) {
			  int[][] arr = new int[20][5];
			  int[] sum = new int[20];// The total score of each student
			  int[] total = new int[5];
			  int i, j= 0;
			  for (i = 0; i < 20; i++)
			   for (j = 0; j < 5; j++)// Initialize array
			   {
			    arr[i][j] = (int) (Math.random() * 100);
			   }
			  // **********************Output of each course of the students************************
			  System.out.println("                                       Student achievement");
			  System.out.println("    core C++  coreJava    Servlet     JSP     EJB "); 
			  for (i = 0; i < 20; i++) 
			  {
			   System.out.print(i + "Number ");
			   for (j = 0; j < 5; j++)
			   {
			    System.out.print(arr[i][j] + "         ");
			   }
			   System.out.println();
			  }
			  // ***********************Total score of each student***********************
			  for (i = 0; i < 20; i++) 
			  {
			   for (j = 0; j < 5; j++)
			   {
			    sum[i] += arr[i][j];
			   }
			   System.out.println(i + "	Students total score：" + sum[i]);
			  }
			  // ******************The average score of a course for all students*****************
			  System.out.println("core C++   coreJava    Servlet    JSP     EJB");
			  for (i = 0; i < 5; i++) 
			  {
			   for (j = 0; j < 20; j++) {
			    total[i] += arr[i][i];
			   }
			   System.out.print("       " + total[i] / 20);
			  }
			 }

}
