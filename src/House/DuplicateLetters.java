package House;
import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ¬вод трех строк с консоли
        System.out.println("¬ведите слово:");
        String initialString = scanner.nextLine();


        System.out.println(initialString);
        String duplicatedString = "";
        for (int i = 0; i < initialString.length(); i++){
            char letter = initialString.charAt(i);
            duplicatedString += letter;
            duplicatedString += letter;
        }

        System.out.println(duplicatedString);




    }
}
