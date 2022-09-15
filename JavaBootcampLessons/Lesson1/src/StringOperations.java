import java.util.Arrays;

public class StringOperations {

	private String word;

	public StringOperations() {
		this.word = " The change starts with ";
	}

	public StringOperations(String message) {
		this.word = message;
	}

	public void ExtraStringOperations() {
		System.out.println(word.length());
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		System.out.println(word.charAt(1));
		System.out.println(word.concat(" you "));
		System.out.println(word.equals("Not equal with this text"));
		System.out.println(word.trim());
		System.out.println(word.split(" ").length);
		System.out.println(word.split(" ")[0]);
		System.out.println(Arrays.toString(word.split(" ")));
	}
}