import House.ShortLong;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder StrBuil = new StringBuilder("������ �������");
        StringBuilder StrBuil_2 = new StringBuilder("������ �������");
        //������ 1:
        //1.1 ���������� 2 ������ � ���� 2-�� ���������.
        //1.2 ��������� 2 ������ �� ��������� � � ��� ����� ��������.
        //1.3 ������� ��������� � 3-�� ������� �� �����.
        //1.4 ������� ����� ������
        //1.5 ������� ���������� ����� ������ ������� � ������.
        //1.6 ������������� ���������� ��� true � ������.
        //1.7 ��������� ������ � ������� �������.
        //1.8 �������� �1� � ������ �� �%�.
        //1.9 ������ ��� ������� � ������ � ���� ������.
        //1.10 ���������, ������ �� ������.
        //1.11 ������� ������ �� ��������� �� �������

        System.out.println(StrBuil_2.reverse());
        StringBuilder StrBuil_3 = new StringBuilder(StrBuil_2.append(" ").append(StrBuil).reverse());
        System.out.println(StrBuil_3);
        String str = "��� ��� ��� �� �";
        String str_2 ="������ ������";
        String str_3;
        System.out.println (str_3= str + str_2);
      //  System.out.println(str.join(str_2));
        System.out.println(StrBuil.append(str));
        System.out.println(String.format(str, str_2));

        System.out.println("�������� 2 ������ �� ��������� � � ��� ����� ��������");

        String ss = "����� ������";
        String ss1 = "����� ������";
        String ss2 = StrBuil.toString();

        System.out.println(str ==  str_2);
        System.out.println(StrBuil == StrBuil_2);
        System.out.println(str.equals(str_2));
        System.out.println(str.equalsIgnoreCase(str_2));
        System.out.println(StrBuil.equals(StrBuil_2));
        System.out.println(str.equalsIgnoreCase(str_2));
        System.out.println(StrBuil.equals(StrBuil_2));
        System.out.println(ss2);

        System.out.println(" ������� ��������� � 3-�� ������� �� �����");
        System.out.println(str.substring(2, str.length()));
        System.out.println(" ������� ������ ������");
        System.out.println(str.length());
        System.out.println(" ������� ���������� ����� ������ ������� � ������");
        System.out.println(str.indexOf('�'));
        System.out.println(" ������������ ���������� ��� true � �����");
        boolean b = true;
        System.out.println(Boolean.toString(b));
        System.out.println(String.valueOf(b));
        String bb = b + "";
        System.out.println(bb);
        System.out.println("");
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("�", "c"));
        System.out.println(str.replace(" ",""));
        System.out.println("���������, ������ �� ������");

        if (str == null && str.isEmpty() ){
            System.out.println("������ ������");
        } else {
            System.out.println("������ �� ������");
        }

        //2.1 ������� ������ StringBuilder c ����� �������.
        //2.2 �������� � ������ �xxxx�.
        //2.3 � 5-� ������� �������� �y�.
        //2.4 ������� ������� � 3 �� 6.
        //2.5 ����������� ������.
        //2.6 ������������� � String � ������� � �������

        StrBuil.append("xxxx");
        StrBuil.insert(5, "y");
        StrBuil.delete(3,6);
        StrBuil.reverse();
        System.out.println(StrBuil.toString());

        System.out.println("������� ��� ������");

        Scanner line = new Scanner(System.in);





        ShortLong shortLong = new ShortLong();
        shortLong.SchortLong();

    }
}