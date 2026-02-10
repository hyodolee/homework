package ex0210.homework;
/**
  상품으로 속성을 관리하는 개체
*/
public class AccountExam20{
	private String accountNum; //계좌번호 null
	private String name;//계좌주  null
	private int price;//입금액 
	
	public AccountExam20(String accountNum, String name, int price) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.price = price;
	}

	public AccountExam20() {
		// TODO Auto-generated constructor stub
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}