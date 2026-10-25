package AbstractFactory;

public class IndiaFactory implements Region {
	
	IndiaFactory() {}
	
	public PaymentProvider getProvider(String name) {
		switch(name) {
			case "Rupay":
				return new Rupay();
			case "Upi":
				return new Upi();
			default:
				throw new IllegalArgumentException("The payment provider "+name+" is invalid");
		}
	}

	public Tax taxMethodology() {
		return new Gst();
		
	}

}
