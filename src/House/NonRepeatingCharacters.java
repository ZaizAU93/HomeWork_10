package House;
import java.util.Scanner;

public class NonRepeatingCharacters {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первую строку:");
            String string1 = scanner.nextLine();
            System.out.println("Введите вторую строку:");
            String string2 = scanner.nextLine();
            System.out.println("Введите третью строку:");
            String string3 = scanner.nextLine();


            String resultWord = findUniqueWord(string1, string2, string3);


            if (resultWord != null) {
                System.out.println("Первое слово, состоящее только из различных символов: " + resultWord);
            } else {
                System.out.println("Во введенных строках нет слов, состоящих только из различных символов");
            }
        }

        private static String findUniqueWord(String string1, String string2, String string3) {
            String[] words1 = string1.split(" ");
            String[] words2 = string2.split(" ");
            String[] words3 = string3.split(" ");

            for (String word : words1) {
                if (isUnique(word) && hasNextOccurrences(word, words2) && hasNextOccurrences(word, words3)) {
                    return word;
                }
            }

            return null;
        }

        private static boolean isUnique(String word) {
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                for (int j = i + 1; j < word.length(); j++) {
                    if (currentChar == word.charAt(j)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean hasNextOccurrences(String word, String[] words) {
            for (String w : words) {
                if (w.contains(word)) {
                    return false;
                }
            }
            return true;
        }
    }

