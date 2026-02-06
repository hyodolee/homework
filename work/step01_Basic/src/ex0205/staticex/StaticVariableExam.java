package ex0205.staticex;

class Test{
	int a;
	static int b;
	
	//non static 메소드 에서 static, non static 접근가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(Test.b);
		
	}
	
	public void bb() {
		// 메소드 호출
		aa();
		this.aa();
		
		cc();
		this.cc();
	}

	//static 메소드 에서는 staic 만 접근, this 사용불가
	public static void cc() {
//		System.out.println(a);
//		System.out.println(this.a);
		
		System.out.println(b);
//		System.out.println(this.b);
		System.out.println(Test.b);
	}

	public static void dd() {
//		aa();
//		this.aa();
		
		cc();
//		this.cc();
	}
}

public class StaticVariableExam {
	static {
		System.out.println("난 main 보다 먼저 실행됨");
	}

	public static void main(String[] args) {
		System.out.println("메인 시작");
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
		
		System.out.println("---non static 접근-----");
		System.out.println("t1.a=" + t1.a);
		System.out.println("t2.a=" + t2.a);
		System.out.println("t3.a=" + t3.a);
		
		t2.a = 100;
		System.out.println("---변경후 접근-----");
		System.out.println("t1.a=" + t1.a);
		System.out.println("t2.a=" + t2.a);
		System.out.println("t3.a=" + t3.a);
		
		System.out.println("---static 접근-----");
		System.out.println("t1.b=" + t1.b);
		System.out.println("t2.b=" + t2.b);
		System.out.println("t3.b=" + t3.b);
		
		t2.b = 50;
		System.out.println("---변경후 접근-----");
		System.out.println("t1.b=" + t1.b);
		System.out.println("t2.b=" + t2.b);
		System.out.println("t3.b=" + t3.b);
	}

}
