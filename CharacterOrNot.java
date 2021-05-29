package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class CharacterOrNot {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the char/symbol that you wanna check :");
		char ch = c.next().charAt(0);
		if((ch >= 'a' && ch <= 'z')|| (ch >= 'A' & ch <='Z'))
		{
			System.out.println("This is an alphabet");
		}
		else
		{
			System.out.println("This is not an alphabet");
		}
	}

}
