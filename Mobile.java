package week1.day1;

public class Mobile {
	public static void main(String args[]) {
		 	Mobile object = new Mobile();
		 	object.saveContact();
		 	object.sendMessage();
		 	object.makeCall();
		 			
	}
	
	public void saveContact() {
		System.out.println("The contact is saved");
		
	}
	
	private void sendMessage() {
		System.out.println("Message is sent successfully");
		
	}

    void makeCall() {
		System.out.println("Dialling");
		
	}


}
