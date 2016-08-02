package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> alllist = new ArrayList();
        ArrayList<Human> generation1 = new ArrayList();
        ArrayList<Human> generation2 = new ArrayList();

        //напишите тут ваш код
        Human grandpa1 = new Human("sdgfdfgfd",true,8,generation1);
        Human grandpa2 = new Human("sdgfdfgfd",true,8,generation1);
        Human grandma1 = new Human("sdgfdfgfd",true,8,generation1);
        Human grandma2 = new Human("sdgfdfgfd",true,8,generation1);
        Human father = new Human("sdgfdfgfd",true,8,generation2);
        Human mother = new Human("sdgfdfgfd",true,8,generation2);
       Human child1 = new Human("sdgfdfgfd",true,8); //напишите тут ваш код
       Human child2 = new Human("sadsa",true,4); //напишите тут ваш код
       Human child3 = new Human("fdfs",true,5); //напишите тут ваш код
        generation1.add(father);
        generation1.add(mother);
        generation2.add(child1);
        generation2.add(child2);
        generation2.add(child3);
        alllist.addAll(generation1);
        alllist.addAll(generation2);
        alllist.add(grandpa1);
        alllist.add(grandpa2);
        alllist.add(grandma1);
        alllist.add(grandma2);
        for (Human H: alllist)
              {
                  System.out.println(H);
        }
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList();
        Human (String name,boolean sex,int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        Human (String name,boolean sex,int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;//напишите тут ваш код
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
