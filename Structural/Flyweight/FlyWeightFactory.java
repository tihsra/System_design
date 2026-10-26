package Flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
	
	private static HashMap<String,Flyweight> flyweight = new HashMap<>();
	
	static {
		Flyweight tree = new Flyweight("TreeImage","Tree");
		tree.addVector(0);
		tree.addVector(1);
		tree.addVector(2);
		
		flyweight.put("Tree", tree);
		
		Flyweight bush = new Flyweight("BushImage","Bush");
		bush.addVector(0);
		bush.addVector(1);
		bush.addVector(0);
		
		flyweight.put("Bush", bush);
		
	}
	
	static Flyweight  getInstance(String name) {
		switch(name) {
			case "Bush":
				return flyweight.get(name);
			case "Tree":
				return flyweight.get(name);
			default:
				throw new IllegalArgumentException("No flyweight found for the give name: "+name);
		}
	}

}
