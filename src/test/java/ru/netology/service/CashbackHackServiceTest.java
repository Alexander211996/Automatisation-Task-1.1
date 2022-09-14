package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnUsualCase() {
        int amount = 900;
        int expected = 100;

        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldReturnUsualCase2() {
        int amount = 700;
        int expected = 300;

        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void amountIsNull() {
        int amount = 0;
        int expected = 1000;

        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldReturnNothing() {
        int amount = 1000;
        int expected = 0;

        assertEquals(service.remain(amount), expected);
    }

    @Test
    public void shouldReturnNothingCase2() {
        int amount = 2000;
        int expected = 0;

        assertEquals(service.remain(amount), expected);
    }


}