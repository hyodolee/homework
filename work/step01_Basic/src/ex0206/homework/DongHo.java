package ex0206.homework;

public class DongHo {

	public static void main(String[] args) {
        int max = 10; // 최대 동/호수

        // 1. '호'를 기준으로 하는 행 반복 (1호 ~ 10호)
        for (int ho = 1; ho <= max; ho++) {
            
            // 2. '동'을 기준으로 하는 열 반복 (1동 ~ 10동)
            for (int dong = 1; dong <= max; dong++) {
                
                // 조건: 동 번호가 호 번호보다 크거나 같을 때만 출력
                if (dong >= ho) {
                    // %d는 정수, -8s는 왼쪽 정렬된 8칸짜리 문자열을 의미 (줄 맞춤용)
                    String text = dong + "동" + ho + "호";
                    System.out.printf("%-8s", text);
                } else {
                    // 조건에 맞지 않으면 그만큼의 공백을 출력 (8칸)
                    System.out.print("        ");
                }
            }
            // 한 줄이 끝나면 줄바꿈
            System.out.println();
        }
    }
}
