package package1;

public class student {
	
	String Name;
	int Roll;
	float Marks;
	
	public void setdata(String Name, int Roll, float Marks) {
		
		this.Name=Name;
		this.Roll=Roll;
		this.Marks=Marks;
		
	}
	
public void display() {
		
		System.out.println("Name of the student is "+ this.Name);
		System.out.println("Bearing the Roll no "+ this.Roll);
		System.out.println("Marks obtained "+ this.Marks);
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student S1 = new student();
		S1.setdata("Mamun", 001, 98.5f);
		S1.display();
		
		student S2 = new student();
		S2.setdata("Nazmul", 002, 97f);
		S2.display();
		
		student S3 = new student();
		S3.setdata("Arif", 003, 97.5f);
		S3.display();
		
		student S4 = new student();
		S4.setdata("Saiful", 004, 96f);
		S4.display();
		
		/*S1.Name = "Syed Mamun";
		S1.Roll = 225;
		S1.Marks = 78.7f;
		
		System.out.println("The student's name is "+S1.Name);
		System.out.println("Roll no is "+S1.Roll);
		System.out.println("Total marks obtained "+S1.Marks);
		System.out.println("\n");
		
		S2.Name = "Nazmul Hossain";
		S2.Roll = 216;
		S2.Marks = 77f;
		
		System.out.println("The student's name is "+S2.Name);
		System.out.println("Roll no is "+S2.Roll);
		System.out.println("Total marks obtained "+S2.Marks);*/
		
	}

}
