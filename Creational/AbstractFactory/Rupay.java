package AbstractFactory;

public class Rupay implements PaymentProvider{

	public void information() {
		System.out.println("This is Rupay payment method");
		
	}

	
	public void processPayment(long amount) {
		System.out.println("Rupay payment method is processing payment of ammount "+amount);
		
	}

}
