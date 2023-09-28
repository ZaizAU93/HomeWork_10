package House;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class ShortLong {
    Scanner line = new Scanner(System.in);
    String str_1 = line.nextLine();
    String str_1_1 = line.nextLine();
    String str_1_2 = line.nextLine();


    String strItog = str_1 + " " + str_1_1 + " " + str_1_2;

    String[] strings = {str_1, str_1_1, str_1_2};

    public void SchortLong() {
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        // ¬ыводим отсортированный массив строк
        System.out.println("—троки в пор€дке возрастани€ их длины:");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("-------------средн€€ длинна------");

        int sred = 0;
        for (int i = 0; i < strings.length; i++) {
            sred += strings[i].length();
        }
        sred /= strings.length;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < sred) {
                System.out.println(strings[i] + " длинна строки равна = " + strings[i].length());
            }
        }

    }

//    public void differentSymbols() {
//        String[] strSplit = strItog.split(" ");
//        System.out.println(this.strItog);
//        System.out.println("strSplit" + Arrays.toString(strSplit));
//
//        for (int i = 0; i < strSplit.length; i++) {
//            for (int j = 0; j < strSplit[i].toCharArray().length-1; j++) {
//                if (strSplit[i].indexOf(String.valueOf(strSplit[j].toCharArray())) != -1) {
//                    System.out.println("—лово с неповтор€ющимис€ символами найдено" );
//                    // break;
//                } else {
//                    System.out.println("—лово с неповтор€ющимис€ символами  найдено " + strSplit[i]);
//                }
//
//            }
//
//
//        }
//
//    }
}