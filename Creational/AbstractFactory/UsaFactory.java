package AbstractFactory;

public class UsaFactory implements Region{

	UsaFactory() {}
	
	public  PaymentProvider getProvider(String name) {
		switch(name) {
			case "Stripe":
				return new Stripe();
			case "Visa":
				return new Visa();
			default:
				throw new IllegalArgumentException("The payment provider "+name+" is invalid");
		}
	}

	public Tax taxMethodology() {
		return new Vat();
	}
}
