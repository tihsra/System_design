package AbstractFactory;

public class Gst implements Tax{
	public double calculate(double amount) {
		return amount * 0.18;
	}
}
