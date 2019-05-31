package fasttrack.edu.vn.oop.bt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HocSinh[] arrHocSinh = new HocSinh[3];
		Scanner scanner = new Scanner(System.in);

		int lop;
		String ten;
		for (int i = 0; i < 3; i++) {
			System.out.print("Nhập lớp: ");
			lop = scanner.nextInt();
			
			System.out.print("Nhập tên học viên: ");
			ten = scanner.next();

			switch (lop) {
			case 1:
				HSLop1 hsLop1 = new HSLop1();
				hsLop1.lop = lop;
				hsLop1.ten = ten;
				System.out.print("Nhập điểm môn Tiếng Việt: ");
				hsLop1.diemTViet = scanner.nextFloat();
				arrHocSinh[i] = hsLop1;
				break;
			case 2:
				HSLop2 hsLop2 = new HSLop2();
				hsLop2.lop = lop;
				hsLop2.ten = ten;
				System.out.print("Nhập điểm môn Tiếng Việt: ");
				hsLop2.diemTViet = scanner.nextFloat();
				System.out.print("Nhập điểm môn Toán: ");
				hsLop2.diemToan = scanner.nextFloat();
				arrHocSinh[i] = hsLop2;
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}

		}
		
		// In ra danh sách
		System.out.println("Hiên thi danh sach hoc vien");
		for (HocSinh hocSinh : arrHocSinh) {
			hocSinh.display();
		}
		
		
		scanner.close();
	}

}
