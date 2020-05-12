package excercise;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Java");
		
		//Data types Java
		
		int a = 234;
		long l = 234324;
		double d=2332.324;
		short s = 22;
		char c= 'a';
		
		boolean b = true;
		
	//	System.out.println("value of a "+a+" Value of l "+l );
	//	System.out.println("Value of l "+l); 
		
	
	/*	int m=10,n=20;
		System.out.println("Addition "+(m+n));
		System.out.println("Subtraction "+(m-n));
		System.out.println("Multiplication "+(m*n));
		System.out.println("Division "+(n/m));
		System.out.println("Quotient "+(n%m));*/
		
	/*	int number=12; 
		int j=number>10?1:2;
		System.out.println(j);
		String output = (number%2==0)?"Even":"odd";
		System.out.println("Number "+ number+ " is "+ output);*/
		
	/*	int x=50, y=20,z=15;
		if ((x>y) && (x>z)) //if (true)
			System.out.println("x is the greatest "+x);
		else if ((y>z) && (y>x))
			System.out.println("y is the greatest "+y);
		else
			System.out.println("z is the greatest "+z);*/
		
		int n = 1;
		switch(n)
		{
		case 1: 
			System.out.println("One");
			break;
		case 2: System.out.println("two");
			break;
		default: System.out.println("no match");
		}
		
	}

}
