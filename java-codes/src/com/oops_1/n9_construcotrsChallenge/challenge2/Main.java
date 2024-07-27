package com.oops_1.n9_construcotrsChallenge.challenge2;

public class Main {

  public static void main(String[] args) {
    Point p = new Point(2,3);
    System.out.println(p.distance());
    Point p1 = new Point(1,1);
    System.out.println(p.distance(p1));
    System.out.println(p.distance(1,1));

  }


}
