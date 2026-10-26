package Decorator;

public class Olives extends PizzaDecorator{

	Olives(PizzaBase obj) {
		super(obj);
	}

	public int cost() {
		return this.pizza.cost()+20;
	}

	@Override
	public String description() {
		return this.pizza.description()+" added olives";
	}
	
}
