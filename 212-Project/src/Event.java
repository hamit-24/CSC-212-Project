
public class Event {
	
	private String title;
	private String location;
	private String date;
	private String time;
	private String contactName;
	private Contact conInEvent;
	public LinkedList<Contact> eventWithContact = new LinkedList<Contact>();
	public LinkedList<Event> eventInEvent = new LinkedList<Event>();
	
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
		return "Event [title=" + title + ", location=" + location + ", date=" + date + ", time=" + time
				+ ", contactName=" + contactName + "]";
	}

	public LinkedList<Contact> getEventWithContact() {
		return eventWithContact;
	}

	public LinkedList<Event> getEventInEvent() {
		return eventInEvent;
	}
	
	

}
