import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
public class SinhVien {
//KHAI BÁO BIẾN 
	private String name;
	private int age,id;
	private double diemLP1, diemLP2, avg;


	
	Scanner input = new Scanner(System.in);
	
	
	public void setSinhVien() {
		
		System.out.println("Nhập ID");
		id= input.nextInt();

		input.nextLine();
		
		System.out.println("Nhập tên sinh viên");
		name = input.nextLine();
		
		System.out.println("Nhập ngày sinh");
		age = input.nextInt();
		
		System.out.println("Nhập điểm LP1");
		diemLP1 = input.nextDouble();
		
		System.out.println("Nhập điểm LP2");
		diemLP2 = input.nextDouble();
		
		avg= (diemLP1+diemLP2)/2;
		System.out.println("Điểm trung bình của SV :"+avg);
		
		
	}
	
	//ID
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
	}
	//Name
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	//Age
	public void setAge(int age) {
		this.age= age;
	}
	public int getAge() {
		return age;
	}
	//DiemLP1
	public void setDiemLP1(double diemLP1) {
		this.diemLP1= diemLP1;
	}
	public double getDiemLP1() {
		return diemLP1;
	}
	//DiemLP2
	public void setDiemLP2(double diemLP1) {
		this.diemLP1= diemLP1;
	}
	public double getDiemLP2() {
		return diemLP1;
	}
	//AVG
	public void setAvg(double avg) {
		this.avg= avg;
	}
	public double getAvg() {
		return avg;
	}
	 
	//Sắp xếp sinh viên theo danh sách thự tự tên ABC
	
		public int sortByName(SinhVien st1, SinhVien st2) {
			return st1.getName().compareTo(st2.getName());
			}
	

	
}
