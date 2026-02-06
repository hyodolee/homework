package ex0205.homework;

/**
 *  주제: 08번 주어진 배열 항목에서 전체합과 평균을 구해 출력하는 코드 작성
 *  작성일: 2026-02-05
 *  작성자: 이효도
 **/
public class Exam08 {

	public static void main(String[] args) {
		int array[][] = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total = 0, average = 0, count = 0;
		int cnt1 = array.length;
		int cnt2 = 0;
		
		
		for(int i=0; i < cnt1; i++) {
			cnt2 = array[i].length;
			for(int j=0; j < cnt2; j++) {
				total += array[i][j]; 
				count += 1;
			}
		}
		
		System.out.println("합계 출력: " + total);
		System.out.println("평균 출력: " + (total*1.0)/count);
		
	}

}
