package JavaInterviewCodingQuestions;

public class WorkOutExamples {

	public static void main(String[] args) {
		
		String s1 = "I love my Parents";
		int count = 0;
		for(int i = 0; i < s1.length(); i++) {    
            if(s1.charAt(i) != ' ')    
                count++;  
		}
		System.out.println(s1.length());
				

}
}
