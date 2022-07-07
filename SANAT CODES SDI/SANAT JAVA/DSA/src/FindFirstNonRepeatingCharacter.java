
public class FindFirstNonRepeatingCharacter {
	static char findFirstNonRepeatingCharacter(String input) {
		for (int i = 0; i < input.length(); i++) {
			char currentchar = input.charAt(i);
			boolean isfound = false;
			for (int j = i + 1; j < input.length() - 1; j++) {
				if (input.charAt(i) == input.charAt(j)) {
					isfound = true;
				}
			}
			if (!isfound) {
				return currentchar;
			}
		}
		return '0';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First non repeating character is :" + findFirstNonRepeatingCharacter("SANATSURYA"));

	}

}
