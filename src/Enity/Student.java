package Enity;

public class Student {
	private final String nationality = "Viet Nam";
	private  String fullName;
	private String school;
	private int age;
	private double math;

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public String getNationality() {
		return nationality;
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
