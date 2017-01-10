package lombokLab;

/**
 * Created by Evegeny on 10/01/2017.
 */


// guess game
public class EmployeeService {
    public Employee consume(Customer customer) {
       return new Employee(customer.getPerson(), calcSalary(customer));
    }

    public String convert2Json(Customer customer) {
        return null;
    }

    public String convert2Json(Employee employee) {
        return null;
    }

    public Employee convertEmployeeFromJson(String json) {
        return null;
    }

    public Customer convertCustomerFromJson(String json) {
        return null;
    }









    private int calcSalary(Customer customer) {
        return customer.getName().length() * 10;
    }
}
