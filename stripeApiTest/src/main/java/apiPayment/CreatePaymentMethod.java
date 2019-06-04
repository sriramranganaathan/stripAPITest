package apiPayment;

import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentMethod;

public class CreatePaymentMethod {
	
	public static void main(String[] args) throws StripeException{
		
		System.setProperty("https.proxyHost", "");
		System.setProperty("https.proxyPort", "");
		
		Stripe.apiKey = "";

		Map<String, Object> paymentmethodParams = new HashMap<String, Object>();
		paymentmethodParams.put("type", "card");
		Map<String, Object> cardParams = new HashMap<String, Object>();
		cardParams.put("number", "4242424242424242");
		cardParams.put("exp_month", 6);
		cardParams.put("exp_year", 2022);
		cardParams.put("cvc", "691");
		paymentmethodParams.put("card", cardParams);

		PaymentMethod paymentmethod = PaymentMethod.create(paymentmethodParams);
		System.out.println(paymentmethod.getId());
		
		System.out.println(PaymentMethod.retrieve(paymentmethod.getId()));
	}

}
