import java.util.*;
public class Contact implements Comparable<Contact> {

	private String Firstname;
	private String name;
	private String pNumber;
	private String address;
	private String email;
	private String BD;
	private String note;
	private Event eventForContact;
//	public LinkedList<Event> events = new LinkedList<Event>();
	
	
	public Event getEventForContact() {
		return eventForContact;
	}
	public void setEventForContact(Event eventForContact) {
		this.eventForContact = eventForContact;
	}
	public Contact() {
		Firstname = name= pNumber = address = email = BD = note = null;
		eventForContact = null;
	}
	// ماتوقع نحتاجه
	public Contact(String Firstname, String pNumber, String address, String email, String bD, String note) {
		this.Firstname = Firstname;
//		this.name = Firstname+" "+Lastname;
		this.pNumber = pNumber;
		this.address = address;
		this.email = email;
		this.BD = bD;
		this.note = note;
	}
//	public Event getEventForContact() {
//		return eventForContact;
//	}
//	public void setEventForContact(Event eventForContact) {
//		this.eventForContact = eventForContact;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contact(Contact con) {
		this.Firstname = con.Firstname;
		this.pNumber = con.pNumber;
		this.address = con.address;
		this.email = con.email;
		BD = con.BD;
		this.note = con.note;
		}

	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String contactFirstname) {
		this.Firstname = contactFirstname;
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
//	public int compareTo(String Firstname) {
//		return this.Firstname.compareTo(Firstname);
//	}
	public int compareTo(Contact o) {
		return name.compareTo(o.name);
	}
	public void readContact() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the contact's name:");
		this.name = input.nextLine();
        // Split the full name using a space as the delimiter
        String[] parts = name.split(" ");

        // Check if there are at least two parts (first name and last name)
        if (parts.length >= 2) 
        	Firstname = parts[0]; // The first name is the first part (index 0)
  
		System.out.println("Enter the contact's phone number:");
		this.pNumber= input.nextLine();
		System.out.println("Enter the contact's email address:");
		this.email = input.nextLine();
		System.out.println("Enter the contact's address:");
		this.address = input.nextLine();
		System.out.println("Enter the contact's birthday: dd/mm/yyyy");
		this.BD = input.nextLine();
		System.out.println("Enter any notes for the contact");
		this.note = input.nextLine();
//		events=null;
        
	}
	@Override
	public String toString() {
		System.out.println("name: " +name);
		System.out.println("Phone Number: " +pNumber);
		System.out.println("Email Address: " + email);
		System.out.println("Address: " +address);
		System.out.println("Birthday: " +BD);
		System.out.println("Notes: " +note);
//		System.out.println("");
		return "--------------------";
		
	}
	public void display() {
		System.out.println("name:" +name);
		System.out.println("Phone Number:" +pNumber);
		System.out.println("Email Address:" + email);
		System.out.println("Address:" +address);
		System.out.println("Birthday:" +BD);
		System.out.println("Notes:" +note);
		System.out.println("--------------------");

	}
	public boolean hasEvent() {
		if(eventForContact!= null)
			return true;
		return false;
	}
//	public LinkedList<Event> getEvents() {
//		return events;
//	}
	

}
