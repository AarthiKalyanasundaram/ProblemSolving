package JavaInterviewCodingQuestions;

public class SwappingNumber {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		/*
		 * System.out.println("Before Swapping"); 
		 * System.out.println("a ="+a);
		 * System.out.println("b ="+b);
		 * 
		 * System.out.println("After Swapping"); 
		 * int temp = a; 
		 * temp = a; 
		 * a = b; 
		 * b = temp; 
		 * System.out.println("a ="+a); 
		 * System.out.println("b ="+b);
		 */
		// without temp
		System.out.println("Before Swapping");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		System.out.println("After Swapping");
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println("a ="+a); 
		System.out.println("b ="+b);
			

	}

}
