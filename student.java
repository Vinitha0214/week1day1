package week1.day1;

public class student {
	String name = "Vinitha";
	byte rollNumber = 26;
	
	public static void main(String args[]) {
		student object= new student();
		String stName = object.name;
		System.out.println("My name is " + stName);
		byte num=object.rollNumber;
		System.out.println("Roll number is " + num);
		
		System.out.println("My college is " + object.college());
		
	}
	

	public String college() {
		String collegeName = "Kongu college of engineering";
		return collegeName;
		
	}

}
