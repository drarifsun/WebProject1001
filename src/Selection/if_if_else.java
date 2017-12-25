package Selection;

public class if_if_else {
/*
 * control statement divided into two:
 * a) Conditional Statement
 * b) Loop Statement
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("use of Conditional Statement 'if', 'else if', 'else'.");
		System.out.println("======================================================");
		
		// keyword if(input)
		// if condition matches with input; it will look inside body;
		// if condition not matches, no result;
		
		/*
		 * it has one or more condition or statement;
		 * but only one body that contain the statement;
		 */

		
		String name;
		name="Infection";

		if(name=="Infection") {

			System.out.println("\nRA is an infection of joints");
			System.out.println("characterized by joint pain and swelling");
		}
			else if(name=="Eye"){

		System.out.println("\nGlaucoma can cause painful red eye");
		System.out.println("It could be open or narrow angle");
		}

			else {
				System.out.println("\nDisease not found");
			}
	}

}


		 