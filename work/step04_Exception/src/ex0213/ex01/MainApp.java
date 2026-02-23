package ex0213.ex01;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		//int cnt = 0;
		int num;
		
		ShoppingMall sm = new ShoppingMall();
	
		Random r = new Random(); 
		for(int i =0; i < 10; i++) {
			//num = (int)(Math.random() * 55) + 1;
			num = r.nextInt(55)+1;
			try {
				sm.setAge(num);
				System.out.println(num + " 입장하신걸 환영합니다.");
			} catch (ShoppingException e) {
				//cnt++;
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("예외: " + ShoppingException.age);
	}
}

