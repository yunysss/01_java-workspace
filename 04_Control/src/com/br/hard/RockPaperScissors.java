package com.br.hard;

import java.util.Scanner;

public class RockPaperScissors {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		String result = "";
		String winStr = "이겼습니다!";
		String drawStr = "비겼습니다.";
		String loseStr = "졌습니다ㅠ";
		
		while(true) {
			int comRan = (int)(Math.random()*3);
			
			String computer = "";
			
			switch(comRan) {
			case 0: computer = "가위"; break;
			case 1: computer = "바위"	; break;
			case 2: computer = "보"; break;
			}
			
			System.out.print("가위바위보(종료하시려면 exit입력) : ");
			String user = sc.nextLine();
			
			if(user.equals("가위") || user.equals("바위") || user.equals("보")) {
				if(computer.equals(user)) {
					result = drawStr;
					draw++;
				} else if(computer.equals("가위")) {
					switch(user) {
					case "바위":
						result = winStr;
						win++;
						break;
					case "보":
						result = loseStr;
						lose++;
						break;
						
					}
				} else if(computer.equals("바위")) {
					if(user.equals("가위")) {
						result = loseStr;
						lose++;
					} else {
						result = winStr;
						win++;
					}
				} else if(computer.equals("보")) {
					result = user.equals("가위") ? winStr : loseStr;
					if(result.equals(winStr)) {
						win++;
					} else {
						lose++;
					}
				}
				
				count++;
			} else if(user.equals("exit")) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			System.out.println("컴퓨터 : " + computer);
			System.out.println(name + " : " + user);
			System.out.println(result);
			System.out.println();
			
		}
		
		System.out.println(count + "전" + win + "승" + draw + "무" + lose + "패");
	}
	
}
