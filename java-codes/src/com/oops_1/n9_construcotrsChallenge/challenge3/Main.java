package com.oops_1.n9_construcotrsChallenge.challenge3;

public class Main {

  public static void main(String[] args) {
    Floor floor = new Floor(10,3);
    Carpet carpet = new Carpet(5);
    Calculator calculator = new Calculator(floor,carpet);
    System.out.println(calculator.getTotalCost());
  }
}
