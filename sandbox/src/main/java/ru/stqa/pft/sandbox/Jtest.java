package ru.stqa.pft.sandbox;

import java.util.ArrayList;

public class Jtest {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("john");

    Square s = new Square(5);
    System.out.println("Square " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(3,4);
    System.out.println("Sauare with side1 " + r.a + " and side2 " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }


}
