package ex0204.homework;

import java.util.Arrays;
import java.util.Scanner;

class ScoreFunction{
	private int getTotal(int kor, int eng, int math) {
		return (kor + eng + math);
	}
	
	private double getAvg(int total, int count) {
		return (double)(total/count);
	}
	
	/**
	 *  등급구하기
	 *  @param : 평균
	 *  @return : 등급
	 **/
	private char getGrade(int average) {
		char grade = switch(average/10) {
			case 9,10 -> grade = 'A'; 
			case 8 -> grade = 'B';
			case 7 -> grade = 'C';
			case 6 -> grade = 'D';
			default -> grade = 'F';
		};
		
		return grade;
	}
	
	public void showRst(String name, int kor, int eng, int math) {
		int total = getTotal(kor, eng, math);
		double average = getAvg(total, 3);
		char grade = getGrade((int)average);
		
		System.out.println(name + " 님 총점은: " + total + ", 평균은:" + average + ", 등급은: " + grade);
		
	}
}

public class ScoreExamVer02 {

	public static void main(String[] args) {
		String name = "";
		int kor, eng, math;
		ScoreFunction scoreFunction = new ScoreFunction(); 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.println("-------------------------------------");
			 System.out.println("1.성적표 구하기 | 2.종료 ");
			 System.out.println("-------------------------------------");
			 System.out.print("선택> ");
			 
			 int choice = sc.nextInt();
			 
			 switch(choice) {
				 case 1 : 
					System.out.println("국어 점수 입력:");
					kor = sc.nextInt();
					System.out.println("영어 점수 입력:");
					eng = sc.nextInt();
					System.out.println("수학 점수 입력:");
					math = sc.nextInt();
					System.out.println("이름 입력:");
					name = sc.nextLine();
					
					scoreFunction.showRst(name,kor,eng,math);
				    break;
				 case 2 : 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);//프로그램 종료
				  break;
				 default : 
					System.out.println("1과 2중에 알맞은 값을 입력해 주세요");
				  break;
			 }
		}
	
	}

}