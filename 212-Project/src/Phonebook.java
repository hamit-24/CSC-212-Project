
public class Phonebook {
	static LinkedList<Contact> contacts;
	static LinkedList<Event> events;
	public Phonebook() {
		contacts = new LinkedList<Contact>();
		events = new LinkedList<Event>();
	}
	public Phonebook(LinkedList<Contact> c) {// i think we won't use it.
		contacts = c;
	}
//	public void addContact(Contact c) {
//		if(contacts.isEmpty()) {
//			contacts.insert(c);
//		}else {
//			contacts.findFirst();
//			if(c.getname().compareTo(contacts.retrive().getname())<0) {
//				
//			}
//		}
//	}
	public boolean search(Contact c) {
		if(contacts.isEmpty())
			return false;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getName().equals(c.getName())||contacts.retrive().getpNumber().equals(c.getpNumber())) 
				return true;
			contacts.findNext();	
		}
		if(contacts.retrive().getName().equals(c.getName())||contacts.retrive().getpNumber().equals(c.getpNumber())) 
			return true;
		return false;
	}
	public void addContact(Contact c) {
		
//		boolean founded = search(c);
		if(!search(c)) {
			contacts.addSorted(c);
			System.out.println("Contact added");
			System.out.println("");
			return;	
		}else {
		System.out.println("-There is a contact with tha same name or phone number");
		System.out.println("--------------------");
		   }
		}
	public void addContactByRead() {
		Contact c = new Contact();
		c.readContact();
		addContact(c);
	}
	public void deleteContact(String name) {
		if(contacts.isEmpty()) {
			System.out.println("The linked list is empty!"
					+ "you can't delete");
			System.out.println("--------------------");
			return;
		}
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getName().equalsIgnoreCase(name)) {
				contacts.remove();
				System.out.println("Contact "+name+" deleted");
				System.out.println("--------------------");
				return;
			}
			contacts.findNext();
		}
		if(contacts.retrive().getName().equalsIgnoreCase(name)) {
			contacts.remove();
			System.out.println("Contact "+name+" deleted");
			System.out.println("--------------------");
			return;
		}else {
			System.out.println("Contact doesn't exist, you can't delet");
		}
	}
	public Contact searchByFirstName(String fname) {
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getFirstname().equalsIgnoreCase(fname))
				return contacts.retrive();
			contacts.findNext();
		}
		if(contacts.retrive().getFirstname().equalsIgnoreCase(fname))
			return contacts.retrive();
		return null;
	}
	
	
	
	
	public Contact searchByName(String name) {
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getName().equalsIgnoreCase(name))
				return contacts.retrive();
			contacts.findNext();
		}
		if(contacts.retrive().getName().equalsIgnoreCase(name))
			return contacts.retrive();
		return null;
	}
	public Contact searchByPhone(String phone) {
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getpNumber().equalsIgnoreCase(phone))
				return contacts.retrive();
			contacts.findNext();
		}
		if(contacts.retrive().getpNumber().equalsIgnoreCase(phone))
			return contacts.retrive();
		return null;
	}
	public LinkedList<Contact> searchByFirsName(String fname){
		LinkedList<Contact> samefname = new LinkedList<Contact>();
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getFirstname().equalsIgnoreCase(fname))
				samefname.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getFirstname().equalsIgnoreCase(fname))
			samefname.insert(contacts.retrive());
		return samefname;
		
	}

	public LinkedList<Contact> searchByEmail(String e){
		LinkedList<Contact> samemail = new LinkedList<Contact>();
		if(contacts.isEmpty()) 
			return samemail;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getEmail().equalsIgnoreCase(e))
				samemail.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getEmail().equalsIgnoreCase(e))
			samemail.insert(contacts.retrive());
		return samemail;
		
	}
	public LinkedList<Contact> searchByAddress(String ad){
		LinkedList<Contact> sameaddress = new LinkedList<Contact>();
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getAddress().equalsIgnoreCase(ad))
				sameaddress.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getAddress().equalsIgnoreCase(ad))
			sameaddress.insert(contacts.retrive());
		return sameaddress;
		
	}
	public LinkedList<Contact> searchByBirthday(String bd){
		LinkedList<Contact> sameBD = new LinkedList<Contact>();
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getBD().equalsIgnoreCase(bd))
				sameBD.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getBD().equalsIgnoreCase(bd))
			sameBD.insert(contacts.retrive());
		return sameBD;
	}
	public static void allContactsInPB(Phonebook ph) {
		if(ph.contacts.isEmpty())
			System.out.println("The phonebook is empty");
		ph.contacts.findFirst();
		while(!ph.contacts.last()) {
			ph.contacts.retrive().display();
			ph.contacts.findNext();
		}
		ph.contacts.retrive().display();
	}
	public static void allContactsInLL(LinkedList<Contact> l) {
		if(l.isEmpty())
			System.out.println("Empty list");
		l.findFirst();
		while(!l.last()) {
			l.retrive().display();
			l.findNext();
		}
		l.retrive().display();
	}
	public static void allContactsByName(LinkedList<Contact> l) {
		if(l.isEmpty())
			System.out.println("List is empty");
		l.findFirst();
		while(!l.last()) {
			System.out.println(l.retrive().getName());
			System.out.println("");
			l.findNext();
		}
		System.out.println(l.retrive().getName());
		System.out.println("");
	}
//	public static void allEventsInLL(LinkedList<Event> ev) {
//		if(ev.isEmpty())
//			System.out.println("There is no events");
//		ev.findFirst();
//		while(!ev.last()) {
//			System.out.println(ev.retrive());
//			System.out.println("Those contacts share this event");
//			allContactsByName(ev.retrive().eventWithContact);
//			System.out.println("");
//			ev.findNext();
//		}
//		System.out.println(ev.retrive());
//		System.out.println("Those contacts share this event");
//		allContactsByName(ev.retrive().eventWithContact);
//		System.out.println("");
//
//	}
	
	public Event searchEventByTitle(String ti) {
		if(events.isEmpty())
			return null;
		events.findFirst();
		while(!events.last()) {
			if(events.retrive().getTitle().equalsIgnoreCase(ti))
				return events.retrive();
			events.findNext();
		}
		if(events.retrive().getTitle().equalsIgnoreCase(ti))
			return events.retrive();
		return null;
	}
	//نفس الي فوق بس ذي تعطي بوليان والي فوق ترجع ايفينت
	public boolean bsearchEventByTitle(String ti) {
		if(events.isEmpty())
			return false;
		events.findFirst();
		while(!events.last()) {
			if(events.retrive().getTitle().equalsIgnoreCase(ti))
				return true;
			events.findNext();
		}
		if(events.retrive().getTitle().equalsIgnoreCase(ti))
			return true;
		return false;
	}
	
	public void addEvent(Event e) {
		if(!isConflict(e, searchByName(e.getContactName()))) {
			events.addSorted(e);
			System.out.println("Event scheduled successfully!");
			System.out.println("--------------------");
		}else {
			System.out.println("There is an event with same date & time!");
			System.out.println("--------------------");
		}
			
	}
	public void addEventbyread() {
		Event e = new Event();
		e.readEvent();
		e.setConInEvent(searchByName(e.getContactName()));
		addEvent(e);
	}
	
//	public LinkedList<Event> getEventInContact(String name){
//		Contact c = searchByName(name);
//		if(c!=null)
//			return c.getEvents();
//		return null;	
//	}
	

	

//	public LinkedList<Contact> getContactsInEvent(String title) {
//		Event e = searchEventByTitle(title);
//		if(e!=null)
//			return e.getEventWithContact();
//		return null;
//	}

//	public boolean isConflict(Event e, Contact c) {
//		if(c.events.isEmpty())
//			return false;
//		c.events.findFirst();
//		while(!c.events.last()) {
//			if(c.events.retrive().getDate().equals(e.getDate())&&c.events.retrive().getTime().equals(e.getTime()))
//					return true;
//			c.events.findNext();
//		}
//		if(c.events.retrive().getDate().equals(e.getDate())&&c.events.retrive().getTime().equals(e.getTime()))
//			return true;
//		return false;
//	}
	public boolean isConflict(Event e, Contact c) {
		if(c.eventForContact.getTime().compareTo(e.getTime())!=0&&c.eventForContact.getDate().compareTo(e.getDate())!=0)
			return false;
		return true;
	}
//	public void scheduleEvent(Event e, String cName) {
//		Contact c = searchByName(cName);
//		if(c==null) {
//			System.out.println("You can't schedule, the contact dosen't exist!");
//			return;
//		}
//		if(isConflict(e, c)) {
//			System.out.println("You can't schedule, there is conflict");
//			return;
//		}
//		System.out.println("scheduling contact "+ c.getname()+"'"+e.getTitle());
//		e.setContactName(cName);
//		e.setConInEvent(c);
//		c.eventForContact=e;
//		c.eventForContact.eventInEvent.addSorted(e);
//		e.eventWithContact.addSorted(c);
//		
//			
//			
//	
//	}
}
