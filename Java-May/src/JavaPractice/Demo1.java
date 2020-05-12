package JavaPractice;

public class Demo1 { //Demo1 is a class

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Demo1 d = new Demo1();
		sum();
		Demo1.sum();

	}
	
	public static void sum() //method creation & no parameters, overloading method
	{
		 int k=0;
		 int i = 10;
		 int j = 75;
		 k=i+j;
		System.out.println("Sum of "+i +" & " +j+" is : "+ k);	
	}
	
	public static void sum(int val1,int val2) //method creation, overloading method
	{
		 int k=0;
		 int i = val1;
		 int j = val2;
		 k=i+j;
		System.out.println("Sum of "+i +" & " +j+" is : "+ k);	
	}
	
	public static void sum(double val1,double val2) //method creation, 
	{
		 double k=0;
		
		 k=val1+val2;
		System.out.println("Sum of "+val1 +" & " +val2+" is : "+ k);	
	}

}
