package lombokLab;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.IOException;

/**
 * Created by Evegeny on 10/01/2017.
 */


// guess game
public class EmployeeService {

    private ObjectMapper mapper = new ObjectMapper();

    public Employee consume(Customer customer) {
        return new Employee(customer.getPerson(), calcSalary(customer));
    }

    @SneakyThrows
    public String convert2Json(Customer customer) {
        return mapper.writeValueAsString(customer);
    }

    public String convert2Json(Employee employee) {
        return null;
    }



    public Employee convertEmployeeFromJson(String json) {
        return null;
    }

    public Customer convertCustomerFromJson(String json) throws IOException {
        Customer customer = mapper.readValue(json, Customer.class);
        return customer;
    }


    private int calcSalary(Customer customer) {
        return customer.getName().length() * 10;
    }
}
