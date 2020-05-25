package ru.study.java.alex;

import org.junit.Test;

import static org.junit.Assert.*;

public class PremierMinisterTest {

    @Test
    public void testSetAgeOK(){
        //if-when
        PremierMinister premierMinister = new PremierMinister();
        premierMinister.setAge((short) 20);

        //then
        Short actualAge = premierMinister.getAge();
        Short expectedAge = 20;

        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testSetAgeFail(){
        //if-when
        PremierMinister premierMinister = new PremierMinister();
        premierMinister.setAge((short) 20);

        //then
        Short actualAge = premierMinister.getAge();
        Short expectedAge = 10;
        assertNotSame(expectedAge, actualAge);
        assertFalse(expectedAge.equals(actualAge));
    }
}
