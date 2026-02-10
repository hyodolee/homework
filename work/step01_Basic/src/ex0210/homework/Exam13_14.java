package ex0210.homework;

class Member{
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

public class Exam13_14{
	public static void main(String [] agrs){
		Member user1 = new Member("홍길동","hong");
	}
}
