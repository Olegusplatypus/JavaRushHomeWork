package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top;
    int left;
    int wight;
    int height;//напишите тут ваш код

    Rectangle(int top,int left,int wight, int height) {
        this.top = top;
        this.left = left;
        this.wight = wight;
        this.height = height;
    }
    Rectangle(int top,int left,int wight) {
        this.top = top;
        this.left = left;
        this.wight = wight;
    }

    Rectangle(int top,int left) {
        this.top = top;
        this.left = left;
    }
    Rectangle() {
        this.top = 10;
        this.left = 10;
        this.wight = 10;
        this.height = 10;
    }  //напишите тут ваш код

}
