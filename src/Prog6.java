public class Prog6 {
	public static void main(String[] args) {
		//code for checking if the sentence is formed correctly in a dictionary
		checkDictionary();
	}
	private static void checkDictionary() {
		String[] dict = {"Hello", "How", "Are", "You"};
		String sentence = "Hello Majrul How are you fine";
		//write the rest of the code here..
		
		String[] words = sentence.split(" ");
		
		String notFoundInDict = "";
		
		for(int i=0; i < words.length; i++) {
			boolean check = false;
			for(int j=0; j < dict.length; j++) {
				System.out.print("word "+words[i]);
				System.out.println(" || dict "+dict[j]);
				if(words[i].equalsIgnoreCase(dict[j])) {
					check = true;
					break;
				}
			}
			
			if(!check)
				notFoundInDict += words[i];
		}
		
		System.out.println(notFoundInDict);
				
	}
}