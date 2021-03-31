package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main<sum> {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String strOne = in.nextLine();
        System.out.println("Введите число: ");
        String strTwo = in.nextBigInteger().toString();
        int integerOne = Integer.parseInt(strOne);
        int integerTwo = Integer.parseInt(strTwo);
        Integer sum = 0;
            if (integerOne > 0 && integerTwo > 0)
                 sum = (integerOne + integerTwo);
            System.out.println(sum);





//        // Makes sure that both string.charAt(x) and string.charAt(x+1) are integers
//        for()
//            if (string >= 0 && integer2 >= 0) {
//                System.out.println("OK");
//            } else {
//                System.out.println("NOK");
//
//                System.out.println("All: " + sum);
//
//                System.out.println(sum);


//        int inChar;
//        StringBuilder s = new StringBuilder();
//        try {
//            inChar = System.in.read();
//            while (System.in.available() > 0) {
//                StringBuilder append = s.append((char) inChar);
//                inChar = System.in.read();
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка");
//        }


//        int y;
//        for (int x = 1; x < 6; x++) {
//            try {
//                y = x;
//                if (y == 3)
//                    throw new Exception(y + " <-- Исключение");
//                System.out.println(y);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//        System.out.println(" On an adventure!  ");
//        String s1="Шаурмяу";
//        s1 = s1.replaceFirst(".$","");
//        String s1Final = s1.replace('я','а');//replaces all occurrences of 'a' to 'e'
//
//        String s2 = "Много $";
//        String s2Final = s2.replaceFirst(".$", "&");
//
//        String s3 = "осталось много времени до нового года";
//        String s3_1 = "4 месяца";
//        String s3Final = s3.replace("много времени", s3_1);
//        //Stream.of(s3.split("[^A-Za-zА-Яа-я]+")).forEach(System.out::println);
//
//        String s4 = Character.toString(s3Final.charAt(9));
//        int s4Int = Integer.parseInt(s4);
//        s4Int = s4Int - 1;
//
//        //String s5Final_1 = s5.substring(0,5)+'и'+s5.substring(5);
//
//        StringBuffer s5 = new StringBuffer("сосед и децибелы");
//        s5.delete(5,6);
//        s5.setCharAt(7,'и');
//        s5.setCharAt(8,'м');
//
//        String s5_2 = s5.toString();
//
//        char[] c = s5_2.toCharArray();
//        char temp = c[9];
//        c[9] = c[11];
//        c[11] = temp;
//
//        String s5_3 = new String(c);
//
//        StringBuffer s5_4 = new StringBuffer(s5_3);
//        s5_4.setCharAt(10,'e');
//        s5_4.setCharAt(12,'и');
//
//
////        String s5_4 = c.toString();
//
////        char[] d = s5_4.toCharArray();
////        char temp = c[12];
////        d[12] = d[10];
////        d[10] = temp;
//        // вероятно, нет возможности повторно испольщзовать зарезервированное слово "temp"
//
//
//
//
//        System.out.println("1.  " + "before: " + s1 + "\n" + "    after: " + s1Final);
//        System.out.println("2.  " + "before: " + s2 + "\n" + "    after: " + s2Final);
//        System.out.println("3.  " + "before: " + s3 + "\n" + "    after: " + s3Final);
//        System.out.println("4.  " + "before: " + s3Final + "\n" + "    after: " + s4Int);
//        System.out.println(s5);
//        System.out.println(s5_2);
//        System.out.println(s5_3);
//        System.out.println(s5_4);

    }
}

