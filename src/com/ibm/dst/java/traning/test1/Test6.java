package com.ibm.dst.java.traning.test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. �����û����룬�����ż�������ߡ�������
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter a number or enter 'quit' to exit");
			String num = scanner.nextLine();
			if (num.matches("\\d+")) {
				if (Integer.parseInt(num) % 2 == 0
						|| Integer.parseInt(num) == 0) {
					System.out.println(num + "��ż��");
				} else if (Integer.parseInt(num) % 2 == 1) {
					System.out.println(num + "������");
				}
			}

			else if(num.equals("quit")){
				break;
			}
			else 
				System.out.println("�����ⲻ������Ҳ����ż������������һ���ô");

		}

	}

}
