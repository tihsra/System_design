package Decorator;

public class Peparoni extends PizzaDecorator {
	
	Peparoni(PizzaBase obj) {
		super(obj);
	}

	public int cost() {
		return this.pizza.cost()+40;
	}

	@Override
	public String description() {
		return this.pizza.description()+" added olives";
	}
}
