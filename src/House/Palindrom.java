package House;
import java.util.Scanner;

public class Palindrom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("������� ����� ��� ��������: ");
            String word = scanner.nextLine();

            if (isPalindrome(word)) {
                System.out.println("����� \"" + word + "\" �������� �����������.");
            } else {
                System.out.println("����� \"" + word + "\" �� �������� �����������.");
            }


        }

        public static boolean isPalindrome(String word) {
            int i = 0;
            int j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }
    }


