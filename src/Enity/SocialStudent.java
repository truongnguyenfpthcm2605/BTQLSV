package Enity;

public class SocialStudent extends Student implements Util{
		private double gdcd;
		
		public SocialStudent(String fullName, String school, int age, double math, double gdcd) {
		    super();
		    setFullName(fullName);
		    setSchool(school);
		    setAge(age);
		    setMath(math);
		    setGdcd(gdcd);
		}
		public SocialStudent() {
			super();

		}
		public double getGdcd() {
			return gdcd;
		}
		public void setGdcd(double gdcd) {
			this.gdcd = gdcd;
		}
		@Override
		public String toString() {
			return "SocialStudent [gdcd=" + gdcd + ", nationality=" + getNationality() + ", fullName=" + getFullName()
					+ ", school=" + getSchool() + ", age=" + getAge() + ", math=" + getMath()+"]";
		}
		@Override
		public double PointAvg() {
			return ((this.getGdcd()*2)+this.getMath())/3;
		}
		@Override
		public String getResult() {
			return this.PointAvg() >= 5?"Pass": "Fail";
		}
		


		
		
		
		
}
