package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(" On an adventure!  ");
        String s1="Шаурмяу";
        s1 = s1.replaceFirst(".$","");
        String s1Final = s1.replace('я','а');//replaces all occurrences of 'a' to 'e'

        String s2 = "Много $";
        String s2Final = s2.replaceFirst(".$", "&");

        String s3 = "осталось много времени до нового года";
        String s3_1 = "4 месяца";
        String s3Final = s3.replace("много времени", s3_1);
        //Stream.of(s3.split("[^A-Za-zА-Яа-я]+")).forEach(System.out::println);

        String s4 = Character.toString(s3Final.charAt(9));
        int s4Int = Integer.parseInt(s4);
        s4Int = s4Int - 1;



        System.out.println("1.  " + "before: " + s1 + "\n" + "    after: " + s1Final);
        System.out.println("2.  " + "before: " + s2 + "\n" + "    after: " + s2Final);
        System.out.println("3.  " + "before: " + s3 + "\n" + "    after: " + s3Final);
        System.out.println("4.  " + "before: " + s3Final + "\n" + "    after: " + s4Int);


}}
