package my_programs;

public class boolean_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean x, y;
		x = true; y = false;
		System.out.println("x= "+x);
		System.out.println("y= "+y);

		int x1, y1; boolean z1;
		x1 = 10; y1 = 15;
		System.out.println("x1<y1 is "+ (x1<y1));
		System.out.println("x1+y1 is "+ (x1+y1));
		System.out.println("x1-y1 is "+ (x1-y1));
		System.out.println("x1*y1 is "+ (x1*y1));

		z1 = (x1>y1);
		System.out.println("x1>y1 is "+ z1);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++

		boolean p, q;
		p=true; q=false;

		System.out.println("\np is "+p);
		System.out.println("q is "+q);

		int p1, q1; boolean r1;
		p1=25; q1=5; r1=(q1>p1);

		System.out.println("p1>q1 is "+(p1>q1));
		System.out.println("p1<q1 is "+(q1>p1));
		System.out.println("p1*q1 is "+(p1*q1));
		System.out.println("q1>p1 is "+r1);
	}

}
