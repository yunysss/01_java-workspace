package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		/*
		Animal[] ani = new Animal[5]; 
		ani[0] = new Dog("보리", "푸들", 3);
		ani[1] = new Cat("홀랭", "코숏", "서울", "치즈");
		ani[2] = new Dog("동동", "푸들", 5);
		ani[3] = new Cat("마린", "코숏", "통영", "삼색");
		ani[4] = new Cat("꾸꾸", "코숏", "통영", "치즈");
		
		for(int i=0; i<ani.length; i++) {
			ani[i].speak();
		}
		*/
		
		ArrayList<Animal> list = new ArrayList<>();

		list.add(new Dog("보리", "푸들", 3));
		list.add(new Cat("홀랭", "코숏", "서울", "치즈"));
		list.add(new Dog("동동", "푸들", 5));
		list.add(new Cat("마린", "코숏", "통영", "삼색"));
		list.add(new Cat("꾸꾸", "코숏", "통영", "치즈"));
		
		for(Animal a : list) {
			a.speak();
		}
	}

}
