package step12_Thread.ex0224;

/**
 * 숫자를 100번을 출력하는 스레드 - 상속
 */
class NumberThread extends Thread{
	int sum;
	public NumberThread(String name) {
		super(name);
	}
	/**
	 * 스레드로 동작할 기능을 작성
	 */
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(super.getName() + "==>" + sum);
			System.out.println(super.getName() + "==>" + i);
			sum += i; //누적
			
			//Thread.yield(); //스레드 양보
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(super.getName() + "End~~~~~~~~~~~~~~~~~~");
	}
}

/**
 * Alpha을 출력하는 스레드 - 구현
 */
class AlphaThread implements Runnable{

	@Override
	public void run() {
		Thread th = Thread.currentThread();// 현재 스레드 객체
		for(char ch='A'; ch <= 'z'; ch++) {
			System.out.println(th.getName() + "==>" + ch);
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(th.getName() + "End~~~~~~~~~~~~");
	}
	
}

public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("----메인 시작합니다.---------------------------");
		NumberThread th1 = new NumberThread("첫번째 thread");
		NumberThread th2 = new NumberThread("두번째 thread");
		
		Thread th3 = new Thread(new AlphaThread(),"세번째 thread");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th1.join(); //th1 스레드가 일을 마무리할때까지 메인스레드 정지상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("총합 = " + th1.sum);
		
		System.out.println("----메인 끝.---------------------------");
	}

}
