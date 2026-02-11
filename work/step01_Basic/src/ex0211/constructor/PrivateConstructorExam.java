package ex0211.constructor;

class Test{
	
	private static Test t = new Test();
	
	//외부에서 객체를 직접 생성하지 못하도록 막음
	private Test() {}
	/**
	 *  현재 객체를 직접 생성해서 리턴해 주는 메소드 제공!!
	 */
	public static Test getInstance() {
		//return new Test();
		return t;
	}
}

public class PrivateConstructorExam {

	public static void main(String[] args) {
		//new Test();
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
	}

}
