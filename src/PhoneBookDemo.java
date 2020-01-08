import java.util.ArrayList;
import java.util.Scanner;

import com.github.javafaker.Faker;

public class PhoneBookDemo {

	public static String name, mobileNumber;
	public static int n;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<PhoneBook> entries = new ArrayList<PhoneBook>();
	static Faker faker = new Faker();
	public static void addContact() {

		System.out.println(" No of Records you need enter? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			entries.add(new PhoneBook(faker.name().firstName(), faker.phoneNumber().cellPhone()));
		}
		for (PhoneBook p : entries) {
			System.out.println(p.getname() + " " + p.getnumber());
		}
	}
	
	public static void updateContact() {
		
		for(int i=0;i<entries.size();i++) 
		{
			entries.set(i, new PhoneBook(faker.name().firstName(), faker.phoneNumber().cellPhone()));
		}
		System.out.print("*********************** After Update *******************");
		for (PhoneBook p : entries) {
			System.out.println(p.getname() + " " + p.getnumber());
		}
	}
	
	public static void deleteContact() {
		
		entries.remove(3);
		System.out.print("*********************** After Delete *******************");
		for (PhoneBook p : entries) {
			System.out.println(p.getname() + " " + p.getnumber());
		}
		
	}

	public static void main(String[] args) {
		addContact();
		updateContact();
		deleteContact();
	}
}
