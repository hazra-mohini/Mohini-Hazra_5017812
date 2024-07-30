package DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Mock implementation for demonstration
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
