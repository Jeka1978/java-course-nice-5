package lab1;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();

        MaamResolver maamResolverMock = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolverMock.getMaam()).thenReturn(0.17);

        taxCalculator.setMaamResolver(maamResolverMock);

        double result = taxCalculator.withMaam(100);
        Assert.assertEquals(117,result,0.000001);
    }

}