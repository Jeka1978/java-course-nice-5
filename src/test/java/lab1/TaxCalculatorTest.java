package lab1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class TaxCalculatorTest {
    @Test(timeout = 10)
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        double result = taxCalculator.withMaam(100);
        Assert.assertEquals(117,result,0.000001);
    }

}