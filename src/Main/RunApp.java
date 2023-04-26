package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Enity.NaturalStudent;
import Enity.SocialStudent;
import Enity.Student;
import Model.StudentModel;

public class RunApp {
	public static void main(String[] args) {
		RunApp app = new RunApp();
		app.menu();
	
	}

	private List<Student> loadData() {
		Student svtn1 = new NaturalStudent("Nguyễn Văn Trường", "Fpoly", 20, 7.4, 9);
		Student svtn2 = new NaturalStudent("Nguyễn Văn Nam", "Fpoly", 21, 5, 8);
		Student svtn3 = new NaturalStudent("Nguyễn Thị Mỹ", "Fpoly", 19, 2, 5);
		Student svtn4 = new NaturalStudent("Nguyễn Trâm Minh", "Fpoly", 18, 9, 3);
		Student svtn5 = new NaturalStudent("Nguyễn Trúc Ly", "Fpoly", 22, 7, 10);
		Student svxh1 = new SocialStudent("Phạm Thị Ngân", "Fpoly", 18, 6.7, 6);
		Student svxh2 = new SocialStudent("Phạm Thị Nga", "Fpoly", 19, 9, 6);
		Student svxh3 = new SocialStudent("Phạm Thị Nở", "Fpoly", 20, 7, 7);
		Student svxh4 = new SocialStudent("Phạm Văn Mạnh", "Fpoly", 21, 8, 6);
		Student svxh5 = new SocialStudent("Phạm Thanh Thiên", "Fpoly", 22, 10, 6);
		List<Student> list = new ArrayList<>();
		list.add(svxh1);
		list.add(svxh2);
		list.add(svxh3);
		list.add(svxh4);
		list.add(svtn1);
		list.add(svtn2);
		list.add(svtn3);
		list.add(svtn4);
		list.add(svtn5);
		list.add(svxh5);
		return list;
	}

	public void menu() {
		StudentModel model = new StudentModel();
		List<Student> list = loadData();
		Scanner sc = new Scanner(System.in);
		int chon;
		
		try {

			do {
				System.out.println("1. Xuat Thong Tin Sinh Vien");
				System.out.println("2. Tim Sinh Vien Theo Khoi");
				System.out.println("3. Tim Sinh Vien Theo Ten");
				System.out.println("4. Tim Sinh Vien Co Tuoi Lon Hon N");
				System.out.println("5. Tim Sinh Vien Co Diem Trung Binh >= N");
				System.out.println("6. Xet Hoc Luc");
				System.out.println("0: Thoat Chuong Trinh");
				System.out.println("Chon Chuc Nang 0-6");
				chon = sc.nextInt();
				switch (chon) {
				case 0:
					System.exit(0);
				case 1:
					model.printInfor(list);
					break;
				case 2:
					sc= new Scanner(System.in);
					System.out.print("Nhập vào Nganh : ");
					String major = sc.nextLine();
				
					model.printInfor(model.getListStudentMajor(major, list));
					break;
				case 3:
					sc= new Scanner(System.in);
					System.out.print("Nhập vào Tên : ");
					String name = sc.nextLine();
					model.printInfor(model.getStudentToName(name, list));
					break;
				case 4:
					System.out.print("Nhập vào Tuổi : ");
					
					int age = sc.nextInt();
					System.out.println("Sinh Viên Có Tuổi Lớn Hơn "+ age);
					model.printInfor(model.getListToAge(age, list));
					break;
				case 5:
					System.out.print("Nhập vào Điểm Trung Bình : ");
					double diem = sc.nextDouble();
					System.out.println("Sinh Viên Có Điểm Trung Bình Lớn Hơn "+ diem);
					model.printInfor(model.getListAvgbigThanNumber(diem, list));
					break;
				case 6:
					model.getPassFail(list);
					break;
				default:
					System.out.println("Chọn lại từ 0-6 nha hihi");
					break;
				}
			} while (chon >= 0);
			System.out.println("Exited!!");
		} catch (Exception e) {
			System.out.println("Ban Chon Sai Cu Phap,Chọn lại !!!");
			menu();
		}
	}
}
