package fasttrack.edu.vn.bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Vui lòng nhập: ");
		String str = scanner.next();

		int stt = 0;
		HoaDon hoaDon = new HoaDon();
		ThucDon thucDon = null;
		
		ArrayList<Object> aaaa = new ArrayList<>();

		while (!"=".equals(str)) {

			if (stt == 0) {
				// bat dau 1 mon
				thucDon = new ThucDon();
				hoaDon.thucdon.add(thucDon);
				thucDon.tenThucDon = str;
				stt++;
			} else if (stt == 1) {
				thucDon.soluong = Integer.parseInt(str);
				stt++;
			} else {
				thucDon.giatien = Integer.parseInt(str);

				// da nhap xong 1 mon
//				hoaDon.thucdon.add(thucDon);
				stt = 0;
			}

			System.out.print("Vui lòng nhập: ");
			str = scanner.next();
		}

		System.out.println("=================HOA DON ==================");
		for (ThucDon td : hoaDon.thucdon) {
			System.out.println(td.tenThucDon + "\t" + td.soluong + "\t" + td.giatien);
		}
		System.out.println("===========================================");
		System.out.println("Tong tien: " + hoaDon.tongtien());

		scanner.close();
	}

}
