package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        try{
        A a = new A(1,3);
        A a1= (A)a.clone();
            System.out.println(a);
            System.out.println(a1);
        B b = new B(1,4,"test");
        B b1 = (B) b.clone();
            System.out.println(b);
            System.out.println(b1);
            C c = new C(1,2,"test2");
            C c1 = (C)c.clone();
            System.out.println(c);
            System.out.println(c1);
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Cannot be cloned.");
        }
    }
    public static class A implements Cloneable {
        private int i;
        private int j;
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        public Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B {
        public Object clone() throws CloneNotSupportedException {
            C clone = new C(super.getI(),super.getJ(),super.getName());
            return clone;
        }
        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }
}
