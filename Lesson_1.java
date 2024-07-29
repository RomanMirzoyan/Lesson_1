public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumPeriod(10, 10);
        checkPositiveNumber(5);
        checkNegativeNumber(-5);
        printStringNumber("test", 4);
        checkYear(800);
        changeNumber();
        fillArray();
        changeNumber6();
        fillSquare();
        fillArray1(4, 5);
    }

    public static void printThreeWords() {
        String[] fruits = { "Apple", "Orange", "Banana" };
        for (String f : fruits) {
            System.out.println(f);
        }
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkSumPeriod(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);

    }

    public static void checkPositiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static boolean checkNegativeNumber(int a) {
        return a < 0;

    }

    public static void printStringNumber(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean checkYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void changeNumber() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int i = 0;
        for (int a : arr) {
            if (a == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

            i++;
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
    }

    public static void changeNumber6() {
        int[] arr = { 11, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int i = 0;
        for (int a : arr) {
            if (a < 6) {
                arr[i] = a * 2;
            }

            i++;
        }
    }

    public static void fillSquare() {
        int[][] square = new int[10][10];
        for (int i = 0; i < 10; i++) {
            square[i][i] = 1;
        }

    }

    public static int[] fillArray1(int len, int intialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = intialValue;
        }
        return arr;
    }
}