import java.util.Scanner;

public class textAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (enter 'END' on a new line to finish input):");
        StringBuilder text = new StringBuilder();
        String line;
        
        while (!(line = scanner.nextLine()).equals("END")) {
            text.append(line).append("\n");
        }

        int numCharacters = text.length();
        int numLines = text.toString().split("\n").length;
        int numWords = text.toString().split("\\s+").length;

        System.out.println("Number of characters: " + numCharacters);
        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of words: " + numWords);

        scanner.close();
    }
}
