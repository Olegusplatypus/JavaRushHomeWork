package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User user1 = new User();
            user1.setFirstName("Lex");
            user1.setLastName("Luter");
            user1.setBirthDate(new Date(90,10,13));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user1);

            User user2 = new User();
            user2.setFirstName("Clark");
            user2.setLastName("Kent");
            user2.setBirthDate(new Date(80,0,9));
            user2.setMale(true);
            user2.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user2);

            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            for (User user:javaRush.users) {
                System.out.println(user);
            }
            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            for (User user:loadedObject.users) {
                System.out.println(user);
            }
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(users.size());
            for (User user:users) {
                printWriter.println(user.getFirstName());
                printWriter.println(user.getLastName());
                printWriter.println(user.getBirthDate());
                printWriter.println(user.isMale());
                printWriter.println(user.getCountry().getDisplayedName());
            }
            printWriter.flush();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy",Locale.ENGLISH);
            int objects = Integer.parseInt(reader.readLine());
            for (int i = 0; i <objects; i++) {
                User user = new User();
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                user.setBirthDate(format.parse(reader.readLine()));
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                String country = reader.readLine();
                switch (country) {
                    case "Russia": user.setCountry(User.Country.RUSSIA);break;
                    case "Ukraine": user.setCountry(User.Country.UKRAINE);break;
                    case "Other": user.setCountry(User.Country.OTHER);break;
                }
                users.add(user);
            }
            //implement this method - реализуйте этот метод
        }
    }
}
