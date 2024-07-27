package com.oops_1.n8_pojos_and_records;

public class Main {

  public static void main(String[] args) {

    // Making 5 student POJO's
    for(int i=1;i<=5;i++){
      Student s = new Student("2K18:" + i,
          switch (i){
            case 1 -> "Deepak";
            case 2 -> "Kumar";
            case 3 -> "Yadav";
            default -> "DKY";
          },
          "12/10/2000", "Java 17");
      System.out.println(s);
    }

    System.out.println("--------------------------------------------------------------------------------------");

    // Making 5 student Record's
    for(int i=1;i<=5;i++){
      WTAStudent wtaStudent = new WTAStudent("2K18:" + i,
          switch (i){
            case 1 -> "Deepak";
            case 2 -> "Kumar";
            case 3 -> "Yadav";
            default -> "DKY";
          },
          "12/10/2000", "Java 17");
      System.out.println(wtaStudent);
    }

    System.out.println("--------------------------------------------------------------------------------------");

    System.out.println("pojo and record object creation\n");

    Student pojoStudent = new Student("2K18:10", "Rahul", "12/10/2001", "Java 17");
    WTAStudent recordStudent = new WTAStudent("2K18:11", "Rohan", "12/10/2002", "Java 17");

    System.out.println(pojoStudent);
    System.out.println(recordStudent);

    System.out.println("--------------------------------------------------------------------------------------");

    System.out.println("using getter accessor methods\n");

    System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
    System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    System.out.println("--------------------------------------------------------------------------------------");

    System.out.println("using setter methods\n");

    pojoStudent.setClassList("C++");
    // Cannot set for recordStudent
    System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
    System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


  }
}
