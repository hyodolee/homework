package sample01;

public class PartTime {
	int empNo, mgr, timePay;
	String eName, job, hiredate, depName;
	
	public PartTime() {}
//40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String depName, int timePay) {
		super();
		this.empNo = empNo;
		this.mgr = mgr;
		this.timePay = timePay;
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

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
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

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}
}
