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

public class Phonebook {
	LinkedList<Contact> contacts;
    LinkedList<Event> events;
    
    
	public Phonebook() {
		contacts = new LinkedList<Contact>();
		events = new LinkedList<Event>();
	}
	
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
	
	public void addContact() {
		Contact c = new Contact();
		c.readContact();
		
		
		if(!search(c)) {
			contacts.addSorted(c);
			System.out.println("-Contact added successfully");
			System.out.println("--------------------");
			return;	
		}
		else {
		System.out.println("-There is a contact with tha same name or phone number");
		System.out.println("--------------------");
		   }
		}
	
	public void deleteContact(String name) {
		
		if(contacts.isEmpty()) {
			System.out.println("-The linked list is empty! you can't delete");				
			System.out.println("--------------------");
			return;
		}
		
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getName().equalsIgnoreCase(name)) {
				deletEvent(name);
				contacts.remove();
				System.out.println("-Contact "+name+" deleted");
				System.out.println("--------------------");
				return;
			}
			contacts.findNext();
		}
		if(contacts.retrive().getName().equalsIgnoreCase(name)) {
			deletEvent(name);
			contacts.remove();
			System.out.println("-Contact "+name+" deleted");
			System.out.println("--------------------");
			return;
		}
		else {
			System.out.println("-Contact doesn't exist, you can't delete");
			System.out.println("--------------------");
		}
	}
	
	public void deletEvent(String name) {
		
		if(events.isEmpty())
			return;
		
		events.findFirst();
		while(!events.last()) {
			if(events.retrive().getContactName().equalsIgnoreCase(name)) {
				events.remove();
				return;
			}
			events.findNext();
		}
		if(events.retrive().getContactName().equalsIgnoreCase(name)) {
			events.remove();
			return;
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
		
		fname=fname.toLowerCase();
		
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
	
	public LinkedList<Contact> searchByEmail(String e){		//e--->email
		
		LinkedList<Contact> sameEmail = new LinkedList<Contact>();
		if(contacts.isEmpty()) 
			return null;
		
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getEmail().equalsIgnoreCase(e))
				sameEmail.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getEmail().equalsIgnoreCase(e))
			sameEmail.insert(contacts.retrive());
		return sameEmail;
		
	}
	
	public LinkedList<Contact> searchByAddress(String ad){		//ad--->address
		
		LinkedList<Contact> sameAddress = new LinkedList<Contact>();
		if(contacts.isEmpty())
			return null;
		
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getAddress().equalsIgnoreCase(ad))
				sameAddress.insert(contacts.retrive());
			contacts.findNext();
		}
		if(contacts.retrive().getAddress().equalsIgnoreCase(ad))
			sameAddress.insert(contacts.retrive());
		return sameAddress;
		
	}
	
	public LinkedList<Contact> searchByBirthday(String bd){		//bd--->birthday
		
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
		
	//searches for event by title and adds it to a linked list.
	public LinkedList<Event> searchEventByTitle(String ti) {  //ti--->title.
		LinkedList<Event> t= new LinkedList<Event>();
		
		if(events.isEmpty())
			return null;
		
		events.findFirst();
		while(!events.last()) {
			if(events.retrive().getTitle().equalsIgnoreCase(ti))
				t.addSorted(events.retrive());
				
			events.findNext();
		}
		if(events.retrive().getTitle().equalsIgnoreCase(ti))
			t.addSorted(events.retrive());
		
		return t;
	}	
		
	
	
	
	// this method adds event to contact.
	public void addEvent() {
		Event e = new Event();
	    e.readEvent();		 
	    Contact c = searchByName(e.getContactName());
		e.setConInEvent(c);	// sets Event's contact. 
		
		if(!isConflict(e, c)) {
			events.addSorted(e);
			e.setConInEvent(c);
			contacts.findFirst();
			while(!contacts.last()) {
				if(contacts.retrive().compareTo(c)==0) {
					contacts.retrive().setEventForContact(e);
					System.out.println("-Event scheduled successfully!");
					System.out.println("--------------------");
					return;
				}
				contacts.findNext();
			}
			if(contacts.retrive().compareTo(c)==0) {
				contacts.retrive().setEventForContact(e);
			    System.out.println("-Event scheduled successfully!");
			    System.out.println("--------------------");
			return;
			}
		}
			
	}
	
	// this method checks if there is an event with same time and date
	public boolean isConflict(Event e, Contact c) {
		
		if(c == null) {
			System.out.println("-there is no contact with this name");
			System.out.println("--------------------");
			return true;
		}
		if(c.hasEvent()) {
			System.out.println("-The contact already has an event");
			System.out.println("--------------------");
			return true;
		}
		else {
			if(events.isEmpty())
				return false;
			
			events.findFirst();
			while(!events.last()) {
				if(events.retrive().getDate().compareTo(e.getDate())==0
						&&events.retrive().getTime().compareTo(e.getTime())==0) {
					System.out.println("-There is an event with same date & time!");
					System.out.println("--------------------");	
					return true;
				}
				events.findNext();
			}

			if(events.retrive().getDate().compareTo(e.getDate())==0
					&&events.retrive().getTime().compareTo(e.getTime())==0) {
				System.out.println("-There is an event with same date & time!");
				System.out.println("--------------------");	
				return true;
			}
				 
			return false;
		}
		
	}

}
