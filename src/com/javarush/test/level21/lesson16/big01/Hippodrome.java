package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Oleg on 09.04.2016.
 */
public class Hippodrome {
    ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) {
        game = new Hippodrome();
        game.getHorses().add(new Horse ("Bulevar",3,0));
        game.getHorses().add(new Horse ("Rodrigo",3,0));
        game.getHorses().add(new Horse ("Miller",3,0));
        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }
    public void run (){
        for (int i = 1; i <=100 ; i++) {
            move();
            print();
            try{
            Thread.sleep(200);}
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    public void move (){
        for (Horse horse:horses) {
            horse.move();
        }

    }
    public void print (){
        for (Horse horse:horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
        Horse winner=null;
        double maxDistance=0;
        for (Horse horse:horses) {
             if(horse.getDistance()>maxDistance)
             {
                 maxDistance=horse.getDistance();
                 winner=horse;
             }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
