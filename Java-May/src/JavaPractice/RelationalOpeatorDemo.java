package JavaPractice;

public class RelationalOpeatorDemo {

	public static void main(String[] args) {
	
		 double x =10.5; //true or false
		 int y =(int) 10.9;//10
		 boolean z=x>y;
		
		System.out.println(x +"\n"+ y);
		
		/*System.out.println(x);
		System.out.println(y);*/
		
		//Relational opeators will return either true or false
		System.out.println(z); //verify whether x is greater than y
		
		z=(x<=y); //less than or equal to <= is 10 equal 50 ?
		System.out.println(z);
		
		System.out.println(x==y);
		
		System.out.println(x+" not equal to "+ y +" comparison: " + (x!=y));
	
		int a =10,b=20,c=20,d=40;
		
		if ((a < b) && (b == c)) //if(true)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
			

	}

}
