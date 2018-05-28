package ru.stqa.pft.sandbox;

import java.util.ArrayList;

public class Jtest {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("john");

    double len = 5;
    System.out.println("Square " + len + " = " + area(len));

    double a = 3;
    double b = 4;

    System.out.println("Sauare with side1 " + a + " and side2 " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
