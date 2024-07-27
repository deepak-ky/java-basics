package com.oops_1.n8_pojos_and_records;

public record WTAStudent(String id, String name, String dateOfBirth, String classList) {
}


/*
For each component in the header, Java generates:
- A field with the same name and declared type as the record component.
- It sets up fields for us as we have them in the parentheses.
- These become the fields of the record. The field is declared private and final.
- The field is sometimes referred to as a component field.

- Java generates a toString method that prints out each attribute in a formatted String.

- In addition to creating a private final field for each component, Java generates a public accessor method for each component.
- This method has the same name and type of the component, but it doesn't have any kind of special prefix like get or is,
- for example. The accessor method for id,in this example, is simply id().
* */