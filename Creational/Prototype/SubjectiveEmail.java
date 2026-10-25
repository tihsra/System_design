package Prototype;

public class SubjectiveEmail implements EmailTemplate{
	
	private String greeting;
	private String userName;
	private String serviceName;
	private String verboseSubject;
	
	public SubjectiveEmail() {}
	
	private SubjectiveEmail(SubjectiveEmail prototype) {
		this.greeting = prototype.greeting;
		this.userName = prototype.userName;
		this.serviceName = prototype.serviceName;
		this.verboseSubject = prototype.verboseSubject;
		
	}
	
	public SubjectiveEmail copy() {
		return new SubjectiveEmail(this);
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
	
	public void setVerboseSubject(String verboseSubject) {
		this.verboseSubject = verboseSubject;
	}
	
	public void send() {
		System.out.println(greeting + " " + userName + ", welcome to " + serviceName+" " + verboseSubject);
	}
	
	

}
