package step02_Inheritance.ex0212.final_abstract;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam {//상속불가, 생성가능
	final int i = -999999;	// 반드시 초기화 , 값 변경불가
}

abstract class AbstractClassExam {//상속가능, 생성불가
	abstract String abstractMethodExam(int i, String s);//재정의 위한 메소드

	final int finalMethodExam(int i, int j) {//재정의 불가
		return i + j;
	}
}

class Sample01 extends AbstractClassExam {
	String abstractMethodExam(int i, String s) {
		System.out.println("return " + s + i);
		return s + i;
	}

//	int finalMethodExam(int i, int j) {// 부모의 finalMethodExam()가 final 이라 재정의 불가.
//		return i * j;
//	}

}

class Sample02 //extends FinalClassExam 
{//FinalClassExam가 final 이라 상속불가
}

abstract class Sample03 extends AbstractClassExam {
	String abstractMethodExam(String s, int i) {// abstractMethodExam() 메소드가 중복 선언되어 있음
		return s + i;
	}

	abstract String abstractMethodExam(int i, String s); 

	void sampleMethod03() {
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest {
	public static void main(String args[]) {
		//AbstractClassExam ace = new AbstractClassExam();
		FinalClassExam fce = new FinalClassExam();
		//fce.i = 100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700, "_999");
	}
}
