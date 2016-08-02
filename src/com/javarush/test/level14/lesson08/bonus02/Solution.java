package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 0, max = 0;
        int print = 0;
        if (a == b)
        System.out.println(a);
        else if (a < b) {
            min = a;
            max = b;
            print=count(max,min);
            System.out.println(print);
        } else {
            min = b;
            max = a;
            print=count(max,min);
            System.out.println(print);
        }


    }

        public static int count(int max,int min) {
            int print=0;
            if (isPrime(max) == false && isPrime(min) == false) {
                for (int i = min; i > 1; i--) {
                    if (min % i == 0 && max % i == 0) {
                        print = i;
                        break;
                    }
                }
            } else if (max % min == 0) print = min;
            else print = 1;
            return print;
        }

    public static boolean isPrime(int num){
        boolean prime=true;
        for (int i = 2; i<num; i++) {
            if (num % (i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
