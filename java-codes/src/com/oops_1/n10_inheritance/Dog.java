package com.oops_1.n10_inheritance;

/*

When Dog class was only this
public class Dog extends Animal{
}

and Animal only had a parameterized constructor.


When you declare a class without any constructors, Java automatically provides a default constructor for that class.
The default constructor does not take any arguments and includes a call to the superclass no argument constructor (super()).

Since the Animal class does not contain a no argument constructor, but only a parameterized constructor the implicit call to
'super()' from the 'Dog()' class default constructor fails leading to compilation error

"There is no default constructor available in 'com.oops_1.n10_inheritance.Animal'"
* */
public class Dog extends Animal{

  public Dog(){
    super("Dog", "fast", 10);
  }
}
