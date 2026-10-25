package Prototype;

import java.util.HashMap;

public class Registery {
	
	private static HashMap<String, EmailTemplate> registery = new HashMap<>();
	
	static {
		
		registery.put("WelcomeEmail",new WelcomeEmail());
		registery.put("SubjectiveEmail",new SubjectiveEmail());
		
	}
	
	public static EmailTemplate getCopy(String name){
		switch(name) {
			case "WelcomeEmail":
				return registery.get(name).copy();
			case "SubjectiveEmail":
				return registery.get(name).copy();
			default:
				throw new IllegalArgumentException("No prototype registered for: " + name);
		}
	}
	
	
}
