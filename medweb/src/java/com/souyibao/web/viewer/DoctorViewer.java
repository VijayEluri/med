package com.souyibao.web.viewer;

public class DoctorViewer {
	private long id = 0;
	private String name = null;
	private String area = null;
	private String grade = null;
	private String traits = null;
	private String hospitalName = null;
	private String department = null;
	private String profile = null;
	private String url = null;
	
	public DoctorViewer(long id, String name, String area, String grade, String traits, String hospitalName, String department, String profile, String url) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.grade = grade;
		this.traits = traits;
		this.department = department;
		this.hospitalName = hospitalName;
		this.profile = profile;
		this.url = url;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getTraits() {
		return traits;
	}
	public void setTraits(String traits) {
		this.traits = traits;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
