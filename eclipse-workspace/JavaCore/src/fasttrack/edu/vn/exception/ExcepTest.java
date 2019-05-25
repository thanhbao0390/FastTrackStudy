package fasttrack.edu.vn.exception;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExcepTest {

	public static void main(String args[]) {
		
		A a = new A();
		

		try {
			a.methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}


class A {
	
	
	public void methodA() throws IOException{

			
			try {
				throw new IOException();
			} catch (IOException e) {
				throw  e;
			}
			
		
		
	}
	
	
	
}
