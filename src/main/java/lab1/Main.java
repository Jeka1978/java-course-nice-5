package lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;


/**
 * Created by Evegeny on 10/01/2017.
 */
public class Main {




    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        ArrayList<String> strings = new ArrayList<>();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        TaxCalculator taxCalculator = context.getBean(TaxCalculator.class);
        double withMaam = taxCalculator.withMaam(100);
        System.out.println("withMaam = " + withMaam);
    }
}
