public class Prog3 {
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
		
		for(int i=0;i<words.length;i++) {
			boolean found = false;
			for(int j=0;j<dict.length;j++) {
				if (words[i].equalsIgnoreCase(dict[j])) {
					found = true;
					break;
				}
			}
			if (!found) {
				notFoundInDict+=words[i]+'\n';
			}
		}
		System.out.println(notFoundInDict);
				
	}
}