package fasttrack.edu.vn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		A clsA = new A();

		System.out.print("Nhập a: ");
		clsA.a = scanner.nextInt();

		System.out.print("Nhập b: ");
		clsA.b = scanner.nextInt();

		System.out.print("Nhập phép tính: ");
		String pheptinh = scanner.next();
		
		float result;

		switch (pheptinh) {
		case "+":
			result = clsA.cong();
			break;

		case "-":
			result = clsA.tru();
			break;

		case "*":
			result = clsA.nhan();
			break;

		case ":":
			result = clsA.chia();
			break;

		default:
			result = 0;
			break;
		}
		
		
		System.out.println("Kết quả của phép " + pheptinh + " là " + result );

	}

}
