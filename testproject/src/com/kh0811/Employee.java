package com.kh0811;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;

	public Employee() {
		
	}
	
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo=empNo;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.empNo=empNo;
		this.name=name;
		this.gender=gender;
		this.phone=phone;
		this.dept=dept;
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public int getEmpNo() {
		return this.empNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return this.gender;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return this.dept;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public double getBonus() {
		return this.bonus;
	}
	
	
	
	
	public String printEmoployee() {
		return getEmpNo()+"/ "+getName()+"/ "+getGender()+"/ "+getPhone()+"/ "+getDept()+"/ "+getSalary()+"/ "+getBonus();
	}
	
	
	
}
