package lab1;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class CheckTestRunner {
    public static void main(String[] args) throws Exception {
        JUnitRunner runner = new JUnitRunner();
        runner.runTests(TaxCalculatorTest.class);
    }
}
