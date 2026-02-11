package sample02;

public class PartTime extends Employee {
	int timePay;
	
	public PartTime() {
		// TODO Auto-generated constructor stub
	}

	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}
	
	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	@Override
	public String toString() {
		return this.getEmpNo() + " | " + this.geteName()+ " | " + this.getJob()+ " | " + this.getMgr()+ " | " + this.getHiredate()+ " | "+ this.getDeptName() + " | " + this.getTimePay();
	}
	
	@Override
	public void message() {
		super.message();
		System.out.println(this.geteName()+ "사원은 비정규직 입니다.");
	}
}
