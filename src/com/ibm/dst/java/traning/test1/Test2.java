package com.ibm.dst.java.traning.test1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 有3个整型变量a,b,c，编写程序求3个数中的最大值
		int a=1;
		int b=4;
		int c=3;
		int temp;
	
	   temp=a>b?(a>c?a:c):(b>c?b:c);
	   
	   System.out.println(temp);
	}

}
