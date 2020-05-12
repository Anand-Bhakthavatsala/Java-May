package JavaPractice;

import javax.sound.midi.Synthesizer;

public class JavaDemo3 { 

	public static void main(String[] args) {		

		int m=10,n=20;
	//	System.out.println(m=m+n);
		m+=n;//m=m+n
	//	System.out.println("Value of m is "+ m);
		
		//Ternary operator
		int number=14; String output=(number%2==0)?"even number":"odd number"; 		
	//	System.out.println(output);
		
		double number1 = 124;  //if (a==b)
				
		if (number1==124.0) //if(true)
		{
			System.out.println("Both the Numbers are equal");
		}
		else
			System.out.println("Numbers are not equal");

		//equals method is used for string comparison
		String sDay="Thursday";
		if(sDay.equalsIgnoreCase("friday1")){  //first condition
			
				 System.out.println("Today is Friday");		
		}
		else if (sDay.equals("Thursday"))  // 2nd condition
		{
			System.out.println("Its Thursday");
		}
		else
		{
			System.out.println("Its not same");
		}
	}

}
