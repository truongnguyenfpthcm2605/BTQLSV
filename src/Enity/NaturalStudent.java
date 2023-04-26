package Enity;

public class NaturalStudent  extends Student implements Util{
	private double chemistry;



	public NaturalStudent() {
		super();
	
	}
	
	public NaturalStudent(String fullName, String school, int age, double math, double chemistry) {
	    super();
	    setFullName(fullName);
	    setSchool(school);
	    setAge(age);
	    setMath(math);
	    setChemistry(chemistry);
	}

	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "NaturalStudent [chemistry=" + chemistry + ", nationality=" + getNationality() + ", fullName=" + getFullName()
				+ ", school=" + getSchool() + ", age=" + getAge() + ", math=" + getMath() + "]";
	}
	@Override
	public double PointAvg() {
		return (this.getChemistry()+this.getMath())/2;
	}
	@Override
	public String getResult() {
		return this.PointAvg() >= 5?"Pass": "Fail";
	}
	
	

	
	
	
	
	
}
