import java.util.*;
public class Contact implements Comparable<String> {

	private String name;
	private String pNumber;
	private String address;
	private String email;
	private String BD;
	private String note;
	public Event eventForContact;
	public LinkedList<Event> events = new LinkedList<Event>();
	
	
	public Contact() {
		name = pNumber = address = email = BD = note = null;
	}
	public Contact(String name, String pNumber, String address, String email, String bD, String note) {
		this.name = name;
		this.pNumber = pNumber;
		this.address = address;
		this.email = email;
		BD = bD;
		this.note = note;
	}
	public Contact(Contact con) {
		this.name = con.name;
		this.pNumber = con.pNumber;
		this.address = con.address;
		this.email = con.email;
		BD = con.BD;
		this.note = con.note;
		}

	
	public String getname() {
		return name;
	}
	public void setname(String contactname) {
		this.name = contactname;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBD() {
		return BD;
	}
	public void setBD(String bD) {
		BD = bD;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public int compareTo(String name) {
		return this.name.compareTo(name);
	}
	public int compareTo(Contact o) {
		return name.compareTo(o.name);
	}
	public void readContact() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the contact's name:");
		this.name =input.next();
		System.out.println("Enter the contact's phone number:");
		this.pNumber= input.next();
		System.out.println("Enter the contact's email address:");
		this.email = input.next();
		System.out.println("Enter the contact's address:");
		this.address = input.next();
		System.out.println("Enter the contact's birthday: dd/mm/yyyy");
		this.BD = input.next();
		System.out.println("Enter any notes for the contact");
		this.note = input.next();
		input.close();
		
	}
	public void display() {
		System.out.println("name:" +name);
		System.out.println("Phone Number:" +pNumber);
		System.out.println("Email Address:" + email);
		System.out.println("Address:" +address);
		System.out.println("Birthday:" +BD);
		System.out.println("Notes:" +note);
		System.out.println("");

	}
//	public void main(String []args) {
//		readContact();
//	}
	public LinkedList<Event> getEvents() {
		return events;
	}

}
