package Decorator;

public abstract class PizzaDecorator implements PizzaBase{
	
	protected PizzaBase pizza;
	
	PizzaDecorator(PizzaBase obj){
		this.pizza = obj;
	}
	
	
}
