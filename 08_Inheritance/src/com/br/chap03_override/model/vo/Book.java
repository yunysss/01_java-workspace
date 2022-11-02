package com.br.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	/*
	 * * 오버라이딩
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(재작성) 하는 것
	 *   => 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하는 것
	 *   
	 * * 오버라이딩 성립 조건
	 * - 부모메소드명과 동일
	 * - 매개변수 갯수, 자료형, 순서 동일 (매개변수명은 상관없음)
	 * - 부모메소드의 반환형과 동일 (jdk버전업되면서 부모메소드 반환형의 자식자료형들까지 가능)
	 * - 부모메소드의 접근제한자보다 같거나 커야된다.
	 *   ex) 부모메소드가 protected일 경우 오버라이딩 메소드는 protected, public 가능
	 *   
	 * * @Override 어노테이션
	 * - 생략가능함, 크게 상관없음
	 * - 어노테이션 붙이는 것 권장
	 *   >> 자식메소드 기술시 오타가 있을 경우 => 오류 발생
	 *   	부모메소드가 변경 됐을 경우 => 오류 발생
	 *   >> 단지 이 메소드가 오버라이딩 된 메소드임을 알리고 싶어서
	 */
	
	@Override
	public String toString() { // Object클래스의 toString메소드 오버라이딩
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	// 주소값 비교가 아닌 각각의 필드값들을 비교해서 모든 필드값이 일치하면 true/ 하나라도 틀리면 false가 반환되도록 재정의
	@Override
	public boolean equals(Object obj) {
		
		// 외부에서 bk1.equals(bk3);
		
		//		bk1			       bk3
		//   this(현객체) vs obj(전달받은 비교대상객체)
		//		Book			 Object
		
		Book other = (Book)obj;
		
		//      this    vs      other
		if(title.equals(other.title) && author.equals(other.author) && price == other.price) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return (title + author + price).hashCode();
	}

}
