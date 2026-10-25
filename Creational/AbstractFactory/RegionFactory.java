package AbstractFactory;

public class RegionFactory {
	
	private RegionFactory() {};
	
	public static Region getRegion(String name) {
		switch(name) {
			case "India":
				return new IndiaFactory();
			case "Usa":
				return new UsaFactory();
			default:
				throw new IllegalArgumentException("The region "+name+" is not servicable");
		}
	}

}
