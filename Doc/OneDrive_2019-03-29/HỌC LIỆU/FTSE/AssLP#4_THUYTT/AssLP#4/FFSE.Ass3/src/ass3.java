
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.View;



/*
 * Viết chương trình quản lý sinh viên với các thông tin và chức năng sau.
 
Thông tin sinh viên: Họ tên (String), Ngày sinh (String), Điểm LP1 (Double), Điểm LP2 (Double).
 
Chương trình sẽ cho người dùng lựa chọn các tính năng từ menu gồm có:
1/ Nhập thông tin sinh viên (gồm tổng số SV, thông tin chi tiết cho từng sinh viên được lưu dưới dạng mảng)
2/ In ra danh sách sinh viên gồm Họ tên, Ngày sinh, Điểm LP1, LP2 và Điểm Trung bình
3/ In ra danh sách sinh viên tiêu biểu gồm SV cao điểm nhất và SV thấp điểm nhất
4/ Kết thúc chương trình
 
Bạn nào xong sớm có thể nghiên cứu thêm 2 yêu cầu mới:
 
1/ Sắp xếp sinh viên theo danh sách thự tự tên ABC
2/ Sắp xếp sinh viên theo danh sách Điểm trung bình từ cao đến thấp

 */
public class ass3 {
	private static Scanner input;
	static ArrayList<SinhVien> arrSinhvien = new ArrayList<>();
	
	public static void printMenu() {
		System.out.println("/***********************************************/");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. In danh sách sinh viên theo ID");
		System.out.println("3. In danh sách sv có điểm cao nhất và thấp nhất");
		System.out.println("4. Sắp xếp sinh viên theo thứ tự ABC");
		System.out.println("0. Kết thúc chương trình");
		System.out.println("/***********************************************/");
	}
	
	//nhập danh sách sinh viên
	public static void addStudent() {
		input = new Scanner(System.in);
		System.out.println("nhập số lượng sinh viên");
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i<n;i++) {
			System.out.println("nhập thông tin sinh viên thứ "+(i+1)+":");
			SinhVien st = new SinhVien();
			st.setSinhVien();
			arrSinhvien.add(st);
			
		}
	}
	
	//xuất danh sách sinh viên
	public static void ViewStudent() {
		System.out.println("");
		for(int i = 0; i <arrSinhvien.size();i++) {
			System.out.println("Danh sách sinh viên: "+ (i + 1)+":"+ arrSinhvien.get(i).getName()+"    "+
					arrSinhvien.get(i).getAge()+"    "+arrSinhvien.get(i).getDiemLP1()+"    "+ arrSinhvien.get(i).getDiemLP2()+"    "+
					arrSinhvien.get(i).getAvg());
		}
	}
	//sắp xếp sinh viên theo điểm trung bình
	public static void sortStudent() {
		topBottomSV();
		
		
	}
	private static void topBottomSV() {
		// TODO Auto-generated method stub
		double min = arrSinhvien.get(0).getAvg(), max = min;
		int x = 0, y = 0;

		for (int i = 0; i < arrSinhvien.size(); i++) {
			if (min > arrSinhvien.get(i).getAvg()) {
				min = arrSinhvien.get(i).getAvg();
				x = i;
			}
			if (max < arrSinhvien.get(i).getAvg()) {
				max = arrSinhvien.get(i).getAvg();
				y = i;
			}
		}
		System.out.println("Học sinh có kết quả học tập cao nhất là :");
		System.out.printf("%-23s%-14s%-5s%-5s%-5s\n", arrSinhvien.get(y).getName(), arrSinhvien.get(y).getAge(),
				arrSinhvien.get(y).getDiemLP1(), arrSinhvien.get(y).getDiemLP2(), arrSinhvien.get(y).getAvg());

		System.out.println("Học sinh có kết quả học tập thấp nhất là :");
		System.out.printf("%-23s%-14s%-5s%-5s%-5s\n", arrSinhvien.get(x).getName(), arrSinhvien.get(x).getAge(),
				arrSinhvien.get(x).getDiemLP1(), arrSinhvien.get(x).getDiemLP2(), arrSinhvien.get(x).getAvg());
		input.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		input.nextLine();
	}

	public static void main(String[] args) {
		printMenu();
		
		do {
			input = new Scanner(System.in);
			System.out.println("Nhập 0-4 để chọn chức năng, 5 để hiển thị menu: ");
			int control = Integer.parseInt(input.nextLine());
			switch (control) {
			case 1:
				addStudent();
				break;
			case 2:
				ViewStudent();
				break;
			case 3:
				sortStudent();
				break;
			case 4:
				//Collections.sort(arrSinhvien);
				break;
			case 0:
				System.out.println("Kết thúc chương trình");
				System.exit(0);
		default:
			System.out.print("Phải nhập số từ 0 đến 4, hãy nhập lại: ");
			break;
		}
		}
		while(true);	
}
}
