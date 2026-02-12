package sample02;

public class FullTime extends Employee{
	int salary, bonus;

	public FullTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
//	@Override
//	public String toString() {
//		return this.getEmpNo() + " | " + this.geteName()+ " | " + this.getJob()+ " | " + this.getMgr()+ " | " + this.getHiredate()+ " | "+ this.getDeptName() + " | " +  this.getSalary() + " | " + this.getBonus();
//	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FullTime [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void message() {
		super.message();
		System.out.println(this.geteName()+ "사원은 정규직 입니다.");
	}

	
}
