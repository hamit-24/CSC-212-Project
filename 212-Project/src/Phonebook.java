
public class Phonebook {
	static LinkedList<Contact> contacts;
	
	public Phonebook() {
		contacts = new LinkedList<Contact>();
	}
	public Phonebook(LinkedList<Contact> c) {// i think we won't use it.
		contacts = c;
	}
	/*public void addContact(Contact c) {
		if(contacts.isEmpty()) {
			contacts.insert(c);
		}else {
			contacts.findFirst();
			if(c.getname().compareTo(contacts.retrive().getname())<0) {
				
			}
		}
	}*/
	public boolean search(Contact c) {
		if(contacts.isEmpty())
			return false;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getname().equals(c.getname())||contacts.retrive().getpNumber().equals(c.getpNumber())) 
				return true;
			contacts.findNext();	
		}
		if(contacts.retrive().getname().equals(c.getname())||contacts.retrive().getpNumber().equals(c.getpNumber())) 
			return true;
		return false;
	}
	public void addContact(Contact c) {
		boolean founded = search(c);
		if(!founded)
			contacts.addSorted(c);
	}
	public void deleteContact(String name) {
		if(contacts.isEmpty()) {
			System.out.println("The linked list is empty!"
					+ "you can't delete");
			return;
		}
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getname().equalsIgnoreCase(name)) {
				contacts.remove();
				System.out.println("Contact "+name+" deleted");
				return;
			}
			contacts.findNext();
		}
		if(contacts.retrive().getname().equalsIgnoreCase(name)) {
			contacts.remove();
			System.out.println("Contact "+name+" deleted");
			return;
		}else {
			System.out.println("Contact doesn't exist, you can't delet");
		}
	}
	public Contact searchByName(String name) {
		if(contacts.isEmpty())
			return null;
		contacts.findFirst();
		while(!contacts.last()) {
			if(contacts.retrive().getname().equalsIgnoreCase(name))
				return contacts.retrive();
			contacts.findNext();
		}
		if(contacts.retrive().getname().equalsIgnoreCase(name))
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

}
