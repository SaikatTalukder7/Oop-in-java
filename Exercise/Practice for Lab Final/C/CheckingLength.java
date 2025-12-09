package C;

public class CheckingLength {

	String word;
	
	int CheckingLength(String word){
		
		if(word==null) {
			System.out.println("Warning!\nWord is null.");
			return -1;
		}
			return word.length();
	}
}
