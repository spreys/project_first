package ru.study.java.alex;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    public void work() {
        System.out.println("Person.work "+toString());
    }

    private String firstName;
    private String lastName;
    private Short age;
    private Boolean gender;
    private String address;

    public Person(String firstName, String lastName, Short age, Boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
