package com.ibm.dst.java.traning.test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 根据用户输入，输出“偶数”或者“奇数” 
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter a number or enter 'quit' to exit");
			String num = scanner.nextLine();
			if (num.matches("\\d+")) {
				if (Integer.parseInt(num) % 2 == 0
						|| Integer.parseInt(num) == 0) {
					System.out.println(num + "是偶数");
				} else if (Integer.parseInt(num) % 2 == 1) {
					System.out.println(num + "是奇数");
				}
			}

			else if(num.equals("quit")){
				break;
			}
			else 
				System.out.println("这玩意不是奇数也不是偶数，亲请认真一点好么");

		}

	}

}
