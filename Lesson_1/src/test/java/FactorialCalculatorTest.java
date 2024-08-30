public class FactorialCalculatorTest {
    @Test
    public void calculateFactorial_positiveInput() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(4), 24);
    }

    @Test
    public void calculateFactorial_zeroInput() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(0), 1);
    }

    @Test
    public void calculateFactorial_negativeInput() {
        Assert.assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-5));
    }
}