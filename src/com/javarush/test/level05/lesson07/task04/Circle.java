package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
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
    public void initialize(int CenterX,int CenterY,int radius ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
    }
    public void initialize(int CenterX,int CenterY,int radius, int width ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(int CenterX,int CenterY,int radius, int width, String colour ){
        this.CenterX = CenterX;
        this.CenterY = CenterY;
        this.radius = radius;
        this.width = width;
        this.colour = colour;
    }  //напишите тут ваш код

}
