package apiPayment;

import com.stripe.exception.StripeException;
import com.stripe.model.Balance;

public class StripeBalance {
	
	public Balance getBalance() throws StripeException{
		Balance balance = Balance.retrieve();
		return balance;
	}

}
