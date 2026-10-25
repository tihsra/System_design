package AbstractFactory;

public class Upi implements PaymentProvider{

	public void information() {
		System.out.println("This is UPI payment method");
		
	}

	public void processPayment(long amount) {
		System.out.println("UPI payment method is processing payment of ammount "+amount);
		
	}

}
