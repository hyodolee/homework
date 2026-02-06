package ex0205.overloading;

class Test{
	public void aa(Object ...i) {// 매개값을 0개이상 허용 /배열 처럼 사용
		System.out.println("aa call...");
		System.out.println("i = " + i);
		
		System.out.println("--------------------------");
		
		for(Object a:i) {
			System.out.println(a + " ");
		}
		System.out.println("\n----------- ");
	}
	
	public void bb(int i, String ...s) {
		
	}
}

public class MethodVariableArgsExam {

	public static void main(String[] args) {
		Test t = new Test();
		t.aa(3);
		t.aa(3,4,5);
		t.aa();
		t.aa(5,6,7);
		
		t.aa("dd", 3, true);
		
		t.bb(4, "aaa","b","c");
	}

}
