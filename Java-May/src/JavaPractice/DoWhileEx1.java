package JavaPractice;

public class DoWhileEx1 {	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			int age=20;
			double bankBalance = 1000;
			
			boolean isEligibleForCC;
		/*
			if(age>35 && bankBalance==10000) //condition->true
			{
				isEligibleForCC=false;
				System.out.println("Ravi is eligible for Credit Card");
			}
			else if(age<=35 && bankBalance==10000)
			{
				isEligibleForCC=true;
				System.out.println("Ravi is eligible for Credit Card");
			}
			else
				System.out.println("Ravi is NOT eligible for Credit Card");
			*/
			
			do //20>10->true
			{
				
				System.out.println("You are "+age);//19 will be printed
				age++; //20-1
				
			}	
			while (age<30);//false
				
		}
	}

