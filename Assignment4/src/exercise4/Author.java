package exercise4;
import java.util.Scanner;

public class Author {
	
	private String name;
	private String mail;
	private char gender;
	
	public Author() {
		super();
	}

	public Author(String name, String mail, char gender) {
		super();
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "name=" + name + ", mail=" + mail;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		name = sc.nextLine();
		System.out.println("Input email: ");
		mail = sc.nextLine();
		
	}

}
