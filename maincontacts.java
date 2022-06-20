
public class maincontacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactsManager c  = new  ContactsManager(); // Point No 7
		// passing the name and number to array of the Contacts in contact manager
		c.addContacts("Hanan", "325467");
		c.addContacts("Manan", "45645657");
		
		
		Contact cs= new Contact(); 
		cs=c.searchContacts("Hanan");
		
		System.out.println("Point 7");
		System.out.println(" Here is the contact : ");
		cs.displayContacts();
		System.out.println("\n");
		//--------------------------------------------------------------------------------//
		
		Contact cs1= new Contact();// Point No 8
		cs1.setName("Iqra");      // Point No 9
		cs1.setNumber("45677677");// Point No 10
		
		
		
		c.addContacts(cs1);   // Point No 11
		
		// Searching the contact in the array
		Contact cs2= new Contact();
		cs2=c.searchContacts("Iqra");
		// Searching second contact in the array
		System.out.println("Point 11");
		System.out.println(" Here is the contact :  ");
		cs2.displayContacts();
		System.out.println("\n");
		
		// adding 3 more contacts
		
		c.addContacts("Usman", "45464564534");
		c.addContacts("Zeeshan", "3345464324235345");
		c.addContacts("Shahzad", "32546756634");
		
		Contact cs3= new Contact(); 
		cs3=c.searchContacts("Usman");
		
		System.out.println(" The contact you seached is : ");
		cs3.displayContacts();
		System.out.println("\n");
		
		
		Contact cs4= new Contact(); 
		cs4 =c .searchContacts("Zeeshan");
		
		System.out.println(" The contact you seached is : ");
		cs4.displayContacts();
		System.out.println("\n");
		
		
		Contact cs5= new Contact(); 
		cs5 =c .searchContacts("Shahzad");
		
		System.out.println(" The contact you seached is : ");
		cs5.displayContacts();
		System.out.println("\n");

	}

}
