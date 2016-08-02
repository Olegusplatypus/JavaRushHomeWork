package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
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

    public void initialize(int top,int left,int wight, int height) {
        this.top = top;
        this.left = left;
        this.wight = wight;
        this.height = height;
    }
    public void initialize(int top,int left,int wight) {
        this.top = top;
        this.left = left;
        this.wight = wight;
}

    public void initialize(int top,int left) {
        this.top = top;
        this.left = left;
    }
    public void initialize() {
        this.top = 10;
        this.left = 10;
        this.wight = 10;
        this.height = 10;
        }
}
