package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.SinhVien;

public class QuanLySinhVien {
	public static Scanner myScanner = new Scanner(System.in);
	public static ArrayList<SinhVien> arrSV = new ArrayList<SinhVien>();

	public static void main(String[] args) {

		
		showMyMenu();
	}

	public static void nhapDSSV() {
		try {
			System.out.println("Nhập danh sách sinh viên : ");
			System.out.println("---------------------------");
			System.out.print("Số lượng sinh viên :");
			int n = myScanner.nextInt();
		
			
			for (int j = 0; j < n; j++) {
				
				myScanner.nextLine();
				
				System.out.print("Nhập tên Sinh Viên :");
				String Name = myScanner.nextLine();

				System.out.print("Nhập ngày sinh của Sinh Viên :");
				String Date = myScanner.nextLine();

				System.out.print("Nhập điểm môn LP1 :");
				double Lp1 = myScanner.nextDouble();

				System.out.print("Nhập điểm môn LP2 :");
				double Lp2 = myScanner.nextDouble();
				
				arrSV.add(new SinhVien(Name,Date,Lp1,Lp2));
				SinhVien.tinhTongSV();
			}


		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
			}catch(Exception e) {
				System.out.println("Bạn đã nhập sai vui lòng nhập lại!");
				myScanner.nextLine();
				nhapDSSV();
		}
		
	}

	public static void inDSSV() {

		System.out.println("Danh sách sinh viên có tổng số là :" +SinhVien.tongSV);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("STT  Họ và tên              Ngày sinh     lp1  lp2   ĐTB  ");
		System.out.println("--------------------------------------------------------------------");
		for (int i = 0; i < SinhVien.tongSV; i++) {

			System.out.printf("%-5s%-23s%-14s%-5s%-5s%-5s\n", (i + 1), arrSV.get(i).getName(), arrSV.get(i).getDate(), arrSV.get(i).getLp1(),
					arrSV.get(i).getLp2(), arrSV.get(i).getTBM());
		}
		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}

	public static void topSV() {
		double min = arrSV.get(0).getTBM(), max = min;
		int x = 0, y = 0;

		for (int i = 0; i < arrSV.size(); i++) {
			if (min > arrSV.get(i).getTBM()) {
				min = arrSV.get(i).getTBM();
				x = i;
			}
			if (max < arrSV.get(i).getTBM()) {
				max = arrSV.get(i).getTBM();
				y = i;
			}
		}

		System.out.println("Học sinh có kết quả học tập cao nhất là :");
		System.out.printf("%-23s%-14s%-5s%-5s%-5s\n", arrSV.get(y).getName(), arrSV.get(y).getDate(), arrSV.get(y).getLp1(), arrSV.get(y).getLp2(),
				arrSV.get(y).getTBM());

		System.out.println("Học sinh có kết quả học tập thấp nhất là :");
		System.out.printf("%-23s%-14s%-5s%-5s%-5s\n", arrSV.get(x).getName(), arrSV.get(x).getDate(), arrSV.get(x).getLp1(), arrSV.get(x).getLp2(),
				arrSV.get(x).getTBM());
		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();

	}

	public static void sapxepTBM() {
		SinhVien[] temp = new SinhVien[arrSV.size()];
		for (int i = 0; i < arrSV.size() - 1; i++) {
			for (int j = i + 1; j < arrSV.size(); j++) {
				if (arrSV.get(i).getTBM() < arrSV.get(j).getTBM()) {
					temp[i] = arrSV.get(j);
					arrSV.set(j, arrSV.get(i));
					arrSV.set(i, temp[i]);
				}
			}
		}

			System.out.println("Danh sách sinh viên đã được sắp xếp theo điểm trung bình ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("STT  Hồ và tên              Ngày sinh     lp1  lp2   ĐTB  Xếp Loại  ");
			System.out.println("--------------------------------------------------------------------");
			for (int i = 0; i < SinhVien.tongSV; i++) {
				System.out.printf("%-5s%-23s%-14s%-5s%-5s%-5s%-10s\n", (i + 1), arrSV.get(i).getName(), arrSV.get(i).getDate(),
						arrSV.get(i).getLp1(), arrSV.get(i).getLp2(), arrSV.get(i).getTBM(), arrSV.get(i).XepLoai());
		}

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	
	public static void sapxepTen() {
		SinhVien[] temp = new SinhVien[arrSV.size()];
		for (int i = 0; i < arrSV.size() - 1; i++) {
			for (int j = i + 1; j < arrSV.size(); j++) {
				if (arrSV.get(i).getName().compareTo(arrSV.get(j).getName()) > 0) {
					temp[i] = arrSV.get(j);
					arrSV.set(j, arrSV.get(i));
					arrSV.set(i, temp[i]);
				}
			}
		}

			System.out.println("Danh sách sinh viên đã được sắp xếp theo tên học sinh ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("STT  Họ và tên              Ngày sinh     lp1  lp2   ĐTB  Xếp Loại  ");
			System.out.println("--------------------------------------------------------------------");
			for (int i = 0; i < SinhVien.tongSV; i++) {
				System.out.printf("%-5s%-23s%-14s%-5s%-5s%-5s%-10s\n", (i + 1), arrSV.get(i).getName(), arrSV.get(i).getDate(),
						arrSV.get(i).getLp1(), arrSV.get(i).getLp2(), arrSV.get(i).getTBM(), arrSV.get(i).XepLoai());
		}

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	
	public static void doitenSV() {
		
		myScanner.nextLine();
		
		System.out.println("Nhập tên sinh viên cần đổi :");
		String DoiTen = myScanner.nextLine();
		
		System.out.println("Tên cần đổi cho sinh viên :");
		String TenMoi = myScanner.nextLine();
		for(SinhVien x : arrSV) {
			
			if((x.getName().equals(DoiTen))) {	
				x.setName(TenMoi);
			}
		}
		
		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	
	public static void xoatenSV() {
		
		myScanner.nextLine();
		
		System.out.println("Nhập tên sinh viên cần xóa :");
		String XoaTen = myScanner.nextLine();
		
		
			for (int j = arrSV.size()-1; j >-1; j--) {
			if((arrSV.get(j).getName().equals(XoaTen))) {	
				arrSV.remove(j);
				SinhVien.tongSV -= 1;
				}
		}
		
		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}

	public static void ketThuc() {
		System.out.println("Kết thúc chương trình!!!!!");
		System.exit(0);
	}

	public static void showMyMenu() {
		while (true) {
			try {
			System.out.println(">>         MENU QUẢN LÝ SINH VIÊN       <<");
			System.out.println("+----------------------------------------+");
			System.out.println("|1. Nhập danh sách sinh viên             |");
			System.out.println("|2. In danh sách sinh viên               |");
			System.out.println("|3. Top sinh viên                        |");
			System.out.println("|4. Sắp xếp theo điểm TBM                |");
			System.out.println("|5. Sắp xếp theo Tên                     |");
			System.out.println("|6. Đổi tên cho học sinh                 |");
			System.out.println("|7. Xóa học sinh                         |");
			System.out.println("|8. Kết thúc chương trình                |");
			System.out.println("+----------------------------------------+");
			System.out.println(">>            Lựa chọn của bạn?         <<");
			
			int myOption = myScanner.nextInt();
			if (myOption == 1) {
				nhapDSSV();
			} else if (myOption == 2) {
				inDSSV();
			} else if (myOption == 3) {
				topSV();
			} else if (myOption == 4) {
				sapxepTBM();
			} else if (myOption == 5) {
				sapxepTen();
			} else if (myOption == 6) {
				doitenSV();
			} else if (myOption == 7) {
				xoatenSV();
			} else if (myOption == 8) {
				ketThuc();
			} else {
                throw new Exception();
			}
			
			
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai vui lòng nhập lại từ 1 đến 8!!!");
				myScanner.nextLine();
			}
		}
	}

}
