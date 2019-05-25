package fasttrack.edu.vn.regular;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Random rd= new Random();
		String[] array = new String[100];
		for (int i = 0; i < 100; i++) {
			array[i] = String.valueOf(rd.nextInt(100));
		}
		
		for (String s : array) {
			System.out.print(s + " ");
		}
		
		System.out.println("\r\nIn nhung so < 50");
		Pattern r = Pattern.compile("^[0-4]");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.find()) {
				System.out.print(s + " ");
			}
		}
		
		System.out.println("\r\nIn nhung so bat dau bang 2");
		r = Pattern.compile("^2");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.find()) {
				System.out.print(s + " ");
			}
		}
		
		System.out.println("\r\nIn nhung so co chua so 2");
		r = Pattern.compile("2");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.find()) {
				System.out.print(s + " ");
			}
		}
		
		System.out.println("\r\n----------\r\nIn nhung so < 50");
		r = Pattern.compile("^[0-4]|^[0-4].");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.matches()) {
				System.out.print(s + " ");
			}
		}
		
		System.out.println("\r\nIn nhung so bat dau bang 2");
		r = Pattern.compile("^2|^2.");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.matches()) {
				System.out.print(s + " ");
			}
		}
		
		System.out.println("\r\nIn nhung so co chua so 2");
		r = Pattern.compile(".2$|^2.|2");
		for (String s : array) {
			Matcher m = r.matcher(s);
			if(m.matches()) {
				System.out.print(s + " ");
			}
		}

	}

}
