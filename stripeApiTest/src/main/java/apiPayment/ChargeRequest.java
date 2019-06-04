package apiPayment;

import java.util.HashMap;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

public class ChargeRequest {
	
	public static void main(String[] args) throws StripeException{
		
		System.setProperty("https.proxyHost", "");
		System.setProperty("https.proxyPort", "");
		
		Stripe.apiKey = "";
		
		HashMap<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", "200");
		chargeMap.put("Currency", "USD");
		chargeMap.put("source", "");
		Charge.create(chargeMap);
	}

}
