package Adapter;

public class RazorPayBuisnessLogic {
	
	void pay(long amount) {
		System.out.println("RazorPay performing payment for amount "+amount);
	}
	
	void print() {
		System.out.println("RazorPay fetching status");
		System.out.println("RazorPay printing status");
	}

}
