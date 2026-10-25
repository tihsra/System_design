package Prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailTemplate newWelcome = Registery.getCopy("WelcomeEmail");
		newWelcome.setGreeting("Hola");
	}

}
