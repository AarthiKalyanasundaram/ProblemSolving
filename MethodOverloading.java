package JavaInterviewCodingQuestions;

public class MethodOverloading {
	
	static int addition(int a, int b)
	{
		return(a+b);
	}
	
	static int addition(int a, int b, int c)
	{
		return(a+b+c);
	}

	public static void main(String[] args) {
		
		System.out.println(MethodOverloading.addition(50, 50));

	}

}
