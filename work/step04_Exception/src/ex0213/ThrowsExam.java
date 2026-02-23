package ex0213;

class Test{
	public void aa(int i) {
		System.out.println("aa 시작 ...");
		try {
			this.bb(i);
		}catch(ArithmeticException e){
			System.out.println("0으로 나누면 안되요!! = " + e.getMessage());
		}
		System.out.println("aa 끝....");
	}
	
	public void bb(int i) {
		System.out.println("bb 시작");
		int result = 100/i; //ArithmeticException 가능성이 있는 코드
		System.out.println("result = " + result);
		System.out.println("bb끝");
	}
}

public class ThrowsExam {
	public static void main(String[] args) {
		System.out.println("************* 메인시작 *************");
		
		new Test().aa(0);
		
		System.out.println("************* 메인 끝 *************");
		
	}
}
