package JavaPractice;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int i=10; //int delcaration
		int j = 20;
		int k=30;
		
		int[] salary = new int[5]; //Array delclaration
		salary[0]= 10;
		salary[1]= 20;
		salary[2]= 30;
		salary[3]=40; 
		salary[4]=50;
		
		int[] age = {40,30,28,50,65,32,56};
		int arrayLength=age.length;
		System.out.println("Age array size "+ arrayLength);
	//	System.out.println(salary[0]);
		double[] consultingFee = {10000.50,20000.23,15000.65756,5000.23};
		
		String[] cars = {"Volvo","Merc","BMW","Jaguar","TATA"};
		
	//	int capacity = salary.length;
	//	System.out.println("Capacity of the array is "+ capacity);
		
		for(int num=0;num<consultingFee.length;num++) // (initialization;condition; increment or decrement
		{
			System.out.println("Salary of the employees "+ consultingFee[num]);
		}

	}

}
