package DependencyInjectionExample;

public class TestDependencyInjection {
    public static void main(String[] args) {
        // Create a CustomerRepository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the CustomerRepository instance into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Use CustomerService to find a customer
        Customer customer = customerService.findCustomerById("12345");
        System.out.println(customer);
    }
}
