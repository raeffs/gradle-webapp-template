package ch.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator sut;

    @Before
    public void setUp() {
        sut = new Calculator();
    }

    @Test
    public void addReturnsCorrectResult() {
        int actual = sut.add(3, 4);

        Assert.assertEquals(7, actual);
    }

    @Test
    public void substractReturnsCorrectResult() {
        int actual = sut.substract(3, 4);

        Assert.assertEquals(-1, actual);
    }

    @Test
    public void squareReturnsCorrectResult() {
        int actual = sut.square(3);

        Assert.assertEquals(9, actual);
    }

    @Test
    public void multiplyReturnsCorrectResult() {
        int actual = sut.multiply(3, 4);

        Assert.assertEquals(12, actual);
    }
}
