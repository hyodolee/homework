package ex0205.array;

class MultiArray{
//정수형 2차원 배열 8*9
	int arr[][] = new int [8][9];
	
	int [][] arr2 = new int [][] {
		{1,3,4},
		{2,4,6,8,10},
		{2}
	};

	public void array99() {
		for(int row =0; row < arr2.length; row++) {
			for(int col =0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col]);
			}
			System.out.println();
		}

		for(int i =0; i < 8; i++) {
			int num1 = i+2;
			for(int j =0; j < 9; j++) {
				arr[i][j] = num1*(j+1); 
			}
		}
		
		for(int i =0; i < 8; i++) {
			for(int j =0; j < 9; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----개선된 코딩 ----------------------");
		for(int i[] : arr) {
			for(int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
		
}
public class MemoryApart{
	public static void main(String[] args) {
		MultiArray m = new MultiArray();
		m.array99();
	}
}

