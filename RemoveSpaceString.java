public class RemoveSpaceString{
String removeWhiteSpaces(String input) {
	StringBuilder output = new StringBuilder();
	
	char[] charArray = input.toCharArray();
	
	for (char c : charArray) {
		if (!Character.isWhitespace(c))
			output.append(c);
	}
	
	return output.toString();
}

public static void main(String[] args) {
        RemoveSpaceString remover = new RemoveSpaceString(); // Create an instance
        String letter = "my name is veena";
        String result = remover.removeWhiteSpaces(letter); // Call the instance method
        System.out.println("String without spaces: " + result);
    }
}