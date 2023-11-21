package scratch.projectchapter10;

public class Customer extends Person {
	private String customerNumber;
	private boolean receiveMail;

	public Customer(String n, String a, String num, String customerNumber, boolean receiveMail) {
		super(n, a, num);
		this.customerNumber = customerNumber;
		this.receiveMail = receiveMail;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public boolean isReceiveMail() {
		return receiveMail;
	}

	public void setReceiveMail(boolean receiveMail) {
		this.receiveMail = receiveMail;
	}
}