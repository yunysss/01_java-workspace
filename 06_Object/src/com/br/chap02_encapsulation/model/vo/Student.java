package com.br.chap02_encapsulation.model.vo;

public class Student {
	
	/*
	 * 1. 필드부
	 *    
	 *    필드 == 멤버변수 == 인스턴스변수
	 *    
	 *    <표현법>
	 *    접근제한자 [예약어] 자료형 변수명;
	 *    
	 *    
	 */
	private String name; // private => 같은 클래스 내에서만 접근 가능(정보 은닉)
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	
	/*
	 * 2. 생성자부
	 *    객체를 생성하기 위한 일종의 메소드
	 *    
	 *    <표현법>
	 *    접근제한자 클래스명() {
	 *    
	 *    }
	 */
	
	/*
	 * 3. 메소드부
	 *    기능을 구현하는 부분
	 *    
	 *    <표현법>
	 *    접근제한자 [예약어] 반환형 메소드명([매개변수]) {
	 *    
	 *    }
	 */
	// - setter 메소드
	//   해당 필드에 대입시키고자 하는 값 전달받아
	//   해당 필드에 대입시켜주는 기능의 메소드
	/*
	public void setName(String newName) { // String newName = "홍길동";
		// 매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수(메소드 내에서만 사용 가능)
		name = newName;
	}
	*/
	//                 필드명
	// setter메소드명은 setXXX으로 낙타표기법을 지킨채로 지어주기 ex) setName, setAge, ...
	public void setName(String name) {
		//name = name; // 매개변수name = 매개변수name;
		
		// 필드name = 매개변수name; 원함
		this.name = name; // this에는 해당 객체의 주소값이 담겨있음
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter메소드
	//   해당 필드에 담긴값을 반환해주는 역할을 수행
	
	public String getName() { // 반환하고자하는 값의 자료형을 반환형 자리에 기재
		return name; // 필드가 반환 x => 필드에 담긴 값이 반환
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	
	
	
	
	

}
