package ex0205.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  주제: 오름차순으로 정렬하는 알고리즘
 *  작성일: 2026-02-05
 *  작성자: 이효도
 **/
// 이 과제 그냥 넘어가는줄 알고 주저리주저리 주석달아가면서 미리 해놨어요 ㅠㅠ 고의 는 아니었습니다. ㅠㅠ
public class AscExam {

	public static void main(String[] args) {
		int arr [] = {5,7,1,2};

		//선택 정렬알고리즘
		// 1바퀴 : 5,7 비교 -> 5,1 비교후 1,5교환 -> 1,2 비교,  결과{1,5,7,2}
		// 2바퀴 : 5,7 비교 -> 5,2 비교후 5,2 교환,  결과{1,2,7,5}
		// 3바퀴 : 7,5 비교후 7,2 교환,  결과{1,2,5,7}
		// for(int	i=0; i < arr.length; i++) {
		// 	for(int j = i+1; j < arr.length; j++) {
		// 		if(arr[i] > arr[j]) {
		// 			int temp = arr[i];
		// 			arr[i] = arr[j];
		// 			arr[j] = temp;
		// 		}
		// 	}
		// }

		//버블 정렬알고리즘
		// 1바퀴 : 5,7 비교 -> 7,1 비교후 1,7교환 -> 7,2 비교후 2,7교환,  결과{5,1,2,7}
		// 2바퀴 : 5,1 비교후 교환 -> 5,2 비교후 2,5교환 -> 5,7 비교,  결과{1,2,5,7}
		// 3바퀴 : 1,2 비교,  결과{1,2,5,7}
		// for(int i = 1; i <= arr.length; i++) {
		// 	for(int j = 1; j <= arr.length - i; j++) {
		// 		if(arr[j-1] > arr[j]) {
		// 			int temp = arr[j-1];
		// 			arr[j-1] = arr[j];
		// 			arr[j] = temp;
		// 		}
		// 	}
		// }
		
		//삽입 정렬알고리즘
		// 1바퀴 : key값 7 (인덱스 1번값)
		// 배열의 0번째값 5와 key값 비교 -> key값이 더 커서 교환없음,  결과{5,7,1,2}
		// 2바퀴 : key값 1 (인덱스 2번값)
		// 배열의 1번째값 7과 key값 비교 -> key값이 더 작아서 7을 오른쪽으로 밀어냄,
		// 배열의 0번째값 5와 key값 비교 -> key값이 더 작아서 5를 오른쪽으로 밀어냄,   결과 {1,5,7,2}  
		// 3바퀴 : key값 2 (인덱스 3번값)
		// 배열의 2번째값 7과 key값 비교 -> key값이 더 작아서 7을 오른쪽으로 밀어냄,
		// 배열의 1번째값 5와 key값 비교 -> key값이 더 작아서 5를 오른쪽으로 밀어냄,
		// 배열의 0번째값 1과 key값 비교 -> key값이 더 커서 교환없음,  결과{1,2,5,7}

		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			// 예를들어 0번째 원소 1번째 원소 비교후 0번째 원소가 더 크다면 데이터는 오른쪽으로 밀려난다.
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}