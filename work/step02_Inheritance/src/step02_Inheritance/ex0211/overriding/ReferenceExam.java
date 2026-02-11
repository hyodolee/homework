package step02_Inheritance.ex0211.overriding;

class ObjectExam{
	private String str;
	public ObjectExam(){   }
	public ObjectExam(String str){ this.str = str;  }

	@Override
	public String toString() {
		return this.str + super.toString();
	}
}

class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			ObjectExam oe1=new ObjectExam("1111");
			ObjectExam oe2=new ObjectExam("안녕");
			/**
			 * print(Object obj) or println(Object obj) 메소드는
			 * 인수전달된 객체.toString() 호출한다.
			 * toString()리턴하는 값을 출력하게 된다!
			 */
			
			System.out.println(c);//
			System.out.println(s01.toString());//
			System.out.println(s02.toString());//
			System.out.println(s03.toString());//
			System.out.println(oe1.toString());//
			System.out.println(oe2.toString());//
			
	}
}
