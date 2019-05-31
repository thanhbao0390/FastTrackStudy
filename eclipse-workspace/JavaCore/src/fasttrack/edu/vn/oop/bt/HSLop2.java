package fasttrack.edu.vn.oop.bt;

public class HSLop2 extends HocSinh {

	float diemTViet;
	float diemToan;
	
	@Override
	void display() {
		System.out.println("--------------------------------------");
		System.out.println("Ten hoc sinh: " + ten);
		System.out.println("Lop: " + lop);
		System.out.println("T Viet: " + diemTViet);
		System.out.println("Toan: " + diemToan);
		
	}
}
