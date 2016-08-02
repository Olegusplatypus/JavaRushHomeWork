package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable {
    static final long serialVersionUID = 3L;

    public static void main(String[] args) throws IOException,ClassNotFoundException {

        FileOutputStream output = new FileOutputStream("your.file.name");
        ObjectOutputStream outputStream = new ObjectOutputStream(output);

        A a = new A("A");
        Solution.B b = new Solution().new B("B");
        outputStream.writeObject(b);
        output.flush();
        output.close();
        outputStream.close();
        System.out.println(b);

        FileInputStream input = new FileInputStream("your.file.name");
        ObjectInputStream objectStream = new ObjectInputStream(input);

        B b1 = (B) objectStream.readObject();

        input.close();
        objectStream.close();

        System.out.println(b1);
    }
    public static class A {
        protected String name = "A";

        public A(String name) {
            this.name += name;
        }
        public A () {}
    }

    public class B extends A implements Serializable {
        static final long serialVersionUID = 4L;
        public B(String name) {
            super(name);
            this.name += name;
        }
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeObject(name);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            name = (String)in.readObject();
        }

    }
}
