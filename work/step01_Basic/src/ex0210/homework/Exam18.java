package ex0210.homework;

class ShopService{
	
	private static ShopService t = new ShopService(); 
	
	public static ShopService getInstance() {
		return t;
	}
}

public class Exam18 {
	public static void main(String [] agrs){
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은객체");
		}else {
			System.out.println("다른객체");
		}
	}
}
