package fasttrack.edu.vn;

public class Dog {

	String name = "Dog name";

	void display() {
		System.out.println("name:" + name);
	}

	public static void main(String args[]) {

		Dog[] dogArr = new Dog[10];
		Dog dog = null ;
		for (int i = 0; i < 10; i++) {
			dog = new Dog();
			dog.name = "Dog " + i;
			dogArr[i] = dog;
		}

		for (int i = 0; i < 10; i++) {
			dogArr[i].display();
		}
		//dog.display();
		System.out.println("-----------------------");
		
		Dog[] dogArr2 = new Dog[10];
		Dog dog2 = new Dog();
		
		for (int i = 0; i < 10; i++) {
			dog2.name = "Dog " + i;
			dogArr2[i] = dog2;
		}

		for (int i = 0; i < 10; i++) {
			dogArr2[i].display();
		}
		
		//dog2.display();

	}

}
