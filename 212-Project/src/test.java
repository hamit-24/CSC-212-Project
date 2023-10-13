import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook ph = new Phonebook();
        int choice=0;
        int crit=0;
        System.out.println("Welcome to the linked tree phonebook");

        do {
           
            System.out.println("Please choose an option: ");
            System.out.println("1- Add contact");
            System.out.println("2- Search for a contact");
            System.out.println("3- Delete a contact");
            System.out.println("4- Schedule an event");
            System.out.println("5- Print event details");
            System.out.println("6- Print Contact by first name");
            System.out.println("7- Print all events alphabetically");
            System.out.println("8- Exit");
            System.out.print("Enter your choice: ");
            try {
            	choice = input.nextInt();
            	System.out.println("--------------------");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                input.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    ph.addContactByRead();
                    ph.contacts.display();
                    break;
                case 2:
                	do {
                		System.out.println("Choose a criteria");
                		System.out.println("1- Name");
                    	System.out.println("2- Phone number");
                    	System.out.println("3- Email Address");
                    	System.out.println("4- Address");
                    	System.out.println("5- Birthday");
                    	System.out.print("Enter your choice: ");
                	 try {
                		 crit = input.nextInt();
                     } catch (Exception e) {
                         System.out.println("Invalid input. Please enter a valid option.");
                         System.out.println("--------------------");
                         input.nextLine(); // Consume the invalid input
                         continue;
                     }
                	 if(crit<1||crit>5)
                		 System.out.println("Please choose 1-5");
                	}while(crit<1||crit>5);
                	if(crit==1) {
                		System.out.print("Enter the contact's name: ");
                		input.nextLine();//garbage
                		String name = input.nextLine();
                		System.out.println("--------------------");
                		Contact c = ph.searchByName(name);
                		if(c==null)
                			System.out.println("-Contact not found");
                		else
                		    c.display();
                	}else if(crit == 2) {
                		System.out.print("Enter the contact's phone number: ");
                		Contact c = ph.searchByPhone(input.next());
                		System.out.println("--------------------");
                		if(c==null) {
                			System.out.println("-Contact not found");System.out.println("--------------------");
                		}else
                		    c.display();
                	}else if(crit ==3) {
                		System.out.print("Enter the contact's email address: ");
                		LinkedList<Contact> L = ph.searchByEmail(input.next());
                		System.out.println("--------------------");
                		if(L==null) {
                			System.out.println("-Contact not found");System.out.println("--------------------");
                		}else
                		    L.display();
                	}else if(crit ==4) {
                		System.out.print("Enter the contact's address: ");
                		input.nextLine();//garbage
                		LinkedList<Contact> L = ph.searchByAddress(input.nextLine());
                		System.out.println("--------------------");
                		if(L==null) {
                			System.out.println("-Contact not found");System.out.println("--------------------");
                		}else
                		    L.display();
                	}else if(crit ==5) {
                		System.out.print("Enter the contact's birthday(dd/mm/yyyy): ");
                		LinkedList<Contact> L = ph.searchByBirthday(input.next());
                		System.out.println("--------------------");
                		if(L==null) {
                			System.out.println("Contact not found");System.out.println("--------------------");
                		}else
                		    L.display();
                	}
                	
                    // Implement search functionality
                    break;
                case 3:
                	System.out.print("Enter the contact's name: ");
                	input.nextLine();//garbage
                	String name = input.nextLine();
                	ph.deleteContact(name);
                    // Implement delete functionality
                    break;
                case 4:

                	ph.addEventbyread();
                	ph.events.display();
                    break;
                    // Implement event scheduling
                case 5:
                	System.out.println("Enter search name criteria:");
                	System.out.println("1- Contact name");
                	System.out.println("2- Event title");
                	System.out.print("Enter your choice: ");
                	crit = input.nextInt();
                	if(crit!= 1 && crit!= 2) {
                		do {
                			System.out.println("Please enter 1 or 2");
                			System.out.print("Enter your choice: ");
                        	crit = input.nextInt();
                		}while(crit != 1 && crit !=2);
                	
                	} else if(crit == 1) {
                		System.out.print("Enter the contact name: ");
                		input.nextLine();//garbage
                		Contact c = ph.searchByName(input.nextLine());
                		System.out.println("--------------------");
                		if(c == null) {
                			System.out.println("-There is no contact with this name.");
                			System.out.println("--------------------");
                			break;
                		}
                		if(!c.hasEvent()) {
                			System.out.println("-There is no events with this contact");
                			System.out.println("--------------------");
                			break;
                		}else {
                			c.getEventForContact().toString();
                			System.out.println("--------------------");
                		}	
                	}else{
                		System.out.print("Enter the event title: ");
                		input.nextLine();//garbage
                		Event e = ph.searchEventByTitle(input.nextLine());
                		System.out.println("--------------------");
                		if(e==null) {
                			System.out.println("-There is no event with this title.");
                			System.out.println("--------------------");
                		}else {
                			e.toString();
                			System.out.println("--------------------");
                		}
                	}
                	break;
//                    // Implement event details printing
                case 6:
                	System.out.print("Enter the first name: ");
                    input.nextLine();//garbage
                	String fname = input.nextLine();
                	LinkedList<Contact> L = ph.searchByFirsName(fname);
                	System.out.println("--------------------");
                	if(L==null) {
                		System.out.println("-Contact not found");
                		System.out.println("--------------------");
                		break;
                    }
                	if(L.retrive()==null) {
                    	L.findFirst();
            			System.out.println("-Contact not found");
            			System.out.println("--------------------");
                	}else
            		    L.display();
                    // Implement printing contacts by first name
                    break;
                case 7:
                	ph.events.display();
                    // Implement printing events alphabetically
                    break;
                case 8:
                    System.out.println("Exiting the phonebook.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        } while (choice != 8);
    }
}