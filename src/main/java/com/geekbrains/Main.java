package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private final static int SIZE = 3;
    private final static char DOT_EMPTY = '.';
    private final static char DOT_X = 'X';
    private final static char DOT_0 = '0';
    private final static char [] [] MAP = new char[SIZE][SIZE];
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if(checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if(checkWin(DOT_0)) {
                System.out.println("Победил ИИ");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }
    }

    System.out.println("Игра окончена");
    SCANNER.close();
}

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][0] == symbol && MAP[i][1] == symbol && MAP[i][2] == symbol)
                return true;
        }
        for (int i = 0; i < SIZE; i++) {
            if (MAP[0][i] == symbol && MAP[1][i] == symbol && MAP[2][i] == symbol)
                return true;
        }
            if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol)
                return true;
            if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol)
                return true;

        return false;
        }




/*        if (MAP [0] [0] == symbol && MAP[0][1] == symbol && MAP [0][2] == symbol)
            return true;
        if (MAP [1] [0] == symbol && MAP[1][1] == symbol && MAP [1][2] == symbol)
        return true;
        if (MAP [2] [0] == symbol && MAP[2][1] == symbol && MAP [2][2] == symbol)
        return true;
        if (MAP [0] [0] == symbol && MAP[1][0] == symbol && MAP [2][0] == symbol)
        return true;
        if (MAP [0] [1] == symbol && MAP[1][1] == symbol && MAP [2][1] == symbol)
        return true;
        if (MAP [0] [2] == symbol && MAP[1][2] == symbol && MAP [2][2] == symbol)
            return true;
        if (MAP [0] [0] == symbol && MAP[1][1] == symbol && MAP [2][2] == symbol)
            return true;
        if (MAP [2] [0] == symbol && MAP[1][1] == symbol && MAP [0][2] == symbol)
            return true;

        return false;

    }*/

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;

    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("ИИ ходил в точку " + (x + 1) + ";" + (y + 1));
        MAP[y][x] = DOT_0;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return MAP [y][x] ==DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите число в формате X и Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while(!isCellValid(x, y));

        MAP[y][x] = DOT_X;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <=  SIZE; i++) {
            System.out.print (i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
   /* public static void main(String[] args) {      // ДЗ 3 урок
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
*/
/*    public static void main(String[] args) {    // ДЗ 2 урок
        System.out.println(task1(10,10));
        System.out.println(task2(5));
        System.out.println(task3(-15));
        System.out.println();
        System.out.println(task4(7));
        System.out.println();

    }

    public static boolean task1(int a, int b) {
        int sum = a + b;
        boolean ternar = 10 <= sum && sum <= 20 ? true : false;
            return ternar;

    }

    public static void task2(int a) {
        if (a >= 0 ) {
            System.out.println("Положительное число");
        } else System.out.println("Отрицательное");

    }

    public static boolean task3(int a) {
        boolean ternar = a < 0 ? true : false;
        return ternar;

    }

    public static void task4(int a) {
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

