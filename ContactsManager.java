import java.util.*;
	public class ContactsManager {
		ArrayList<Contact> contactlistArrayList = new ArrayList<contact>();
	int contactsCount=0;
	
	
	
	public void addContacts(Contact s) {
		myContacts[contactsCount]=s;
		contactsCount++;    // Point no 1
	}
	
	public void addContacts(String name, String phoneNumber) { // Point no 3
		Contact c = new Contact(name,phoneNumber);
		myContacts[contactsCount]=c;
		contactsCount++;
	}
	//-----------------------------------------------------------------------------------------------------//
	public Contact searchContacts(String name) { // Point no 4
		
		Contact c = new Contact();
		boolean flag = false;
		
		for(int i=0; i<contactsCount; i++) {
			
			if(myContacts[i].name==name) {
				
				c=myContacts[i];
				flag= true;
				break;
			}

		}
		
		if(flag==false) {
			System.out.println(" The contact is not in the list ");
		}
		
		return c;
	}

}
