public class Prog4 {
	public static void main(String[] args) {
		checkDictionary();
	}
	private static void checkDictionary() {
		String[] dict = {"Hello", "How", "are", "you"};
		String sentence = "Hello How are you Majrul";
		
		System.out.println(dict[0]);
//		System.out.println(dict.contains(sentence[0]));
		System.out.println(sentence.contains(dict[1]));
		System.out.println(sentence.contains(dict[2]));
		System.out.println(sentence.contains(dict[3]));
				
	}
}
