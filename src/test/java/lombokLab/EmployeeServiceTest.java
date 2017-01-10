package lombokLab;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class EmployeeServiceTest {
    @Test
    public void consume() throws Exception {

        int num = Integer.parseInt(JOptionPane.showInputDialog("input your name"));
        System.out.println(num);

        Person jeka = new Person(12, "Jeka");
        Customer customer = new Customer(jeka, "blue");
        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.consume(customer);
        Assert.assertEquals(40,employee.getSalary());
        Assert.assertEquals(12,employee.getId());
        Assert.assertEquals("Jeka",employee.getName());

    }

}