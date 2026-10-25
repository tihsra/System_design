package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		
		Region region = RegionFactory.getRegion("India");
		
		PaymentProvider provider = region.getProvider("Upi");
		
		provider.information();
		provider.processPayment(10000000);
		

	}

}

//Abstract Factory pattern: provides an interface for creating a family of
//related objects without specifying their concrete classes.
//Use it when several objects must be compatible with each other (e.g. a
//MongoDb connection must be paired with a MongoDb query).