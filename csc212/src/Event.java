/*
CLASS: PhaseOne.java

CSC212 Data structures - Project phase I

Fall 2023

EDIT DATE:

17-10-2023

TEAM:

.next

AUTHORS:

Hamad allaeboon , (ID443100096)
Abdullah alabdulkareem, (ID443102379)
Mshari almuammar, (ID443101420)
 */
import java.util.*;
public class Event implements Comparable <Event>{
	
	private String title;
	private String location;
	private String date;
	private String time;
	private String contactName;
	private Contact conInEvent;

	
	public Event() {
		title = location = date =time = contactName =null;
		conInEvent =null; 
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
	
	//reads event info from user.
	public void readEvent() {
		int day=40,month=40,year=0,hour=25,minute=61;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter event title: ");
		this.title = input.nextLine();
		this.title=title.toLowerCase();
		System.out.print("Enter Contact's name: ");
		this.contactName= input.nextLine();
		System.out.println("Enter the event's date: ");
		do {
			try {
				System.out.print("Enter the day: ");
				day=input.nextInt();
				System.out.print("Enter the month: ");
				month=input.nextInt();
				System.out.print("Enter the year: ");
				year=input.nextInt();
				System.out.print("Enter the hour: ");
				hour=input.nextInt();
				System.out.print("Enter the minute: ");
				minute=input.nextInt();
			}catch (Exception e) {
				System.out.println("-Invalid input. Please enter a valid minute/hour/day/month/year.");
				System.out.println("--------------------");
				input.nextLine();
				continue;
			}
			if(day>31||month>12||hour>24||minute>60)
				System.out.println("-Please enter day<32,month<13,hour<24,minute<60 ");
		}while(day>31||month>12||hour>24||minute>60);
		date = day+"/"+month+"/"+year;
		time= hour+":"+minute;
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

}