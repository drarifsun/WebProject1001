package my_programs;

/*
 *	Variables and data type in Java
 *	you tube link: https://www.youtube.com/watch?v=8Udh2XRF2gc&index=8&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa
 */
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// definition of variables
		
		System.out.println("Something contained under a name is variable; \ne.g. Species=Rhesus");
		System.out.println("8-31 characters long \nBetter 8 characters");
		System.out.println("Rhesus is contained in Species");
		
		//conditions of valid variable names:
		
		System.out.println("alphabets upper and lower case");
		System.out.println("number digits 0-9, variable name cannot start with digits");
		System.out.println("Special characters $ _ \nno space in the name");
		System.out.println("cannot be a function, method, class name or any key words \n");
		
		/*
		 * follow you tube link: https://www.youtube.com/watch?v=8Udh2XRF2gc&index=8&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa
		 */
		
		// Discussing Data types
		
		System.out.println("\nbefore writing variable name we must declare what type of data we are going to store in that variable.");
		System.out.println("Two types of Data: Primitive and Non-primitive \n");
		System.out.println("Primitive: \n\tboolean for true or false \n \nIntegral: \n \tchar for character\n \ninteger \n\tbyte/short/int/long for whole number\n \nfloating-point:\n\tfloat/double for decimal numbers\n");
		System.out.println("So altogether 8 data types, must be with lower case\nthese are all key words;");
		System.out.println("boolean, char, byte, short, int, long, float, double");
		System.out.println("useful you tube link: https://www.youtube.com/watch?v=8Udh2XRF2gc&index=8&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa\n");
		
		// Practicing data types //
		
		System.out.println("How to write data type? \n\nFirst declare then initialize");
		System.out.println("======================================================\n");
		
		
		//Declare first
		
		boolean Ques = true;
		char Name = 'J';
		short num = 67;
		int code = 46468468;
		float length = 20.6f;
		double height = 38.2;
		
		//initialization
		
		System.out.println("declaration (this is dynamic initialization)\n");
		System.out.println("boolean Ques = true"); //holds only true or false
		System.out.println("char Name = J"); //char should be within single quote
		System.out.println("short num = 67"); //for whole number
		System.out.println("int code = 46468468"); //for whole number
		System.out.println("float length = 20.6f"); //for decimal number, float hold only 1 digit after decimal, put an f at the end
		System.out.println("double height =38.2 \n\n"); //for decimal number, double automatically holds 2 digits after decimal
		
		
		System.out.println("initialization \n");
		System.out.println("Ques = "+Ques);
		System.out.println("Name = "+Name);
		System.out.println("num = "+num);
		System.out.println("code = "+code);
		System.out.println("length = "+length);
		System.out.println("height = "+height);
	}
	
}
