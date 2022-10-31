package com.hw4.view;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		
	}
	public void mainMenu() {
		Employee emp = null;
		
		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: emp = inputEmployee(); break;
			case 2: modifyEmployee(emp); break;
			case 3: emp = null; break;
			case 4: System.out.println(emp.information()); break;
			case 9: System.out.println("프로그램을 종료합니다"); return;
			}
		}
	}
	
	public Employee inputEmployee() {
		System.out.print("사원명 : ");
		String name = sc.nextLine();
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("보너스포인트 : ");
		double bonus = sc.nextDouble();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		Employee newEmp = new Employee(name, dept, job, age, gender, salary, bonus, phone, address);
		
		return newEmp;
	}
	
	public void modifyEmployee(Employee emp) {
		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: System.out.print("변경할 이름 : ");
					emp.setEmpName(sc.nextLine()); break;
			case 2: System.out.print("변경할 급여 : ");
					emp.setSalary(sc.nextInt()); break;
			case 3: System.out.print("변경할 부서 : ");
					emp.setDept(sc.nextLine()); break;
			case 4: System.out.print("변경할 직급 : ");
					emp.setJob(sc.nextLine()); break;
			case 9: System.out.println("이전 메뉴로 돌아갑니다.");
					return;
			}
		}
	}
	

}
