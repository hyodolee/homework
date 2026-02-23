package step04_Exception.ex0213;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("***메인 시작*********************");
		System.out.println("args =" + args);

		try {
			System.out.println("args [0] =" + args[0]);
			
			int convertNo = Integer.parseInt(args[0]);
			System.out.println("변환 값 = " + convertNo);
			
			int result = convertNo/0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외가 발생했을때 해야 할 일
			System.out.println("인수 전달해주세요. " + e);
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해주세요. " + e);
		}catch(Exception e) {
			//이외의 모든 예외는 여기서 처리한다.
			System.out.println("예외가 발생했어요~~");
			
			//개발자가 개발할때 예외에 대한 정보를 추적(디버깅) 할때 사용한다.
			//반드시 배포(production환경)에서는 제거해야한다.
			e.printStackTrace();//예외정보를 detail하게 stack에서 꺼내서 출력해준다.
		}
		System.out.println("***메인 시작*********************");
	}

}
