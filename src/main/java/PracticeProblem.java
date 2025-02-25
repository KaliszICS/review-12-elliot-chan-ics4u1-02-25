public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word) {
		char[] characters = word.toLowerCase().replaceAll(" ", "").toCharArray();
		
		int check = 0;
		for(int i = 0; i < characters.length; i++) {
			if(characters[i] == characters[characters.length - i - 1])
			check++;
		}
		if(check == characters.length)
			return true;
		return false;
	}
	public static int getAge(String[] names, int[] ages, String name) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(name))
				return ages[i];
		}
		return -1;
	}
	public static int countWords(String s, char c) {
		String[] words = s.split(" ");
		int count = 0;
		for(int i = 0; i < words.length; i++) {
			if(words[i].contains("" + c))
				count++;
		}
		return count;
	}
	
}
