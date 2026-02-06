package ex0205.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  주제: 09번 학생들의 점수를 분석하는 프로그램
 *  작성일: 2026-02-05
 *  작성자: 이효도
 **/

class ScoreFunction{
	int studentCount = 0;
	int scores[];
	
	/**
	 *  학생수 출력
	 *  @param : 
	 *  @return :  학생수
	 **/
	public int getStudentNum() {
		return this.studentCount;
	}
	
	/**
	 *  학생수 입력
	 *  @param : 점수들
	 *  @return : 
	 **/
	public void setStudentNum(int num) {
		this.studentCount = num;
	}
	
	/**
	 *  점수 입력
	 *  @param : 점수들
	 *  @return : 
	 **/
	public void setScore(int ...scores) {
		this.scores = new int [studentCount]; 
		
		for(int i = 0; i < scores.length; i++){
			this.scores[i] = scores[i];
		}
	}
	
	/**
	 *  점수 리스트 출력
	 *  @param : 
	 *  @return : 
	 **/
	public void showScore() {
		for(int i = 0; i < scores.length; i++){
			System.out.println("scores[" + i + "]: " + this.scores[i]);
		}
	}	
	
	/**
	 *  최고점수 평균점수 출력
	 *  @param : 
	 *  @return : 
	 **/
	public void showMaxAvgScore() {
		int max = 0, avg = 0, total = 0;
		int scoreLth = scores.length;
		
		for(int i = 0; i < scoreLth; i++){
			total += this.scores[i];
			
			if(max < this.scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("최고 점수: " + max);
		System.out.println("평균 점수: " + total/scoreLth);
	}	

}

public class Exam09 {

	public static void main(String[] args) {
		int count;
		
		ScoreFunction scoreFunction = new ScoreFunction(); 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.println("-------------------------------------");
			 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			 System.out.println("-------------------------------------");
			 System.out.print("선택> ");
			 
			 int choice = sc.nextInt();
			 
			 switch(choice) {
				 case 1 : 
					System.out.println("학생수 입력:");
					count = sc.nextInt();
					scoreFunction.setStudentNum(count);	
				    
					break;
				 case 2 : 
					 int stNum = scoreFunction.getStudentNum();
					 int scores[] = new int[stNum] ;
					 
					for(int i =0; i < stNum; i++) {
						System.out.println("scores[" + i + "]점수 입력:");
						scores[i] = sc.nextInt();
					}
					scoreFunction.setScore(scores);
						
				    break;
				 case 3 : 
					scoreFunction.showScore();
				
				    break;
				 case 4 : 
					scoreFunction.showMaxAvgScore();
					
				    break;
				 case 5 : 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);//프로그램 종료
				  break;
				 default : 
					System.out.println("1에서 5중에 알맞은 값을 입력해 주세요");
				  break;
			 }
		}
	
	}

}