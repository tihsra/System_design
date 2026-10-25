package AbstractFactory;

public class Vat implements Tax {
	public double calculate(double amount) {
		return amount * 0.10;
	}
}
