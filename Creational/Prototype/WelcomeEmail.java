package Prototype;

public class WelcomeEmail implements EmailTemplate {
	
	private String greeting;
	private String userName;
	private String serviceName;
	
	public WelcomeEmail() {}
	
	private WelcomeEmail(WelcomeEmail prototype) {
		this.greeting = prototype.greeting;
		this.userName = prototype.userName;
		this.serviceName = prototype.serviceName;
	}
	
	public WelcomeEmail copy() {
		return new WelcomeEmail(this);
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public void send() {
		System.out.println(greeting + " " + userName + ", welcome to " + serviceName);
	}
	
	
}
