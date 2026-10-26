package Adapter;

public class Client {
	
	public static void main(String args[]) {

		PaymentProvider provider = new PaymentProvider(new RazorPayAdapter());
		provider.performPayment(1000);
		provider.printStatus();
	
	}
	
}


