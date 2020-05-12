package excercise;

//Methodoverloading is one which has the same name for the function but different 
//parameters or the different return type (signature)
//Java program to demonstrate working of method 
//overloading in Java. 

public class Sum { 

	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); //classname <objectname> = new classname();

		System.out.println(s.sum(12.34, 23.34));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(20, 30));
		
		int number = s.sum(30, 30);
		System.out.println(number);
	
	} 
} 
