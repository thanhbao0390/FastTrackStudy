/*
 * Để quản lý các biên lai thu tiền điện, sở điện lực Đà Nẵng đặt hàng sinh viên xây dựng ứng dụng QuanLyTienDien bằng Java. Những thông tin sở điện lực cần lưu và xử lý gồm có:
•	Quản lý danh sách Khách Hàng với các thông tin: Mã Khách Hàng, Tên Khách Hàng, Địa Chỉ, Mã Công Tơ
•	Quản lý chỉ số điện tiêu thụ của mỗi khách hàng: Mã Công Tơ, Chỉ Số Cũ, Chỉ Số Mới
•	Hàng tháng nhập thông tin chỉ số điện cho từng khách hàng, in ra danh sách khách hàng và tiền điện tiêu thụ
 
Với yêu cầu như vậy, các em hãy xây dựng ứng dụng với thiết kế như sau:
1. Hãy xây dựng lớp KhachHang để lưu trữ các thông tin riêng của mỗi hộ sử dụng điện.
2. Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ.
3. Cài đặt chương trình thực hiện các công việc sau:
+ 3.1 Nhập vào các thông tin cho các hộ sử dụng điện
+ 3.2 Nhập thông tin về các chỉ số tiêu thụ điện
+ 3.3 In danh sách thu tiền của khách hàng dựa trên chỉ số tiêu, giả sử rằng tiền phải trả được tính theo công thức sau:
số tiền phải trả=(Số mới - số cũ) * 3000

 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.KhachHang;
import model.BienLai;

public class QuanLyTienDien {
	
	public static int n = 0, thang, nam, tongtien = 0;
	public static Scanner myScanner = new Scanner(System.in);
	public static ArrayList<KhachHang> arrKH = new ArrayList<KhachHang>();
	public static ArrayList<BienLai> arrBL = new ArrayList<BienLai>();

	public static void main(String[] args) {
		showCTrinh();
	}
	
	public static void nhapKH() {
		System.out.println("Nhập danh sách khách hàng : ");
		System.out.println("---------------------------");
		System.out.print("Số lượng khách hàng :");
		n = myScanner.nextInt();

		for (int i = 0; i < n; i++) {

			myScanner.nextLine();

			System.out.println("Nhập Mã khách hàng thứ " + (i + 1) + " : ");
			String masoKH = myScanner.nextLine();

			System.out.println("Nhập Tên khách hàng thứ " + (i + 1) + " : ");
			String tenKH = myScanner.nextLine();

			System.out.println("Nhập Địa Chỉ khách hàng thứ " + (i + 1) + " : ");
			String diachiKH = myScanner.nextLine();

			System.out.println("Nhập Mã Công Tơ của khách hàng thứ " + (i + 1) + " : ");
			String maCT = myScanner.nextLine();

			arrKH.add(new KhachHang(masoKH, tenKH, diachiKH, maCT));

		}

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}

	public static void NhapThongTinTT() {

		System.out.print("Nhập chỉ số điện tiêu thụ của Tháng : ");
		thang = myScanner.nextInt();

		System.out.print("trong năm : ");
		nam = myScanner.nextInt();

		for (int i = 0; i < arrKH.size(); i++) {

			myScanner.nextLine();

			System.out.println("Tên Khách hàng : " + arrKH.get(i).getTenKH());
			System.out.println("Mã Khách hàng : " + arrKH.get(i).getMaKH());
			System.out.println("Mã Công Tơ :" + arrKH.get(i).getMaCT());

			System.out.println("Nhập Chỉ Số Điện Đầu Kỳ :");
			int chisotruoc = myScanner.nextInt();

			System.out.println("Nhập Chỉ Số Điện Cuối Kỳ :");
			int chisosau = myScanner.nextInt();

			arrBL.add(new BienLai(arrKH.get(i).getMaKH(), arrKH.get(i).getTenKH(),
					arrKH.get(i).getDiachiKH(), arrKH.get(i).getMaCT(), chisotruoc, chisosau, thang,
					nam));
		}

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	public static void InKhachHang() {

		System.out.println("Danh sách tính tiền điện của khách hàng ");
		System.out.println("------------------------------------------------------");
		System.out.println("STT  MasoKH    TênKH           Địa chỉ     MasoCT  ");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < arrKH.size(); i++) {

			System.out.printf("%-5s%-10s%-16s%-12s%-12s\n", (i + 1),
					arrKH.get(i).getMaKH(),
					arrKH.get(i).getTenKH(),
					arrKH.get(i).getDiachiKH(),
					arrKH.get(i).getMaCT());
		}

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	
	public static void InBienLaiTheoNam() {

		System.out.print("Nhập năm cần in biên lai khách hàng : ");
		nam = myScanner.nextInt();

		System.out.println("Danh sách tính tiền điện của khách hàng trong năm : " + nam);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"|STT  |MasoKH    |TênKH           |Địa chỉ     |MasoCT      |Thời gian   |Chỉ số Đầu Kỳ  |Chỉ số Cuối Kỳ  |Tiền điện     ");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
		int n = 1;
		tongtien = 0;
		for (int k = 0; k < arrBL.size(); k++) {
			if (nam == arrBL.get(k).getNam()) {

				System.out.printf("|%-5s|%-10s|%-16s|%-12s|%-12s|%-1s/%-11s|%-15s|%-16s|%,10d\n",
						n,
						arrBL.get(k).getMaKH(),
						arrBL.get(k).getTenKH(),
						arrBL.get(k).getDiachiKH(),
						arrBL.get(k).getMaCT(),
						arrBL.get(k).getThang(),
						arrBL.get(k).getNam(),
						arrBL.get(k).getChisoDauKy(),
						arrBL.get(k).getChisoCuoiKy(),
						arrBL.get(k).tienDien());
				n += 1;
				tongtien += arrBL.get(k).tienDien();
			}
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");
		System.out.printf(
				"                                                                                                 Tổng tiền:|%,10d\n",
				tongtien);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------");

		myScanner.nextLine();
		System.out.println("Ấn Enter để về menu chính");
		myScanner.nextLine();
	}
	
	public static void showCTrinh() {
		while (true) {
			try {
			System.out.println(">>         MENU QUẢN LÝ TIỀN ĐIỆN       <<");
			System.out.println("+----------------------------------------+");
			System.out.println("|1. Nhập thông tin khách hàng            |");
			System.out.println("|2. Nhập thông tin chỉ số tiêu thụ       |");
			System.out.println("|3. In biên lai tiền điện của các hộ     |");
			System.out.println("|4. In danh sách khách hàng              |");
			System.out.println("|5. Kết thúc chương trình                |");
			System.out.println("+----------------------------------------+");
			System.out.println(">>            Lựa chọn của bạn?         <<");
			int myOption = myScanner.nextInt();
			if (myOption == 1) {
				nhapKH();
			} else if (myOption == 2) {
				NhapThongTinTT();
			} else if (myOption == 3) {
				//inBienLai();
			} else if (myOption == 4) {
				InKhachHang();
			} else if (myOption == 5) {
				//ketThuc();
			} else {
                throw new Exception();
			}
			
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai vui lòng nhập lại!!!Nhập lựa chọn từ 1 đến 5!!!");
				myScanner.nextLine();
			}
		}
	}


}
