package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       Human grandpa1= new Human("Афанасий",true,67,null,null); //напишите тут ваш код
       Human grandpa2= new Human("Авраам",true,76,null,null); //напишите тут ваш код
       Human grandma1= new Human("Зоя Прокофьевна",false,65,null,null); //напишите тут ваш код
       Human grandma2= new Human("Сарочка",false,65,null,null); //напишите тут ваш код
        Human father= new Human("Толик",true,42,grandpa1,grandma1); //напишите тут ваш код
        Human mother= new Human("Света",false,34,grandpa2,grandma2); //напишите тут ваш код
        Human kid1= new Human("Танька",false,14,father,mother); //напишите тут ваш код
        Human kid2= new Human("Лиза",false,8,father,mother); //напишите тут ваш код
        Human kid3= new Human("Костик",true,10,father,mother); //напишите тут ваш код
        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);


    }

    public static class Human
    {
       String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;
        Human (String name,Boolean sex,int age,Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }//напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
