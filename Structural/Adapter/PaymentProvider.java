package Adapter;

public class PaymentProvider implements BusinessLogic{
	
	BusinessLogic provider;
	
	PaymentProvider (BusinessLogic obj){
		this.provider = obj;
	}

	public void performPayment(long amount) {
		provider.performPayment(amount);
	}

	public void printStatus() {
		provider.printStatus();
	}
	
}
