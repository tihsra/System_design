package Flyweight;

import java.util.ArrayList;

public class Flyweight {
	
	private ArrayList<Integer> vector;
	private String image;
	private String name;
	
	Flyweight(String image, String name){
		this.image = image;
		this.name = name;
		this.vector = new ArrayList<>();
	}
	
	void addVector(int value) {
		this.vector.add(value);
	}

}
