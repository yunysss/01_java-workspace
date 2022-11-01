package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
	mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
	mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
	mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
	mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
	mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
	memberCount = 5;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		Member m = null;
		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)){
				m = mem[i];
			}
		}
		return m;
	}
	
	public void insertMember(Member m) {
		mem[memberCount++] = m;
	}
	
	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		
		for(int i=0; i<memberCount; i++) {
			switch(menu) {
			case 1: 
				if(mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				} break;
			case 2: 
				if(mem[i].getName().equals(search)) {
					searchMember = mem[i];
				} break;
			case 3:
				if(mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}			
		}
		return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		for(int i=0; i<memberCount; i++) {
			switch(menu) {
			case 1: 
				mem[i].setUserPwd(update);
				break;
			case 2: 
				mem[i].setName(update);
				break;
			case 3:
				mem[i].setEmail(update);
			}
						
		}
	}
	
	public void deleteMember(String userId) {

		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				mem[i] = null;
				mem[i] = mem[i+1];
				memberCount--;
			}
		}
	}

}
