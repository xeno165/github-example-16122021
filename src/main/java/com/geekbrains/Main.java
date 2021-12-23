package com.geekbrains;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {      // ДЗ 3 урок
        task1();
        sout();
        sout();
        task2();
        sout();
        sout();
        task3();
        System.out.println();
        System.out.println();
        task4();
        sout();
        int[] arr = task5(5,7);
        System.out.println(Arrays.toString(arr));
        sout();
        System.out.println();
        task6();



    }
    public static void sout(){
        System.out.println();
    }

    public static void task1(){
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + "  ");
        }
    }

    public static void task2(){
        int summ = 0;
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++){
            summ = summ + 1;
            arr[i] = summ;
            System.out.print(arr[i] + " ");
        }
    }

    public static void task3(){
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(" " + arr[i] + " ");
        }
    }

    public static void task4(){
        int[][] arr = new int [5] [5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j || i == arr.length - j - 1){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] task5(int len, int initialValue){
        int [] arr = new int [len];
        for ( int i = 0 ; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void task6(){
        int maxmin = 0;
        int [] arr = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxmin ){
                maxmin = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + maxmin);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxmin) {
                maxmin = arr[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + maxmin);

    }

    public static void task7(){

    }

    public static void task8(){

    }

/*    public static void main(String[] args) {    // ДЗ 2 урок
        System.out.println(task1(10,10));
        task2();
        System.out.println(task3(-15));
        System.out.println();
        task4();
        System.out.println();

    }

    public static boolean task1(int a, int b) {
        int sum = a + b;
        boolean ternar = 10 <= sum && sum <= 20 ? true : false;
            return ternar;

    }

    public static void task2() {
        int a = 15;
        if (a >= 0 ) {
            System.out.println("Положительное число");
        } else System.out.println("Отрицательное");

    }

    public static boolean task3(int a) {
        boolean ternar = a < 0 ? true : false;
        return ternar;

    }

    public static void task4() {
        int a = 7;
        String text = "Печатать";
        System.out.println("Слово " + text + " должно расчпечататься " + a + " раз");
        for (int i = 0 ; i < a; i++ ){
            System.out.println((i+1) + "-й" + " = " + text);
        }
    }

    public static void task5() {


    }*/






   /* public static void main(String[] args) {  //ДЗ 1 урок
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a=5;
        int b=10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");

    }

    public static void printColor(){
        int value = 500;
        if (value <= 0){
            System.out.println("Красный");
        } if (value > 0 && value <= 100 ){
            System.out.println("Желтый");
        } else System.out.println("Зелёный");

    }

    public static void compareNumbers(){
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (a >= b){
            System.out.println("a > = b");
        } else System.out.println("a < b");
    }*/
}

