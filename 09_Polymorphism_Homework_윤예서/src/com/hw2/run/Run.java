package com.hw2.run;

import com.hw2.model.vo.GalaxyNote9;
import com.hw2.model.vo.SmartPhone;
import com.hw2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for(int i=0; i<phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
	}

}
