
public class Contact {
	String name; 
	String phoneNumber;
	
	// Non parametric constructor
	public Contact() {
		this.name=null;
		this.phoneNumber=null;
	}
	// Parametric constructor
	public Contact(String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		
	}
	// setter methods 
	public void  setName(String name) {
		this.name=name;
	}
	
	public void setNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}

	
	
	public void displayContacts(){
		System.out.println(this.name);
		System.out.println(this.phoneNumber);
		
	}
}
