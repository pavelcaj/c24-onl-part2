package Lesson30.Builder;

import Lesson30.Builder.Person;

public class BuilderExample {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("123 Main Street")
                .build();
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
