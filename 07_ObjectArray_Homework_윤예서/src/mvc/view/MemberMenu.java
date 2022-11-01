package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("\n====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAllMember(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	
	public void insertMember() {
		if(mc.getMemberCount() == mc.SIZE) {
			return;
		}
		
		System.out.print("아이디 : ");
		String newId = sc.nextLine();
		Member result = mc.checkId(newId);
		
		if(result != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		} else {
			System.out.print("비밀번호 : ");
			String newPw = sc.nextLine();
			System.out.print("이름 : ");
			String newName = sc.nextLine();
			System.out.print("나이 : ");
			int newAge = sc.nextInt();
			sc.nextLine();
			System.out.print("성별 : ");
			char newGender = sc.nextLine().charAt(0);
			System.out.print("이메일 : ");
			String newEmail = sc.nextLine();
			
			Member m = new Member(newId, newPw, newName, newAge, newGender, newEmail);
			mc.insertMember(m);
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}		
	}
	
	public void searchMember() {
		
		while(true) {
			System.out.println("\n====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu == 9) {
				return;
			}
			System.out.print("검색 내용 :");
			String search = sc.nextLine();
			
			
			Member m = mc.searchMember(menu, search);
			if (m == null) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				System.out.println(m.information());
			}
		}		
	}
	
	public void updateMember() {
		
		while(true) {
			System.out.println("\n====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu == 9) {
				return;
			}
			System.out.print("변경할 회원 아이디 :");
			String userId = sc.nextLine();
			
			
			Member m = mc.checkId(userId);
			if(m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.print("변경내용 : ");
				String update = sc.nextLine();
				mc.updateMember(m, menu, update);
				System.out.println("회원의 정보가 변경되었습니다.");
			}			
		}	
	}
	
	public void deleteMember() {
		
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if(m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else {
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("y")) {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
		}
	}
	
	public void printAllMember() {
		
		Member[] mem = mc.getMem();
		for(int i=0; i<mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
		
	}

}
