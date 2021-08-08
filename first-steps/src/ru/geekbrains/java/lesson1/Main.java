package ru.geekbrains.java.lesson1;
/*
1 Создать пустой проект в IntelliJ IDEA и прописать метод main().
2 Создать переменные всех пройденных типов данных и инициализировать их значения.
3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
4 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
(включительно), если да – вернуть true, в противном случае – false.
5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
6 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
отрицательное, и вернуть false если положительное.
7 Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
сообщение «Привет, указанное_имя!».
8 Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */


public class Main {

    public static void main(String[] args) {

        int a = 10;
        float b = 2.25f;
        boolean tf = true;
        char symb = 'F';

        System.out.println(sum(a, a));
        System.out.println(symb);
        System.out.println(someMath(2,2,2,2));
        System.out.println(isItTeen(1, 11));
        isItPositive(-15);
        System.out.println(isItNegativeBool(0));
        hiName("Kabal");
        isYearLeap(2021);
	// write your code here
    }

    public static int sum(int a, int b) {

        return a + b;
    }

    public static float someMath(float a, float b, float c, float d) {
    /*    3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
                где a, b, c, d – аргументы этого метода, имеющие тип float.*/
        return a * (b + (c / d));

    }

    public static boolean isItTeen(int n1, int n2) {
        /*
        4 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        (включительно), если да – вернуть true, в противном случае – false.
        */

        int n = n1 + n2;

        return ((n >= 10) && (n <= 20));
    }

    public static void isItPositive(int n) {
        /*
        5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        */

        String sign;

        if (n >= 0) {

            sign = " - положительное ";

        } else {

            sign = " - отрицательное ";

        }

        System.out.println(n + sign + "число");
    }

    public static boolean isItNegativeBool(int n) {
        /*6
        Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
        отрицательное, и вернуть false если положительное.
        */
        return n < 0;
    }

    public static void hiName(String firstName) {
        /*
        7 Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
        сообщение «Привет, указанное_имя!».
        */

        System.out.println("Привет, " + firstName + "!");
    }

    public static void isYearLeap(int year) {
        /*
        8 Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
        является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        */
        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }


    }

}
