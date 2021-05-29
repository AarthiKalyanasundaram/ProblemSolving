package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the character to be checked :");
		char ch = c.next().charAt(0);
		char ch1 = Character.toLowerCase(ch);
		
		if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i'|| ch1 == 'o' || ch1 == 'u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}

	}

}
