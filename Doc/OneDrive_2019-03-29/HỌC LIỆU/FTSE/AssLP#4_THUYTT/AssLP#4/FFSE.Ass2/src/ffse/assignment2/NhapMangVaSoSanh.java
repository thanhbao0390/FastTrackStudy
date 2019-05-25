package ffse.assignment2;

import java.util.Scanner;

/*
 * 2. Assignment 2:
Viết chương trình nhập dữ liệu cho một mảng số nguyên. Số lượng phần tử và giá trị các phần tử mảng được nhập từ bàn phím.
 
1/ In ra danh sách mảng
2/ In ra giá trị lớn nhất và giá trị nhỏ nhất
3/ In ra vị trí phần tử chứa giá trị lớn nhất và phần tử chứa giá trị nhỏ nhất trong mảng
 */
public class NhapMangVaSoSanh {
	public static void main(String[] args){
		int dai, max=0,min=0,c=1,a=0,b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("bạn muốn so sánh bao nhiêu số: ");
		dai= sc.nextInt();
		 // Khai báo và khởi tạo giá trị ban đầu cho mảng
	    // mảng này có tên là mang và kích thước = dai
		int[]mang = new int[dai];
		for (int i=0; i<dai; i++) {
			System.out.print("nhập số thứ " +c+" : ");
			mang[i]=sc.nextInt();
			min = mang[i];
			c=i+1;
		}
		System.out.print("các số cần so sánh là: ");
		for(int j=0; j<dai; j++) {
			if (max <= mang[j]) {
				max=mang[j];
				a=j+1;
			}
			if (min >= mang[j]) {
				min=mang[j];
				b=j+1;
			}
			System.out.print(mang[j] + "\t");
		}
		System.out.println("\nsố lớn nhất là: "+ max + " vị trí thứ " +a);
		System.out.println("số nhỏ nhất là: "+ min + " vị trí thứ " +b);
		 
	}
	

}
