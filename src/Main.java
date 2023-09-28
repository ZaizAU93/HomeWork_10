import House.ShortLong;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder StrBuil = new StringBuilder("Строка билдера");
        StringBuilder StrBuil_2 = new StringBuilder("Строка билдера");
        //Задача 1:
        //1.1 Объединить 2 строки в одну 2-мя способами.
        //1.2 Проверить 2 строки на равенство с и без учета регистра.
        //1.3 Вернуть подстроку с 3-го символа до конца.
        //1.4 Вывести длину строки
        //1.5 Вывести порядковый номер любого символа в строке.
        //1.6 Преобразовать логический тип true к строке.
        //1.7 Перевести строку в верхний регистр.
        //1.8 Заменить ‘1’ в строке на ‘%’.
        //1.9 Убрать все пробелы в строке с двух сторон.
        //1.10 Проверить, пустая ли строка.
        //1.11 Разбить строку на несколько по делител

        System.out.println(StrBuil_2.reverse());
        StringBuilder StrBuil_3 = new StringBuilder(StrBuil_2.append(" ").append(StrBuil).reverse());
        System.out.println(StrBuil_3);
        String str = "пер пая стр ок а";
        String str_2 ="пераая строка";
        String str_3;
        System.out.println (str_3= str + str_2);
      //  System.out.println(str.join(str_2));
        System.out.println(StrBuil.append(str));
        System.out.println(String.format(str, str_2));

        System.out.println("роверить 2 строки на равенство с и без учета регистра");

        String ss = "новая строка";
        String ss1 = "новая строка";
        String ss2 = StrBuil.toString();

        System.out.println(str ==  str_2);
        System.out.println(StrBuil == StrBuil_2);
        System.out.println(str.equals(str_2));
        System.out.println(str.equalsIgnoreCase(str_2));
        System.out.println(StrBuil.equals(StrBuil_2));
        System.out.println(str.equalsIgnoreCase(str_2));
        System.out.println(StrBuil.equals(StrBuil_2));
        System.out.println(ss2);

        System.out.println(" Вернуть подстроку с 3-го символа до конца");
        System.out.println(str.substring(2, str.length()));
        System.out.println(" Вывести длинну строки");
        System.out.println(str.length());
        System.out.println(" Вывести порядковый номер любого символа в строке");
        System.out.println(str.indexOf('е'));
        System.out.println(" реобразовать логический тип true к строк");
        boolean b = true;
        System.out.println(Boolean.toString(b));
        System.out.println(String.valueOf(b));
        String bb = b + "";
        System.out.println(bb);
        System.out.println("");
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("п", "c"));
        System.out.println(str.replace(" ",""));
        System.out.println("Проверить, пустая ли строка");

        if (str == null && str.isEmpty() ){
            System.out.println("строка пустая");
        } else {
            System.out.println("строка не пустая");
        }

        //2.1 Создать объект StringBuilder c любой строкой.
        //2.2 Добавить к строке “xxxx”.
        //2.3 В 5-ю позицию вставить “y”.
        //2.4 Удалить символы с 3 по 6.
        //2.5 Перевернуть строку.
        //2.6 Преобразовать в String и вывести в консоль

        StrBuil.append("xxxx");
        StrBuil.insert(5, "y");
        StrBuil.delete(3,6);
        StrBuil.reverse();
        System.out.println(StrBuil.toString());

        System.out.println("Введите три строки");

        Scanner line = new Scanner(System.in);





        ShortLong shortLong = new ShortLong();
        shortLong.SchortLong();

    }
}