package com.br.hard;

import java.util.Scanner;

public class UpAndDown {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 10 + 1);
		
		int count = 0;
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int user = sc.nextInt();
			
			if(user >= 1 && user <= 100) {
				if(user != random) {
					if(user > random) {
						System.out.println("Down!");
					} else {
						System.out.println("Up!");
					}
					count++;
				} else {
					count++;
					System.out.println("정답입니다!");
					break;
				}
			} else {
				System.out.println("1~100 사이의 숫자를 입력하세요.");
			}
		}
		System.out.println(count + "회만에 맞추셨습니다!");
	}
}
