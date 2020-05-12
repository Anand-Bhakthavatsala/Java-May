package JavaPractice;

public class JavaDemo1 {
	
	public static void main(String[] args) {
		
		//"System" is different from "system"
		System.out.println("Hello, world"); //println -> it will print & cursor moves to next line
		/*System.out.println("Congratulations Today is May 2nd "); //print -> it will print & cursor will stay in the same line
		System.out.println("We are here");*/
		
		//Data Types in Java
		int a =200; //4 bytes
		long l = 86876867; //8 bytes
		double d= 234234.345; //8 bytes
		float pi = (float) 3.1412;	//4 bytes
		short s=(short) 99.3; //2 bytes of type integer
		char c = 'r';
		boolean b = false;
		String st = "Selenium Automation Learning";
		byte b1 = 1;
		c=(char) b1;
		System.out.println("Current Value of c "+ c);
		
		System.out.println("value of a is "+a+" looks good");
		System.out.println("value of l is "+l);
		System.out.println("value of d is "+d);		
		
		int myint = 23432;
		double mydouble = myint;
	//	System.out.println("Value of mydouble "+mydouble);
		
		double mydoub = 3.1412;//Value pi
		int int1= (int) mydoub; //1000.50 INR
		System.out.println("Value of int1 "+ int1);		
		double mydoubl2 = int1;

	}
	
}
