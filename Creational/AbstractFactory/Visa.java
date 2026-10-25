package AbstractFactory;

public class Visa implements PaymentProvider {
	
	public void information() {
		System.out.println("This is Visa payment method");
		
	}

	public void processPayment(long amount) {
		System.out.println("Visa payment method is processing payment of ammount "+amount);
	}

}
