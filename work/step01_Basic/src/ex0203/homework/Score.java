package ex0203.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		String name = "hyodo";
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int totalScore = 0;
		int average = 0;
		char grade = 'F';
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("국어 점수 입력");
//		kor = sc.nextInt();
//		System.out.println("영어 점수 입력");
//		eng = sc.nextInt();
//		System.out.println("수학 점수 입력");
//		math = sc.nextInt();
		
		System.out.println("국어 점수 입력");
		kor = (int)(Math.random() * (100 - 45 + 1)) + 45;
		System.out.println("영어 점수 입력");
		eng = (int)(Math.random() * (100 - 45 + 1)) + 45;
		System.out.println("수학 점수 입력");
		math = (int)(Math.random() * (100 - 45 + 1)) + 45;
		
		totalScore = kor + eng + math;
		average = totalScore/3;
		
//		switch(average/10) {
//			case 9 -> {
//				grade = 'A';
//			}
//			case 8 -> {
//				grade = 'B';
//			}
//			case 7 -> {
//				grade = 'C';
//			}
//			case 6 -> {
//				grade = 'D';
//			}
//			default -> {
//				grade = 'F';
//			}
//		}
		
//		grade = switch(average/10) {
//			case 9,10 -> grade = 'A'; 
//			case 8 -> grade = 'B';
//			case 7 -> grade = 'C';
//			case 6 -> grade = 'D';
//			default -> grade = 'F';
//		};
		
		if(average >= 90) {
			grade = 'A';
		}else if(average >= 80){
			grade = 'B';
		}else if(average >= 70){
			grade = 'C';
		}else if(average >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("이름:," + name + " 국어:," + kor + " 영어:," + eng + " 수학:," + math + " 총점:," + totalScore + " 평균:," + average +" 학점:," + grade);
		
	}

}