package Home_Assignment_Dec17;

public class Data_info_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n");
		System.out.println("Home Task assigned by Dr. Lutfor Rahman Khan on December 24th, 2017.\n");
		System.out.println("Topic: Based on Data Type make a Data information program.");
		System.out.println("==========================================================\n");
		System.out.println("In Java there are two types of data.\n \ta) Primitive and\n \tb) Non-Primitive");
		
		String JavaData1;
		JavaData1 = "Primitive";
		
		System.out.println("\nPrimitive data include Boolean and Numeric data type.\n");
		System.out.println("Numeric data subdivided into:\n \t*Character and Integer type.");
		System.out.println("\t*Integer again divided into:\n \ta) byte\n \tb) short\n \tc) int\n \td) long\n");
		System.out.println("Following are "+JavaData1+" data types with their allocated sizes:\n");
		System.out.print("=======================================================================\n");
		
		String[] object = new String[11];
		
		object[0] = "boolean= 1 bit " + "value=false";
		object[1] = "char=    2 bytes " + "value="+"\\u0000";
		object[2] = "byte=    1 byte " + "value=0";
		object[3] = "short=   2 bytes " + "value=0";
		object[4] = "int=     4 bytes " + "value=0";
		object[5] = "long=    8 bytes " + "value=0L";
		object[6] = "float=   4 bytes " + "value=0.0f";
		object[7] = "double=  8 bytes " + "value=0.0d";
		
		System.out.println(object[0] + "\n" + object[1] + "\n" + object[2] + "\n" + object[3] + "\n" + object[4] + "\n" + object[5] + "\n" + object[6] + "\n" + object[7] + "\n");
		
		
		String JavaData2;
		JavaData2 = "Non-Primitive";
		
		object[8] = "String";
		object[9] = "Array";
		object[10]= "Others";
		
		System.out.println("Following are the "+JavaData2+" data types.");
		System.out.println("=============================================\n");
		System.out.println(object[8] + "\n" + object[9] + "\n" + object[10]);
	}

}
