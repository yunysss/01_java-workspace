package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		st[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		st[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		for(Student s : st) {
			System.out.println(s);
		}
		
		Employee[] emp = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			
			emp[count++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("계속 추가하시겠습니까? : ");
			String str = sc.nextLine().toUpperCase();
			
			if(str.equals("Y")) {
				continue;
			} else if(str.equals("N")) {
				break;
			}		
		
		}
		for(int i=0; i<count; i++) {
			System.out.println(emp[i]);
		}
	}

}
