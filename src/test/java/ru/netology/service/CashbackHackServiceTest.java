package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnUsualCase() {
        int amount = 900;
        int expected = 100;

        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void shouldReturnUsualCase2() {
        int amount = 700;
        int expected = 300;

        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void amountIsNull() {
        int amount = 0;
        int expected = 1000;

        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void shouldReturnNothing() {
        int amount = 1000;
        int expected = 0;

        assertEquals(expected, service.remain(amount));
    }

    @Test
    public void shouldReturnNothingCase2() {
        int amount = 2000;
        int expected = 0;

        assertEquals(expected, service.remain(amount));

    }
}