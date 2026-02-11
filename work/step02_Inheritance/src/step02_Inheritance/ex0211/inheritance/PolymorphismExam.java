package step02_Inheritance.ex0211.inheritance;

class CarCenter{
	public void engineer(Car cd){
		System.out.print("cd주소 = " + cd);
		//System.out.print("cd.i = " + cd.i);//부모타입으로는 자식 부분 접근 불가
		EfSonata efs = (EfSonata) cd; //부모 > 자식
		System.out.print("efs주소 = " + efs);
		
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		
		System.out.println("ef주소 = " + ef);
		System.out.println("ef.i = " + ef.i);
		
//		cc.engineer(c);//
//		cc.engineer(ef);//
//		cc.engineer(ca);//
//		cc.engineer(ex);//
		
		
	
	}
}
