package emailapp;

public class EmailApp {
	
	//Constructor set-up for first and last name arguments
	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");   ///all of the output is coming from this constructor 
		System.out.println(em1.showInfo());

	}

}
