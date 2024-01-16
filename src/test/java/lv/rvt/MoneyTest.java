package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void isMoneySumCorrect() {
        Money a = new Money(10,60);
        Money b = new Money(5,60);
        Money c = a.plus(b);

        assertEquals(16, c.euros());
        assertEquals(20, c.cents());
    }

     @Test
    public void comparingWorksGood() {
        Money a = new Money(10,60);
        Money b = new Money(5,60);

        assertTrue(b.lessThan(a));
        assertFalse(a.lessThan(b));
    }


     @Test
    public void minusWorkingGood() {
        Money a = new Money(3,50);
        Money b = new Money(2,60);
        Money c = a.minus(b);

        assertEquals(0, c.euros());
        assertEquals(90, c.cents());
    }
}
