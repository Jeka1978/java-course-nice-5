package lab1;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Delegate;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by Evegeny on 10/01/2017.
 */
@Data
public class TaxCalculatorImpl implements TaxCalculator {
    private MaamResolver maamResolver = new MaamResolverImpl();


    public void setMaamResolver(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    @Override
    public double withMaam(double price) {



        double maam = maamResolver.getMaam();
        return price * maam + price;


    }

    public static void main(String[] args) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        double withMaam = taxCalculator.withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }
}









