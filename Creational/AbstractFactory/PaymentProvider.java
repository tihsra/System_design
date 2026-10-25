package AbstractFactory;

public interface PaymentProvider {
	void information();
	void processPayment(long amount);
}
