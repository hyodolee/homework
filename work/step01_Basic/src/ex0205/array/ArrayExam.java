package ex0205.array;

class ArrayFunction{
//	public void printArrayValue01(int [] ints, double [] doubles, char [] chars, boolean [] booleans, String [] Strings) {
	public void printArrayValue01(Object ...obj) {
		int cnt = 5;
		for(int i =0; i < cnt; i++) {
//			System.out.println("int[" + i +"]출력" + ints[i]);
//			System.out.println("double[" + i+ "] 출력" + doubles[i]);
//			System.out.println("char[" + i +"] 출력" + chars[i]);
//			System.out.println("boolean[" + i + "] 출력" + booleans[i]);
//			System.out.println("String[" + i +"] 출력" + Strings[i]);
			System.out.println("int[" + i +"]출력" + obj[i]);
			System.out.println("double[" + i+ "] 출력" + obj[i]);
			System.out.println("char[" + i +"] 출력" + obj[i]);
			System.out.println("boolean[" + i + "] 출력" + obj[i]);
			System.out.println("String[" + i +"] 출력" + obj[i]);
		}
	}
	
	public void printArrayValue02(int [] ints, double [] doubles, char [] chars, boolean [] booleans, String [] Strings) {
		int cnt = ints.length;
		for(int i =0; i < cnt; i++) {
			ints[i] = i;
			doubles[i] = (double)i;
			chars[i] = 'a';
			booleans[i] = true;
			Strings[i] = "A";
		}
	}
	
	public void printArrayValue03(int [] ints, double [] doubles, char [] chars, boolean [] booleans, String [] Strings) {
		System.out.println("printArrayValue03-------------------");
		this.printArrayValue01(ints,doubles,chars,booleans,Strings);
	}
}

class ArrayExam{
	public static void main(String [] agr){
		//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
		int [] ints = new int[5];
		double [] doubles = new double[5];
		char [] chars = new char[5];
		boolean [] booleans = new boolean[5];
		String [] Strings = new String[5];
	
		ArrayFunction arrayFunction = new ArrayFunction();
		
		//메소드 : printArrayValue01	
		//위의 배열들에 자동으로 초기화 된값을 출력하세요
		arrayFunction.printArrayValue01(ints,doubles,chars,booleans,Strings);
	
		//메소드 : printArrayValue02	
		//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
		arrayFunction.printArrayValue02(ints,doubles,chars,booleans,Strings);
		
		//메소드 : printArrayValue03	
		//새롭게 할당된값을 출력하세요
		arrayFunction.printArrayValue03(ints,doubles,chars,booleans,Strings);
		
		//메인메소드에서
		//ArrayExam의 메소드들을 순서대로 호출하세요.
	}
}