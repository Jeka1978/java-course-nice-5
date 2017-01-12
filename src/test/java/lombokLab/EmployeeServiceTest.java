package lombokLab;

import constants.UIConst;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class EmployeeServiceTest {

    private Person person;
    private Customer customer;
    EmployeeService employeeService;


    @Before
    public void setUp() throws Exception {
        person = new Person(12, "Jeka");
        customer = new Customer(person, "blue");
        employeeService = new EmployeeService();
    }

    @Test
    public void consume() throws Exception {


        Employee employee = employeeService.consume(customer);
        Assert.assertEquals(40, employee.getSalary());
        Assert.assertEquals(12, employee.getId());
        Assert.assertEquals("Jeka", employee.getName());

    }

    @Test
    public void testConvertCustomerToJson() throws Exception {
        String json = employeeService.convert2Json(customer);
        System.out.println(json);
        Assert.assertNotEquals(0,json.length());
    }

    @Test
    public void testConvertCustomerFromJson() throws Exception {
        String json = "{\"favoriteColor\":\"blue\",\"name\":\"Jeka\",\"id\":12}";
        Customer customer = employeeService.convertCustomerFromJson(json);
        Assert.assertEquals("Jeka",customer.getName());
        Assert.assertEquals(12,customer.getId());
        System.out.println(customer);

    }
}






