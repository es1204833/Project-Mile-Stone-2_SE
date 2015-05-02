package model;

public class Course {
	private int cCode;
	private String cName;
	private int deptName;
	
	public Course() {
	}
	public Course(int cCode, String cName, int deptName) {
		this.cCode = cCode;
		this.cName = cName;
		this.deptName = deptName;
	}
	public int getcCode() {
		return cCode;
	}
	public void setcCode(int cCode) {
		this.cCode = cCode;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getDeptName() {
		return deptName;
	}
	public void setDeptName(int deptName) {
		this.deptName = deptName;
	}
	
	

}
