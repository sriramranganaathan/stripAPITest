package apiPayment;

import java.io.IOException;
import java.util.HashMap;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import properties.PropertiesFile;
import proxyConfiguration.Proxy;

public class ChargeRequest {
	
	public static void main(String[] args) throws StripeException, IOException{
		
		Proxy.setProxy();
		
		Stripe.apiKey = PropertiesFile.getProperty("Secretkey");
		
		HashMap<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", "200");
		chargeMap.put("Currency", "USD");
		chargeMap.put("source", "");
		Charge.create(chargeMap);
	}

}
