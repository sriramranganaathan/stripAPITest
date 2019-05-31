package apiPayment;

import java.util.HashMap;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

public class ChargeRequest {
	
	public static void main(String[] args) throws StripeException{
		
		System.setProperty("https.proxyHost", "19.12.80.237");
		System.setProperty("https.proxyPort", "83");
		
		Stripe.apiKey = "sk_test_S59kHC1PUPPs5ap0XmUSFV8i00IF52Ol80";
		
		HashMap<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", "200");
		chargeMap.put("Currency", "USD");
		chargeMap.put("source", "");
		Charge.create(chargeMap);
	}

}
