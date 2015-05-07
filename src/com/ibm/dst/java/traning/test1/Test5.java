package com.ibm.dst.java.traning.test1;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 编写一个程序计算正整数的约数
		int x=100;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				System.out.println(i);

		}

	}

}
