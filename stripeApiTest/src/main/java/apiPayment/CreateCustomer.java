package apiPayment;

import java.util.HashMap;
import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

public class CreateCustomer {
	
	Customer customerCreated;
	
	public Customer createCustomer() throws StripeException{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("description", "Test Customer 1 for transaction");
		map.put("email", "testcustomer1@test.com");
		map.put("name", "Test Customer 1");
		customerCreated = Customer.create(map);
		return customerCreated;
	}
	
	public Customer retrieveCustomerDetails(String customerId) throws StripeException{
		return Customer.retrieve(customerId);
	}

}
