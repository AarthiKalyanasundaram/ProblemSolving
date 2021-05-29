package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number that you wanna tested :");
		double n = num.nextDouble();
		
		if(n<0.0)
		{
			System.out.println("The Entered number is Negative Number");
		}
		else
		{
			System.out.println("The Entered number is Positive Number");
		}

	}

}
