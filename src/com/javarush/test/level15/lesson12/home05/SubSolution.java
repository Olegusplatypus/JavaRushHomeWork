package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Oleg on 03.03.2016.
 */
 class SubSolution extends Solution {
     SubSolution() {
    }

    protected SubSolution(String s, boolean b, String t, boolean f, int i, int y) {
        super(s, b, t, f, i, y);
    }

    protected SubSolution(String s, String t, int i, boolean b, int y) {
        super(s, t, i, b, y);
    }

    protected SubSolution(String s, String t, boolean b, int i, int y) {
        super(s, t, b, i, y);
    }

    public SubSolution(String s, String t, int i, int y, boolean b) {

        super(s, t, i, y, b);
    }

    public SubSolution(String s, String t, int i, int y) {

        super(s, t, i, y);
    }

    public SubSolution(String s, String t, int i) {

        super(s, t, i);
    }

    SubSolution(String s, String t) {
        super(s, t);
    }

    SubSolution(String s) {
        super(s);
    }
    private SubSolution (String s,boolean b, String t,boolean f){}
    private SubSolution (String s,boolean b, int y){}
    private SubSolution (String t,boolean f, int i, int y){}
}
