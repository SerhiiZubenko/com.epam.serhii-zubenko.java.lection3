package com.epam.serhii_zubenko.java.lection3.task1;

public class WorkWithArray {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) - 10;
        }

        for (int i : arr){
            System.out.print(i+ ", ");
        }
        System.out.println();

        WorkWithArray.copyOfElements(arr);
    }

    public static void changeOfElements (int[] mas){

        int tempMin = mas[0];
        int numMin = 0;
        int tempMax = mas[0];
        int numMax =0;

        for(int i = 1; i < mas.length; i++){

            if(mas[i] < tempMin && mas[i]<0 ){
                tempMin = mas[i];
                numMin = i;
            }
        }

        for(int i = 1; i < mas.length; i++){

            if(mas[i] > tempMax && mas[i] > 0 ){
                tempMax = mas[i];
                numMax = i;
            }
        }
        System.out.println("\n"+ "Min and Max values" + tempMin +", " + tempMax);

        int temp = mas[numMin];
        mas[numMin] = mas[numMax];
        mas[numMax] = temp;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println("\n " + "The End");
    }

    public static void workOfElements(int[] mas) {

        int count = 0;

        for (int i = 0; i < mas.length; i += 2) {
            count = count + mas[i];
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.print("\n" + "result = " + count + "\n");
        System.out.println("\n " + "The End");
    }

    public static void changeNegativeElements(int[] mas){
        for (int i =0; i < mas.length; i++){
            if(mas[i]<0){
                mas[i] = 0;
            }
        }
        for (int i : mas){
            System.out.print(i+ ", ");
        }
        System.out.println("\n " + "The End");
    }

    public static void mulPositiveElements (int[] mas) {
        for(int i =0; i < mas.length-1; i++){
            if (mas[i]>0 && mas[i+1]<0){
                mas[i] = mas[i] * 3;
            }
        }
        for (int i : mas){
            System.out.print(i+ ", ");
        }
        System.out.println("\n " + "The End");
    }

    public static void avgElements(int[] mas){

        int min = 0;
        int avg =0;
        int dif = 0;
        for(int i : mas){
            avg += i;
        }
        avg = avg / 3;

        for(int i =0; i < mas.length; i++){
            if(mas[i]<min && mas[i]<0){
                min = mas[i];
            }
        }
        System.out.println("avg = " + avg);
        System.out.println(dif = avg - min);
    }

    public static void copyOfElements(int[] mas){



        for(int x = 0; x < mas.length; x++) {
           int temp = mas[x];

            for (int i = 0; i < mas.length; i++) {

                if (!(x == i) && temp == mas[i] && i % 2 == 1 ) {
                    System.out.print(mas[i] + ", ");
                }
            }
        }
    }
}