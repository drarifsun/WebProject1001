package Selection;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use of Switch as a conditional statement
		// Switch keyword has variable instead of input
		
		System.out.println("use of Conditional Statement 'Switch'");
		System.out.println("======================================");
		
		int Day=0;
		switch(Day)
		{
		case 1:

			System.out.println("\nMondays are boring, back to work.");
			break;
			
		case 2:

			System.out.println("\nTuesday I have an interview at 10am");
			break;
			
		case 3:

			System.out.println("\nWednesday is my doctor's appointment at 2pm");
			break;
			
		case 4:

			System.out.println("\nOn Thursdays, I go to gym");
			break;
			
		case 5:

			System.out.println("\nFriday, yay ... weekend starts tomorrow!!");
			break;
			
		case 6:

			System.out.println("\nSaturday going to kayak with buddies");
			break;
			
		case 7:
			
			System.out.println("\nToday's Sunday, time to have a beach party.");
			
			
			default:
				
				System.out.println("\nyou are no where in 7 days !!!");

		}
	}				
			
}
