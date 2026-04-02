package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    public int remainFrom(int amount) {
        CashbackHackService service = new CashbackHackService();
        return service.remain(amount);
    }

    @Test
    public void testRemainFromZero() {
        Assert.assertEquals(1000, remainFrom(0));
    }

    @Test
    public void testRemainFromOne() {
        Assert.assertEquals(999, remainFrom(1));
    }

    @Test
    public void testRemainFromThreeHundred() {
        Assert.assertEquals(700, remainFrom(300));
    }

    @Test
    public void testRemainFromNineHundredNinetyNine() {
        Assert.assertEquals(1, remainFrom(999));
    }

    @Test
    public void testRemainFromOneThousand() {
        Assert.assertEquals(0, remainFrom(1000));
    }

    @Test
    public void testRemainFromMoreThanOneThousand() {
        Assert.assertEquals(700, remainFrom(1300));
    }
}