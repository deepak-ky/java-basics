package com.oops_1.n9_construcotrsChallenge.challenge4;

public class ComplexNumber {
 private double real;
 private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal(){
    return real;
  }

  public double getImaginary(){
    return imaginary;
  }

  public void add(double a, double b){
    real += a;
    imaginary += b;
  }

  public void add(ComplexNumber c){
    real += c.real;
    imaginary += c.imaginary;
  }

  public void subtract(double a, double b){
    real -= a;
    imaginary -= b;
  }

  public void subtract(ComplexNumber c){
    real -= c.real;
    imaginary -= c.imaginary;
  }
}
