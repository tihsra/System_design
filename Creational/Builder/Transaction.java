package Builder;

public class Transaction {
	
	private int UUID;
	private String transactionId;
	private String metaData;
	private long transactionAmount;
	private String bankName;
	private String bankId;
	private String customerName;
	private String customerId;
	private String securityMethod;
	
	public int getUUID() {
		return UUID;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getMetaData() {
		return metaData;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public String getBankName() {
		return bankName;
	}

	public String getBankId() {
		return bankId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getSecurityMethod() {
		return securityMethod;
	}

	private Transaction() {}

	public static Builder getBuilder() {
		return new Builder();
	}
	
	public static class Builder{
		
		private int UUID;
		private String transactionId;
		private String metaData;
		private long transactionAmount;
		private String bankName;
		private String bankId;
		private String customerName;
		private String customerId;
		private String securityMethod;
		
		public Builder setUUID(int uUID) {
			UUID = uUID;
			return this;
		}
		public Builder setTransactionId(String transactionId) {
			this.transactionId = transactionId;
			return this;
		}
		public Builder setMetaData(String metaData) {
			this.metaData = metaData;
			return this;
		}
		public Builder setTransactionAmount(long transactionAmount) {
			this.transactionAmount = transactionAmount;
			return this;
		}
		public Builder setBankName(String bankName) {
			this.bankName = bankName;
			return this;
		}
		public Builder setBankId(String bankId) {
			this.bankId = bankId;
			return this;
		}
		public Builder setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}
		public Builder setCustomerId(String customerId) {
			this.customerId = customerId;
			return this;
		}
		public Builder setSecurityMethod(String securityMethod) {
			this.securityMethod = securityMethod;
			return this;
		}
		
		public Transaction build() {
			Transaction current = new Transaction();
			current.UUID = this.UUID;
			current.transactionId = this.transactionId;
			current.metaData = this.metaData;
			current.transactionAmount = this.transactionAmount;
			current.bankName = this.bankName;
			current.bankId = this.bankId;
			current.customerName = this.customerName;
			current.customerId = this.customerId;
			current.securityMethod = this.securityMethod;
			
			return current;
			
		}
			
	}
	
}


// usually for final field but the solution is like this only

// other solution is using a hashmap but we would have to use a string to object mapping
// since key could be any type therefore filling the hashmap is client based which may have 
// a mistake
