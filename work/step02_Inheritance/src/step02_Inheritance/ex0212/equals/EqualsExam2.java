package step02_Inheritance.ex0212.equals;

class EqualsExam2{
	String stringObject;
	
	public EqualsExam2(String s){
		stringObject = s;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof EqualsExam2) {
//			EqualsExam2 ex2 = (EqualsExam2) obj;
//			
//			return stringObject.equals(ex2.stringObject);
//		}
//		return true;
//	}
	
	public static void main(String args[]){		
		System.out.println("\nEqualsExam ee1 = new EqualsExam(\"Object.equals()\");" );
		System.out.println("\nEqualsExam ee2 = new EqualsExam(\"Object.equals()\");" );
				
		EqualsExam2 ee1 = new EqualsExam2("Object.equals()");
		EqualsExam2 ee2 = new EqualsExam2("Object.equals()");
		
		ee2.stringObject = "aa";
		
		if(ee1.equals(ee2)){//Object에 정의된 equals호출 -주소값비교
			System.out.println("ee1.equals(ee2) = true");
		}else{
			System.out.println("ee1.equals(ee2) = false");
		}
//		
//		if(ee1 == ee2){// ee1과 ee2의 주소값 비교
//			System.out.println("(ee1 == ee2) = true");
//		}else{
//			System.out.println("(ee1 == ee2) = false");
//		}
//		
//		System.out.println("\nString s1 = \"new String Object1\";");
//		System.out.println("\nString s2 = \"new String Object1\";");
//		
//		String s1 = "new String Object1";
//		String s2 = "new String Object1";
//		
//		if(s1.equals(s2)){// s1과 s2의 값 비교
//			System.out.println("s1.equals(s2) = true");
//		}else{
//			System.out.println("s1.equals(s2) = false");
//		}
//		
//		if(s1==s2){// s1과 s2의 값 비교
//			System.out.println("(s1==s2) = true");
//		}else{
//			System.out.println("(s1==s2) = false");
//		}
//
//		System.out.println("\nString s3 = new String(\"new String Object2\");");
//		System.out.println("\nString s4 = new String(\"new String Object2\");");
// 
// 		String s3 = new String("new String Object2");
//		String s4 = new String("new String Object2");
//		
//		if(s3.equals(s4)){//s3 에 Object에 정의된 equals 호출하여 s4랑 같은지 비교
//			System.out.println("s3.equals(s4) = true");
//		}else{
//			System.out.println("s3.equals(s4) = false");
//		}
//		
//		if(s3==s4){// s3와 s4의 주소값 비교
//			System.out.println("(s3==s4) = true");
//		}else{
//			System.out.println("(s3==s4) = false");
//		}
//
//		System.out.println("\nString s5 = new String(\"new String Object3\");");
//		System.out.println("\nString s6 = \"new String Object3\";");
//		System.out.println("\nString s7 = \"new String Object3\";");
// 
// 		String s5 = new String("new String Object3");
//		String s6 = "new String Object3";
//		String s7 = "new String Object3";
//		
//		if(s5.equals(s6)){// s5에 Object에 정의된 equals 호출하여 s6랑 같은지 비교
//			System.out.println("s5.equals(s6) = true");
//		}else{
//			System.out.println("s5.equals(s6) = false");
//		}
//		
//		if(s5==s6){//s5와 s6주소값 비교
//			System.out.println("(s5==s6) = true");
//		}else{
//			System.out.println("(s5==s6) = false");
//		}
//
//			
//		if(s6.equals(s7)){// s6에 Object에 정의된 equals 호출하여 s7랑 같은지 비교
//			System.out.println("s6.equals(s7) = true");
//		}else{
//			System.out.println("s6.equals(s7) = false");
//		}
//		
//		if(s6==s7){//s6와 s7주소값 비교
//			System.out.println("(s6==s7) = true");
//		}else{
//			System.out.println("(s6==s7) = false");
//		}
	}
}
