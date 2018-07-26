package ru.stqa.pft.sandbox.lambdaTest;

public class OperationDemo {

  public static void main(String args[]) {

    Item<Integer> sum = (a, b) -> {
      int res = a + b;
      return Integer.toString(res);
//      return "Result: " + res;
    };

    Item<Double> mult = (a, b) -> {
      Double res = a * b;
//      return res;
      return "Result: " + res;
    };

    System.out.println(sum.mathOperation(3, 3));
    System.out.println(mult.mathOperation(3.2, 3.3));
  }
}
