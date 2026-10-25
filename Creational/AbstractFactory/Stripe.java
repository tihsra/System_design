package AbstractFactory;

public class Stripe implements PaymentProvider {

	public void information() {
		System.out.println("This is Stripe payment method");
		
	}

	public void processPayment(long amount) {
		System.out.println("Stripe payment method is processing payment of ammount "+amount);
		
	}

}
