/**
 * 
 */
package ProblemSolving;

/**
 * @author aarthiksundaram
 * @category Program
 */
public class GetTheCharUsingIndex {

	public static void main(String[] args) {
		
	    String S = "Java Exercises!";
		int l = S.length();
	    char[] ch = S.toCharArray();
		
		for(int i = 0;i<l;i++)
		{
			
			System.out.println("The Character at position "+i+" is "+ch[i]);
		}
		
		

	}

}
