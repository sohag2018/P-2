package practice1125;

public class StaticAndNonSataticConcept {
	
	String name = "Tom";
	static int age = 25;
	
	

	public static void main(String[] args) {
		
		sum();
		StaticAndNonSataticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonSataticConcept.age);
		
		StaticAndNonSataticConcept obj = new StaticAndNonSataticConcept();
		obj.sendMail();
		System.out.println(obj.name);
	}

	public void sendMail() {
	System.out.println("Send mail Method");	
		
	}
	
	public static void sum() {
		System.out.println("Sum Method");
		
	}
}
