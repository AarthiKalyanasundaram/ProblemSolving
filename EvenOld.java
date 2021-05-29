package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class EvenOld {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Plz Enter a Number");
		int num = reader.nextInt();
		
		if(num % 2 ==0 )
		{
			System.out.println(num +" is even");

	}else
	{
		System.out.println(num +" is Old");
	}

}
}
