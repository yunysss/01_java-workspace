package list.controller;

import java.util.ArrayList;

import list.model.vo.Book;

public class BookController {
	
	// 도서들을  담고 있는 bookList
	private ArrayList<Book> bookList = new ArrayList<Book>();
	{
		// 초기값 4개정도 추가
		bookList.add(new Book("자바의 정석", "홍길동", "기타", 20000));
		bookList.add(new Book("C언어", "김말똥", "기타", 15000));
		bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
		bookList.add(new Book("여러분", "BR", "의료", 10000));
	}
	
	
	public String insertBook(String title, String author, int category, int price) {
		/*
		 * 1. 전달받은 값들을 가지고 매개변수 생성자를 이용하여 Book 객체 생성 
		 *    (단, 객체 생성 시  유의사항 :장르 번호별로 조건식 이용해서 장르번호가 아닌 장르명을 전달하면서 생성!)
		 * 2. bookList에 1번과정에서 생성된 Book객체 추가
		 */
		String str = "";
		switch(category) {
		case 1: str = "인문"; break;
		case 2: str = "자연과학"; break;
		case 3: str = "의료"; break;
		case 4: str = "기타"; break;
		}
		
		if(!str.equals("")) {		
			bookList.add(new Book(title, author, str, price));
		}
		return str;
	}
	
	
	public ArrayList<Book> selectList(){
		/*
		 * 1. 해당 bookList 반환
		 */
		
		return bookList; 	// 이 부분 수정해야되요~! 우선은 null로 해놨어요
	}
	
	
	public ArrayList<Book> searchBook(String keyword){
		/*
		 * 1. 검색 결과 리스트를 담아줄 리스트(ArrayList<Book> searchList) 선언 및 생성
		 * 2. 반복문을 통해 bookList의 책들 중 책명에 전달받은 keyword가 "포함 되어있는 경우" 
		 *    searchList에 해당 Book객체 "추가"하기 
		 * 
		 * 3. searchList 반환
		 */
		
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book b: bookList) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;   // 이 부분 수정해야되요~! 우선은 null로 해놨어요
	}
	
	public int deleteBook(String title, String author) {
		/*
		 * 1. 사용자가 입력한 도서명과 저자명이 일치할 경우 성공적으로 삭제 될 것이고, 그게 아닐 경우 삭제할 도서를 찾지 못한 경우이다.
		 *    그래서 이를 처리하기 위한 result 변수를 0으로 초기화 한 채로 만들어 두자.
		 * 2. 반복문을 통해 bookList의 책들 중 책명이 전달받은 title과 동일하고, 저자명이 전달받은 author와 동일한 경우 
		 *    해당 인덱스의 도서 "삭제"하고 result 1로 변경 후 빠져나가기(더이상 반복문을 돌릴 필요없으니깐 break!)
		 * 
		 * 3. result 값 반환
		 */
		int result = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				bookList.remove(i);
				result++;
			}
		}
		return result;   // 이 부분 수정해야되요~! 우선은 0으로 해놨어요
	}
	
	public int updateBook(String title, String upTitle, String upAuthor, int upCategory, int upPrice) {
		int result = 0;
		String str = "";
		switch(upCategory) {
		case 1: str = "인문"; break;
		case 2: str = "자연과학"; break;
		case 3: str = "의료"; break;
		case 4: str = "기타"; break;
		}
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title)) {
				bookList.set(i, new Book(upTitle, upAuthor, str, upPrice));
				result++;
			}
		}
		return result;
	}
	
	public ArrayList<Book> searchBook(int menu, String keyword) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book b : bookList) {
			switch(menu) {
			case 1:
				if(b.getTitle().contains(keyword)) {
					searchList.add(b);
				} break;
			case 2:
				if(b.getAuthor().contains(keyword)) {
					searchList.add(b);
				} break;
			case 3:
				if(b.getCategory().contains(keyword)) {
					searchList.add(b);
				} break;
			case 4:
				if(String.valueOf(b.getPrice()).contains(keyword)) {
					searchList.add(b);
				}
			}
		}
		
		return searchList;
	}
	
}
