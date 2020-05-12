package JavaPractice;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//When we Reverse the string, meaning will reamin the same
		//Example - Madam, malaylam, rever etc
		
		String name = "MadAm";
		String reverse = "";
		
	//	char c = 'aeiou';//c is vowel or not
		
		for (int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
			reverse=reverse+name.charAt(i);		
		}
		System.out.println(name);
		System.out.println(reverse);
		
		if (name.equalsIgnoreCase(reverse))
		{
			System.out.println("Paliandrome");
		}
		else
			System.out.println("Not a paliandrome");

	}

}
