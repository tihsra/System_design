package Adapter;

public class RazorPayAdapter implements BusinessLogic{
	
	private RazorPayBuisnessLogic obj;
	
	RazorPayAdapter(){
		this.obj = new RazorPayBuisnessLogic();
	}
	
	public void performPayment(long amount) {
		this.obj.pay(amount);
	}

	public void printStatus() {
		this.obj.print();
	}

}


