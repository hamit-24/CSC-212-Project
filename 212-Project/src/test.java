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
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                input.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    ph.addContactByRead();
                    break;
                case 2:
                	do {
                		System.out.println("Choose a criteria");
                		System.out.println("1- Name");
                    	System.out.println("2- Phone number");
                    	System.out.println("3- Email Address");
                    	System.out.println("4- Address");
                    	System.out.println("5- Birthday");
                	 try {
                		 crit = input.nextInt();
                     } catch (Exception e) {
                         System.out.println("Invalid input. Please enter a valid option.");
                         input.nextLine(); // Consume the invalid input
                         continue;
                     }
                	 if(crit<1||crit>5)
                		 System.out.println("Please choose 1-5");
                	}while(crit<1||crit>5);
                	if(crit==1) {
                		System.out.print("Enter the contact's name: ");      		
                		Contact c = ph.searchByName(input.next());
                		if(c==null)
                			System.out.println("Contact not found");
                		else
                		    c.display();
                	}else if(crit == 2) {
                		System.out.print("Enter the contact's phone number: ");
                		Contact c = ph.searchByPhone(input.next());
                		if(c==null)
                			System.out.println("Contact not found");
                		else
                		    c.display();
                	}else if(crit ==3) {
                		System.out.print("Enter the contact's email address: ");
                		LinkedList<Contact> L = ph.searchByEmail(input.next());
                		if(L==null)
                			System.out.println("Contact not found");
                		else
                		    L.display();
                	}else if(crit ==4) {
                		System.out.print("Enter the contact's address: ");
                		LinkedList<Contact> L = ph.searchByAddress(input.next());
                		System.out.println("--------------------");
                		if(L==null)
                			System.out.println("Contact not found");
                		else
                		    L.display();
                	}else if(crit ==5) {
                		System.out.print("Enter the contact's birthday: ");
                		LinkedList<Contact> L = ph.searchByBirthday(input.next());
                		if(L==null)
                			System.out.println("Contact not found");
                		else
                		    L.display();
                	}
                	
                    // Implement search functionality
                    break;
                case 3:
                	System.out.print("Enter the contact's name");
                	String name = input.next();
                	ph.deleteContact(name);
                    // Implement delete functionality
                    break;
                case 4:
                	ph.addEventbyread();
                    break;
                    // Implement event scheduling
                case 5:
                    // Implement event details printing
                    break;
                case 6:
                	System.out.print("Enter the first name: ");
                	LinkedList<Contact> L = ph.searchByFirsName(input.next());
                	if(L==null)
            			System.out.println("-Contact not found");
            		else
            		    L.display();
                	System.out.println("--------------------");
                    // Implement printing contacts by first name
                    break;
                case 7:
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