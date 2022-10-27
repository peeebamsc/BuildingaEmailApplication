package emailapp;

import java.util.Scanner;

public class Email {

	// Scenario: you are an IT Support Administrator Specialist and are charged
		// with the task of creating email accounts for new hires.
		//
		// Your application should do the following:
		// Generate an email with the follow syntax: firstname.lastname@department.company.com
		// Determine the department (sales, development, accounting), if none leave blank
		// Generate a random String for password
		// Have set methods to change the password, set the mailbox capacity, and define an alternate 
		// email address
		// Have get methods to display the name, email, and mailbox capacity
		
	public static void main(String[] args) {
		
	}
		
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity = 500;
		private int defaultPasswordLength = 10; // declare set password lengths 
		private String alternateEmail;   // Develop outline for objectives 
		private String companySuffix = "aeycompany.com";
		
		// Constructor to receive the first name and last name
		public Email(String firstName, String lastName) { 
			this.firstName = firstName;  //this is referring to the class level variables strings
			this.lastName = lastName;
			// System.out.println("EMAIL CREATED: " + this.firstName + " "+ this.lastName);   //In the process of creating a new email 
		
			
		// Call a method asking for the department - return the department 
			this.department = setDepartment();
			// System.out.println("Department: " + this.department);    // Building a email object set-up 
		
		// Call a method that returns a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);
			
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is " + email); not necessary 
			
			
	}


		// Ask for the department 
		private String setDepartment() {
			System.out.print("New worker: " + firstName + ". DEPARTMENT CODES \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if (depChoice == 1) {return "sales"; }
			else if (depChoice == 2) {return "dev"; }
			else if (depChoice == 3) {return "acct"; }
			else { return ""; }
		}

		// Generate a random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRXTUVWXYZ0123456789#$@#$%^" ;   ///output: generate random password 
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());   // store value in [rand] and select char from array list 
				password[i] = passwordSet.charAt(rand);   // pick random number from the passwordSet and help randomize the passwords for each dep. 
			}
			return new String(password);
		}

		// Set the mailbox capacity 
		public void setMailboxCapcity (int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		// Set the alternate email 
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
		// Change the password 
		public void changePassword(String password) {
			this.password = password;   // these are set methods 
		}
		
		public int getMailboxCapacity( ) { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
		public String getPassword() { return password; }
		
		public String showInfo() {
			return "DISPLAY NAME: " + firstName + " " + lastName +
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		}
		
}
