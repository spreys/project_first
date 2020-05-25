package ru.study.java.alex;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceMinister extends Person {
    private String driver;
    private String residence;
    private Double budget;
    private Double proficit;
    private Double defecit;

    public FinanceMinister(String driver, String residence, String firstName, String lastName, Short age, Boolean gender) {
        super(firstName, lastName, age, gender);
        this.driver = driver;
        this.residence = residence;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("FinanceMinister::work(). Current proficit: [" + proficit + "], current deficit: [" + defecit + "]");
    }

    @Override
    public String toString() {
        return "FinanceMinister{" +
                "driver='" + driver + '\'' +
                ", residence='" + residence + '\'' +
                ", budget=" + budget +
                ", proficit=" + proficit +
                ", defecit=" + defecit +
                "} " + super.toString();
    }


}
