/*
Interface PaymentGateway
	
	abstract method processPayment(PaymentGateway paymentGateway, double amount)
		-- to process various type of payment

class Payment
	to keep the STORE cash / CARD (bank) balance
		-- receivePayment(PaymentGateway paymentGateway, double amount)
		-- to procss the different payments cash / card / upi
		-- PaymentGateway may be CashPayment, CardPayment or UPIPayment 

class extends Payment and implements PaymentGateway
	  CashPayment - to process the cash payment  
	  CardPayment - to process the card payment  
	  UpiPayment  - to process the upi payment  

*/

interface PaymentGateway{
	public abstract void processPayment(PaymentGateway paymentGateway, double amount);
}

public class  Payment{
	protected static double cashBalance;
	protected static double cardBalance;
	protected static double upiBalance;

	public static double getCashBalance(){
		return cashBalance;
	}
	public static double getCardBalance(){
		return cardBalance;
	}
	public static double getUpiBalance(){
		return upiBalance;
	}

	public static void receivePayment(PaymentGateway paymentGateway, double amount){
		paymentGateway.processPayment(paymentGateway,amount);
	}
}

class CashPayment extends Payment implements PaymentGateway{
	public void processPayment(PaymentGateway paymentGateway, double amount){
		Payment.cashBalance += amount;
	}
}

class CardPayment extends Payment implements PaymentGateway{
	public void processPayment(PaymentGateway paymentGateway, double amount){
		cardBalance += amount;
	}
}

class UpiPayment extends Payment implements PaymentGateway{
	public void processPayment(PaymentGateway paymentGateway, double amount){
		upiBalance += amount;
	}
}



