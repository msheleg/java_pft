package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Masha");
        hello("user");
        hello("Philipp");
        hello("Klim");
        double len =5;
        System.out.println("Square area with side " + len + " = " + area(len));

        double a= 4;
        double b=6;
        System.out.println("Square rectangle area with side " + a + "and" + b+ " = " + area(a,b));
    }
    public static void hello(String somebody) {
        System.out.println("Hello," + somebody+ "!");
    }
    public static double area (double l){
        return l*l;
    }

    public static double area(double a, double b) {
        return a*b;
    }

}
