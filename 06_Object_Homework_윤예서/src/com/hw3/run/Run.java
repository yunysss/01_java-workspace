package com.hw3.run;

import com.hw3.controller.Function;

public class Run {

	public static void main(String[] args) {
		
		Function f = new Function();
		f.printLottoNumbers();
		f.outputChar(5, 'a');
		System.out.println();
		System.out.println("3. 랜덤 영문자 출력 : " + f.alphabette());
		System.out.printf(f.mySubstring("apple", 2, 4));
	}

}
