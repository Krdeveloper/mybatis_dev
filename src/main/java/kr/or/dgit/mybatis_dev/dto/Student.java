package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Date dob;
	private PhoneNumber phone;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int studId, String name, String email, Date dob, PhoneNumber phone) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	public Student(int studId, String name, String email, Date dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %s", studId, name, email, dob, phone, address);
	}
	
	
	
}
