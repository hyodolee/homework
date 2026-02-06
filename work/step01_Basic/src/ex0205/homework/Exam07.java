package ex0205.homework;

/**
 *  주제: 07번 주어진 배열 항목에서 최대값을 출력하는 문제
 *  작성일: 2026-02-05
 *  작성자: 이효도
 **/
public class Exam07 {

	public static void main(String[] args) {
		int array[] = {1,5,3,8,2};
		
		int max = 0;
		int count = array.length;
		
		for(int i=0; i < count; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("최대값 출력: " + max);
	}

}
