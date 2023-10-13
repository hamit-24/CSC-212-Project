import java.util.*;
public class Event implements Comparable <Event>{
	
	private String title;
	private String location;
	private String date;
	private String time;
	private String contactName;
	private Contact conInEvent;
//	public LinkedList<Contact> eventWithContact = new LinkedList<Contact>();
//	public LinkedList<Event> eventInEvent = new LinkedList<Event>();
	public Event() {
		title = location = date =time = contactName =null;
		conInEvent =null; 
	}
	
	public Event(String title, String location, String date, String time, String contactName) {
		this.title = title;
		this.location = location;
		this.date = date;
		this.time = time;
		this.contactName = contactName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Contact getConInEvent() {
		return conInEvent;
	}

	public void setConInEvent(Contact conInEvent) {
		this.conInEvent = conInEvent;
	}

	@Override
	public String toString() {
		System.out.println("Event title: "+ title);
		System.out.println("Contact name: "+ contactName);
		System.out.println("Event date and time(dd/mm/yyyy hh:mm): "+ date + " "+ time);
		System.out.println("Event location: "+ location);
		return "--------------------";
	}
	public void readEvent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter event title: ");
		this.title = input.nextLine();
		System.out.print("Enter Contact's name: ");
		this.contactName= input.nextLine();
		System.out.print("Enter event date & time: ");
		this.date = input.next();
		this.time = input.next();
		System.out.print("Enter event location: ");
		input.nextLine();//garbage
		this.location = input.nextLine();
	}

	@Override
	public int compareTo(Event o) {
		return this.date.compareTo(o.date);
	}
	public int compareTo(String time) {
		return this.time.compareTo(time);
	}

//	public LinkedList<Contact> getEventWithContact() {
//		return eventWithContact;
//	}
//
//	public LinkedList<Event> getEventInEvent() {
//		return eventInEvent;
//	}
	
	

}
