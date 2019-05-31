package apiPayment;

import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;

public class CreateToken {
	
	public static void main(String args[]) throws StripeException{
		
		System.setProperty("https.proxyHost", "19.12.80.237");
		System.setProperty("https.proxyPort", "83");
		
		Stripe.apiKey = "sk_test_S59kHC1PUPPs5ap0XmUSFV8i00IF52Ol80";

		Map<String, Object> tokenParams = new HashMap<String, Object>();
		Map<String, Object> cardParams = new HashMap<String, Object>();
		cardParams.put("number", "");
		cardParams.put("exp_month", 4);
		cardParams.put("exp_year", 2022);
		cardParams.put("cvc", "143");
		tokenParams.put("card", cardParams);

		Token.create(tokenParams);
		
	}

}
