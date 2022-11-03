package com.br.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public String toString() {
		return "people : " + people;
	}
	
	// 추상메소드 (미완성된메소드)
	public abstract void rule();

	// 추상메소드를 추가하는 순간 => 추상클래스로 적용하기
	
}
