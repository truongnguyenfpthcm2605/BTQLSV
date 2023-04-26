package Model;

import java.util.ArrayList;
import java.util.List;
import Enity.NaturalStudent;
import Enity.SocialStudent;
import Enity.Student;

public class StudentModel {
	
	public void printInfor(List<Student> list) {
		list.stream().forEach(e ->{
			System.out.println(e.toString());
		});
	}
	public List<Student> getListToAge(int n, List<Student> list){
		List<Student> listAge = new ArrayList<>();
		for (Student e : list) {
			if(e.getAge()==n) {
				listAge.add(e);
			}
		}
		return !listAge.isEmpty() ? listAge : null;
	}
	
	public List<Student> getListStudentMajor(String major,List<Student> list){
		List<Student> Majors = new ArrayList<>();
		for (Student student : list) {
			if(major.equals("natural")) {
				if(student instanceof NaturalStudent) {
					Majors.add(student);
				}
			}else  if(major.equals("social")){
				if(student instanceof SocialStudent) {
					Majors.add(student);
				}
			}
		}
		return !Majors.isEmpty() ? Majors : null;
	}
	
	public List<Student> getListAvgbigThanNumber(double dtb,List<Student> list){
		List<Student> listdtb = new ArrayList<>();
		for (Student student : list) {
			if(student instanceof NaturalStudent) {
				if(((NaturalStudent) student).PointAvg()> dtb) {
					listdtb.add(student);
				}
			}else if(student instanceof SocialStudent) {
				if(((SocialStudent) student).PointAvg() > dtb) {
					listdtb.add(student);
				}
			}
		}
		return !listdtb.isEmpty() ? listdtb : null;
		
	}
	public List<Student> getStudentToName(String name,List<Student> list){
		List<Student> ListName = new ArrayList<>();
		for (Student student : list) {
			if(student.getFullName().equals(name)) {
				ListName.add(student);
			}
		}
		return !ListName.isEmpty() ? ListName : null;
	}
	public void getPassFail(List<Student> list){
		for (Student student : list) {
			if(student instanceof NaturalStudent) {
				NaturalStudent sv = (NaturalStudent) student;
				System.out.println(sv.getFullName() +"/" + sv.PointAvg() + "/" +  sv.getResult());
			}else if(student instanceof SocialStudent) {
				SocialStudent sv = (SocialStudent) student;
				System.out.println(sv.getFullName() +"/" + sv.PointAvg() + "/" +  sv.getResult());
			}
		}
	}

	
	

	
	
}
