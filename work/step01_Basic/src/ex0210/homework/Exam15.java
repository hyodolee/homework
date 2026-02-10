package ex0210.homework;

class MemberService{
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

public class Exam15 {
	public static void main(String [] agrs){
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("id 또는 password 가 올바르지 않습니다.");
		}
		memberService.logout("hong");
	}
}
