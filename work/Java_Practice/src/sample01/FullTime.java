package sample01;

public class FullTime {
	int empNo, mgr, salary, bonus;
	String eName, job, hiredate, depName;
	//10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
	public FullTime() {}
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String depName, int salary, int bonus) {
		super();
		this.empNo = empNo;
		this.mgr = mgr;
		this.salary = salary;
		this.bonus = bonus;
		this.eName = eName;
		this.job = job;
		this.hiredate = hiredate;
		this.depName = depName;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
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
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setGiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	

}
