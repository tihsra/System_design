package Decorator;

public class Client {

	public static void main(String[] args) {
		
		PizzaBase pizza = new Olives(new Peparoni(new MargeritaPizza()));
		
		System.out.println(pizza.description());
		System.out.println(pizza.cost());
		

	}

}


// useful when there is a base class which has to be there
// Add ons are optional and are placed onto the base