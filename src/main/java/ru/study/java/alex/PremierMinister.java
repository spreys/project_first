package ru.study.java.alex;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PremierMinister extends Person {
    private String driver;
    private String residence;
    private Integer ministersNumber;

    public PremierMinister(String firstName, String lastName, Short age,
                           boolean gender, String driver, String residence) {
        super(firstName, lastName, age, gender);
        this.driver = driver;
        this.residence = residence;
    }

    public PremierMinister() {
        super();
    }

    @Override
    public void work() {
        System.out.println("PremierMinister::work(). Manages this number of ministers [" + ministersNumber + "]");
    }

    @Override
    public String toString() {
        return "PremierMinister{" +
                "driver='" + driver + '\'' +
                ", residence='" + residence + '\'' +
                ", ministersNumber=" + ministersNumber +
                "} " + super.toString();
    }
}
