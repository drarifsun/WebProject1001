package OOP;

public class Teacher {
	
	String name;
	String gender;
	String subject;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher Teacher1 = new Teacher();
		
		Teacher1.name = "Mokter Hossain";
		Teacher1.gender = "Male";
		Teacher1.subject = "Automation java";
		Teacher1.age = 48;
		
		
		System.out.println("Name is "+Teacher1.name);
		System.out.println("Gender is "+Teacher1.gender);
		System.out.println("Subject is "+Teacher1.subject);
		System.out.println("Age is "+Teacher1.age);
		System.out.println("\n");
		
		
		//==========================================================
				
				
		Teacher Teacher2 = new Teacher();
		
		Teacher2.name = "Lutfor Rahman Khan";
		Teacher2.gender = "Male";
		Teacher2.subject = "Manual Testing and Database";
		Teacher2.age = 47;

		System.out.println("Name is "+Teacher2.name);
		System.out.println("Gender is "+Teacher2.gender);
		System.out.println("Subject is "+Teacher2.subject);
		System.out.println("Age is "+Teacher2.age);
		
	}
	
}