package Builder;

public class Client {

	public static void main(String[] args) {
		
		Transaction builder = Transaction.getBuilder()
							  .setBankId("RFP95G")
							  .setBankName("Sbi")
							  .setCustomerId("THYP012")
							  .setCustomerName("Arshit Sharma")
							  .build();
		
		System.out.println(builder.getBankName());
		System.out.println(builder.getBankId());
	}

}


// In builder pattern is required when we have to create an object which is having a lot of attribute
// It may happen that client doesn't want to add all the attributes at a time,
// we cannot solve this problem via creation via constructor {think about the reason}
// Also client would need to know about attribute order etc in case of constructor creation
// we want to hide the class complexity from client.