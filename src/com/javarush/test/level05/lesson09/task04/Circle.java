package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int CenterX;
    int CenterY;
    int radius;
    int width;
    String colour;
    Circle(int CenterX,int CenterY,int radius ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
    }
    Circle(int CenterX,int CenterY,int radius, int width ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
        this.width = width;
    }
    Circle(int CenterX,int CenterY,int radius, int width, String colour ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
        this.width = width;
        this.colour = colour;
    }   //напишите тут ваш код

}
