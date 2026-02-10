package ex0210.homework;

class Account19{
	int balance;
//	int MIN_BALANCE = 0;
//	int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		int total = this.balance + balance;
		
		if(total > 1000000) {
			this.balance = 1000000;
		}else if(total < 0) {
			this.balance = 0;
		}else {
			this.balance = total;
		}
	}
}

public class Exam19 {
	public static void main(String [] agrs){
		Account19 account = new Account19();
		
		account.setBalance(10000);
		System.out.println("현재 잔고:" + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고:" + account.getBalance());
		
		account.setBalance(10000000);
		System.out.println("현재 잔고:" + account.getBalance());
		
		account.setBalance(-10000000);
		System.out.println("현재 잔고:" + account.getBalance());
	}
}
