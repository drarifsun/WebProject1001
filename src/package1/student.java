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
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student Mamun = new student();
		student Nazmul = new student();
		
		//Mamun.Name = "Syed Mamun";
		//Mamun.Roll = 225;
		//Mamun.Marks = 78.7f;
		
		Mamun.setdata("Syed Mamun", 225, 78.7f);
		
		
		System.out.println("The student's name is "+Mamun.Name);
		System.out.println("Roll no is "+Mamun.Roll);
		System.out.println("Total marks obtained "+Mamun.Marks);
		System.out.println("\n");
		
		Nazmul.Name = "Nazmul Hossain";
		Nazmul.Roll = 216;
		Nazmul.Marks = 77f;
		
		System.out.println("The student's name is "+Nazmul.Name);
		System.out.println("Roll no is "+Nazmul.Roll);
		System.out.println("Total marks obtained "+Nazmul.Marks);
		
	}

}
