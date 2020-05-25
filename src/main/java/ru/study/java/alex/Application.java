package ru.study.java.alex;

public class Application {
    private static String val;

    public static void main(String[] args) {

        PremierMinister premierMinister = new PremierMinister("Alex", "Spreys", (short) 27, true, "Vasily", "Barviha");
        premierMinister.setAddress("Moscow, red square 1");
        premierMinister.setMinistersNumber(2);
        System.out.println("Application.main " + premierMinister);

        Boolean male = true;
        FinanceMinister financeMinister = new FinanceMinister("Alex", "Saint-Petersburg", "Dmitry", "Medvedev", (short) 40, male);
        financeMinister.setBudget(10000D);
        financeMinister.setProficit(100001D);
        financeMinister.setDefecit(0D);
        System.out.println("Application.main " + financeMinister.toString());

        Person premierMinister1 = new PremierMinister("Alex",
                "Spreys",
                (short) 27,
                true,
                "Vasily",
                "Barviha");

        Person financeMinister1 = new FinanceMinister("Alex",
                "Saint-Petersburg",
                "Dmitry",
                "Medvedev",
                (short) 40,
                male);

        System.out.println("\n");
        System.out.println("Application.main premierMinister1: " + premierMinister1);
        System.out.println("Application.main financeMinister1: " + financeMinister1);
        System.out.println("\n");

        financeMinister1.work();
    }

}





