package com.oops_1.n9_construcotrsChallenge.challenge2;

public class Point {
  private int x;
  private int y;

  public Point() {

  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance(){
    int xdiff = x-0;
    int ydiff = y-0;
    return Math.sqrt((xdiff*xdiff) + (ydiff*ydiff));
  }

  public double distance(Point p){
    int xdiff = x-p.x;
    int ydiff = y-p.y;
    return Math.sqrt((xdiff*xdiff) + (ydiff*ydiff));
  }

  public double distance(int x,int y){
    int xdiff = this.x-x;
    int ydiff = this.y-y;
    return Math.sqrt((xdiff*xdiff) + (ydiff*ydiff));
  }
}
