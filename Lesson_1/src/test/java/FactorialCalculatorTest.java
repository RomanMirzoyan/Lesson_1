
class FactorialCalculatorTest {
    @Test
    void calculateFactorial_positiveInput() {
        Assert.assertEquals(24, FactorialCalculator.calculateFactorial(4));
    }

    @Test
    void calculateFactorial_zeroInput() {
        Assert.assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void calculateFactorial_negativeInput() {
        Assert.assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-4));
    }
}
