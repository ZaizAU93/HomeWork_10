package House;
import java.util.Arrays;
import java.util.Scanner;

public class ShortLong {
    public String str_1 = "sdfghj";
    public String str_2 ="ggggggg";
    public String str_3 = "errr rsy yyy iii";


    String strItog = str_1 + " " + str_2 + " " + str_3;

    String[] mas = {this.str_1, this.str_2, this.str_3};

    public void SchortLong() {
      //  Arrays.sort(mas);
        System.out.println("1 строка " + mas[0] + " и ее длинна равна" + mas[0].length());
        System.out.println("2 строка " + mas[1] + " и ее длинна равна" + mas[2].length());
        System.out.println("3 строка " + mas[2] + " и ее длинна равна" + mas[2].length());
        System.out.println("”пор€доченные строки");
        System.out.println(Arrays.toString(mas));

        int sred = 0;
        for (int i = 0; i < mas.length; i++) {
            sred += mas[i].length();
        }
        sred /= mas.length;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length() < sred) {
                System.out.println(mas[i] + " длинна строки равна = " + mas[i].length());
            }
        }

    }

    public void differentSymbols() {
        String[] strSplit = strItog.split(" ");
        System.out.println(this.strItog);
        System.out.println("strSplit" + Arrays.toString(strSplit));

        for (int i = 0; i < strSplit.length; i++) {
            for (int j = 0; j < strSplit[i].toCharArray().length-1; j++) {
                if (strSplit[i].indexOf(String.valueOf(strSplit[j].toCharArray())) != -1) {
                    System.out.println("—лово с неповтор€ющимис€ символами найдено" );
                    // break;
                } else {
                    System.out.println("—лово с неповтор€ющимис€ символами  найдено " + strSplit[i]);
                }

            }


        }

    }
}