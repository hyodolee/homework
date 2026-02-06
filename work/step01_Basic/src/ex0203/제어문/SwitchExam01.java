package ex0203.제어문;

import java.util.Arrays;

public class SwitchExam01 {

	public static void main(String[] args) {
		Integer[] arr = {4,6,9,11};
		
		// 1~12사이의 난수를 발생한다.
		double nansu = Math.random()*12+1;
		System.out.println(nansu);
		
		int month = (int)nansu;
		System.out.println(month);
		
		int num1 = 0;
		int num2 = 0;
		
		if(month == 2) {
			num1 = 28;
//		}else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
		}else if(Arrays.asList(arr).contains(month)){
			num1 = 30;
		}else {
			num1 = 31;
		}
		
		switch(month) {
			case 2 -> {
				num2 = 28;
			}
			case 4,6,9,11 -> {
				num2 = 30;
			}
			default -> {
				num2 = 31;
			}
		}
		
		System.out.println(month +"월은 " + num1+ "일까지 있습니다.");		

	}

}
