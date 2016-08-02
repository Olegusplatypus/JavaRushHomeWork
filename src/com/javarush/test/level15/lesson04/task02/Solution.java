package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, int g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, int n, float g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, int n, short g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, int n, Integer g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, int n, double g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, float n, char g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, long n, char g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    } public static void printMatrix(int m, int n, char g) {
        for (int i = 0; i < m; i++) {
            {
                System.out.print(g);
            }
            System.out.println();
        }
    }
}