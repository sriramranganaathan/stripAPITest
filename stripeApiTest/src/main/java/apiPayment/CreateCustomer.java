package apiPayment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

import properties.PropertiesFile;

public class CreateCustomer {
	
	static Customer customerCreated;

	public static void main(String[] args) throws StripeException, IOException {
		
		Proxy.setProxy();
		
		Stripe.apiKey = PropertiesFile.getProperty("Secretkey");
		
		//add customer
		createCustomer();
		
		//get Customer id
		System.out.println(customerCreated.getId());
		
		retrieveCustomerDetails(customerCreated.getId());
	}
	
	public static void createCustomer() throws StripeException{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("description", "Test Customer 1 for transaction");
		map.put("email", "testcustomer1@test.com");
		map.put("name", "Test Customer 1");
		customerCreated = Customer.create(map);
	}
	
	public static void retrieveCustomerDetails(String customerId) throws StripeException{
		System.out.println(Customer.retrieve(customerId));
	}

}
