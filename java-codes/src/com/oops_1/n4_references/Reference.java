package com.oops_1.n4_references;

public class Reference {
    public static void main(String[] args) {
        /*
            - An object is created but there is no reference to this object.

            - This object is created in memory but after this statement completes, my code has no way to access it.

            - The object exists in memory, but I can't communicate with it after this statement is complete.

            - This object will stay in memory with no reference to it,
            -    until Java's Garbage Collection figures out there is no running code with reference to this object
            -    and deletes it.

            - This object is said to be eligible for garbage collection immediately after the first statement

            - It's useless to the code as it is no longer accessible
        */
       new House("red");
       House blueHouse = new House("blue");
        System.out.println(blueHouse.getColor());

        // This has no relationship to the object declared on line 20
        House redHouse = new House("red");
        System.out.println(redHouse.getColor());
    }
}

class House{
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
