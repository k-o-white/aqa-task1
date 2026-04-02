package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    public int remainFrom(int amount) {
        CashbackHackService service = new CashbackHackService();
        return service.remain(amount);
    }

    @Test
    public void testRemainFromZero() {
        Assert.assertEquals(remainFrom(0), 1000);
    }

    @Test
    public void testRemainFromOne() {
        Assert.assertEquals(remainFrom(1), 999);
    }

    @Test
    public void testRemainFromThreeHundred() {
        Assert.assertEquals(remainFrom(300), 700);
    }

    @Test
    public void testRemainFromNineHundredNinetyNine() {
        Assert.assertEquals(remainFrom(999), 1);
    }

    @Test
    public void testRemainFromOneThousand() {
        Assert.assertEquals(remainFrom(1000), 0);
    }

    @Test
    public void testRemainFromMoreThanOneThousand() {
        Assert.assertEquals(remainFrom(1300), 700);
    }
}
