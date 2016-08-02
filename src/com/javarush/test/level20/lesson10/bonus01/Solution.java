package com.javarush.test.level20.lesson10.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {
    public static void main(String[] args) throws Exception {

        Long t0 = System.currentTimeMillis();
        int[] result = getNumbers(912985154);  //912985154
        Long t1 = System.currentTimeMillis();
        System.out.println("Time need to create the arrray = " + (t1 - t0) + " milisec");
        long Memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Required memory: " + Memory / (1024 * 1024) + " MB");
        for (int item : result) {
            System.out.print(item + " ");
        }
    }
    public static int[] getNumbers(int N) {
        long [] [] pow = new long [10] [12];
        for (int i = 0; i <=9 ; i++) {
            for (int j = 0; j <12; j++) {
                pow [i] [j] = (long) Math.pow(i,j);
            }
        }
        List <Integer> resultNumbers = new ArrayList<>();
        for (int i = 1; i < N ; i++) {
            int digit=1;
            long summary=0;
            int j=i;
            int digcount=0;
            //finding number of digits
            while (j>0){digcount++;
                j/=10;}
            j=i;
            //finding summary
            while(j>0){
                digit = j%10;
                summary+=pow[digit][digcount];
            j/=10;}
            if(i==summary) resultNumbers.add(i);
        }
        int[] result = new int[resultNumbers.size()];
        for (int i = 0; i <result.length; i++) {
            result[i]=resultNumbers.get(i);
        }
        return result;
    }
}


//        public static int[] getNumbers(int N) {
//            List<Integer> list = new LinkedList<Integer>();
//            for (int i = 1; i < N + 1; i++) {
//                int power = (i + "").length();
//                int sum = 0;
//                int digit = 0;
//                int tmp = i;
//                while (tmp > 0) {
//                    digit = tmp % 10;
//                    tmp /= 10;
//                    int pow = digit;
//                    for (int j = 1; j < power; j++) pow = pow * digit;
//                    sum += pow;
//                }
//                if (sum == i) list.add(sum);
//            }
//            int[] result = new int[list.size()];
//            for (int i = 0; i < result.length; i++) result[i] = list.get(i);
//            return result;
//        }
//
//    }
