package Home_Assignment_Dec17;

public class Result_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("Assignment #1 : Based on total marks, make a result finder program");
		System.out.println("===================================================================\n");
		System.out.println("using 'if_else if_else' statement");
		System.out.println("===================================\n");
		System.out.println("Total marks 1000");
		System.out.println("First Division= 600 or more");
		System.out.println("Second Division= 450 or <600");
		System.out.println("Third Division= 330 or <450\n");
		
		String Result;
		Result = ">=450";

		if (Result==">=600")
		{
			System.out.println("Result: The student has passed with a 'First Division'.");
		}

		else if (Result==">=450")
		{
			System.out.println("Result: The student has passed with a 'Second Division'.");
		}

		else
		{
			System.out.println("Result: The student has either passed with a 'Third Division' or failed.");
		}
		*/
		
		
		
		//====================================================================================================
		
		
	
		System.out.println("Assignment #1 : Based on total marks, make a result finder program");
		System.out.println("===================================================================\n");
		System.out.println("using 'Switch' statement");
		System.out.println("===================================\n");
		System.out.println("Total marks 1000");
		System.out.println("First Division= 600 or more");
		System.out.println("Second Division= 450 or <600");
		System.out.println("Third Division= 330 or <450\n");
		
		
		int result=300;
		
		switch (result)
		{
		case 1000:
			System.out.println("Full marks = 1000");
			break;
			
		case 600:
			System.out.println("Result: The student has passed with a 'First Division'.");
			break;
			
		case 450:
			System.out.println("Result: The student has passed with a 'Second Division'.");
			break;
			
		case 330:
			System.out.println("Result: The student has passed with a 'Third Division'.");
			break;
			
		case 329:
			System.out.println("Result: The student has 'Failed'.");
			break;
			
		default:
			System.out.println("Student's record was not found.");
			}
		
	}

}
