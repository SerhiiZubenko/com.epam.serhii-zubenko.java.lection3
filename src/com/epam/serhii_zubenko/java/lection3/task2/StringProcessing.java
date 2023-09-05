package com.epam.serhii_zubenko.java.lection3.task2;

import java.util.Scanner;

public class StringProcessing {

    public static void main(String[] args) {

        StringProcessing example = new StringProcessing();

        example.wordFromNumbers();    // - task 2.2
    }

    public static void minAndMaxString(){

        int min = 0;
        int max = 0;
        int indexMin =0;
        int indexMax = 0;

        System.out.println("Enter n - value of String");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter strings");
        Scanner sc = new Scanner(System.in);
        String [] str = new String[n];

        for(int x = 0; x < n; x++) {
            str[x] = sc.nextLine();
        }

        min = str[0].length();

        for (int i =1; i< str.length; i++){
            if(min > str[i].length()){
                min = str[i].length();
                indexMin = i;
            }
        }

        max = str[0].length();

        for (int i =1; i< str.length; i++){
            if(max < str[i].length()){
                max = str[i].length();
                indexMax = i;
            }
        }

        System.out.println("Min =" + min + "\n" + str[indexMin]);
        System.out.println("Max = " + max + "\n" + str[indexMax]);

    }

    public static void printStringBiggerAvg(){

        System.out.println("Enter n - value of strings");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter strings");
        float temp =0.0F;
        Scanner sc = new Scanner(System.in);
        String[]  str = new String[n];

        for(int x = 0; x < n; x++) {
            str[x] = sc.nextLine();
            temp += str[x].length();
        }

        temp = temp/n;

        for (int s = 0; s < str.length; s++) {
            if (str[s].length() > temp) {
                System.out.println(str[s]);
            }
        }
    }

    public static void printStringLessAvg(){

        System.out.println("Enter n - value of strings");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter strings");
        float temp =0.0F;
        Scanner sc = new Scanner(System.in);
        String[]  str = new String[n];

        for(int x = 0; x < n; x++) {
            str[x] = sc.nextLine();
            temp += str[x].length();
        }

        temp = temp/n;

        for (int s = 0; s < str.length; s++) {
            if (str[s].length() < temp) {
                System.out.println(str[s]);
            }
        }
    }

    public static void minWord() {

        System.out.println("Enter n - value of words");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[n];

        for (int x = 0; x < n; x++) {
            str[x] = sc.next();
        }

        for (int i =0; i <str.length; i++){
            System.out.println(str[i]);
        }
    }

    public static void minValueCharInWord(){

        String abcd = "abcdefghijklmnopqrstuvwxyz";
        char [] abc = abcd.toCharArray();
        char temp;
        int min = 0;
        String tempStr = "";

        System.out.println("Enter n - value of words");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[n];

        for (int x = 0; x < n; x++) {
            str[x] = sc.next();
        }

        for (int i = 0; i < abc.length; i++){
            int count = 0;
            temp = abc[i];

            for(int x = 0; x < str.length; x++){
                tempStr = str[x];

                for(int z = 0; z < tempStr.length(); z++){
                    if (temp == tempStr.charAt(z)){
                        count ++;
                    }
                }
            }

            if(min > count){
                min = count;
            }
        }
        System.out.println(str[min]);
    }

    public static void wordContainsDifferentChar(){

        char temp;
        int min = 0;

        String tempStr = "";

        System.out.println("Enter n - value of words");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[n];

        for (int x = 0; x < n; x++) {
            str[x] = sc.next();
        }

        boolean bolFirst = true;
        if(bolFirst) {

            for (int i = 0; i < str.length; i++) {
                tempStr = str[i];
                for (int x = 0; x < tempStr.length(); x++) {
                    temp = tempStr.charAt(x);
                    boolean bool = true;
                    for (int z = 1; z < tempStr.length(); z++) {
                        char second = tempStr.charAt(z);
                        if (temp == second) {
                            bool = false;
                            break;
                        }
                    }
                    if (!bool) {
                        break;
                    }

                }
                System.out.println(tempStr);
            }
        }
    }


    public static void wordFromNumbers() {

        System.out.println("Enter n - value of words");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();

        System.out.println("Enter words");
        Scanner sc = new Scanner(System.in);
        String[] str = new String[n];

        for (int x = 0; x < n; x++) {
            str[x] = sc.next();
        }

            for (String element : str) {
                boolean isDistinct = true;
                char[] chars = String.valueOf(element).toCharArray();
                for (int i = 0; i < chars.length - 1; i++) {
                    for (int j = i + 1; j < chars.length; j++) {
                        if (chars[i] == chars[j] && chars[i] >= '0' && chars[i]<='9') {
                            isDistinct = false;
                            break;
                        }
                    }
                    if (!isDistinct) {
                        break;
                    } else if (i == chars.length - 2) {
                        System.out.println(element);
                        return;
                    }
                }
            }
            System.out.println("Haven't");
        }

}
