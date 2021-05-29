package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class FindingAcsiiValueofCharacter {

	public static void main(String[] args) {
		
		//Creation an object with variable name as 'a'
		//Scanner a -> Scanner is a class with the variable name as a and new is the keyword and Scanner(System.in) is the contructor
		Scanner a = new Scanner(System.in);
		System.out.println("Please enter your Character");
		char c = a.next().charAt(0);
		int ascii = c;
		System.out.println("The ASCII value for the entered character is :"+ ascii);
		

	}

}
