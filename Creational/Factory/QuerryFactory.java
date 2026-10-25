package Factory;

public class QuerryFactory {
	private QuerryFactory() {}
	
	public static Factory create(String type) {
		switch(type) {
			case "MongoDb":
				return new MongoDb();
			case "Postgres":
				return new Postgres();
			default:
				throw new IllegalArgumentException("No such argument of type "+type);
		}
	}
}
