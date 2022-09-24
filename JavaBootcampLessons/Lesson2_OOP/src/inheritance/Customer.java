package inheritance;

public class Customer extends Person {
	private int id;
	private String customerNumber;
	private String taxNumber;

	public Customer() {
	}

	public Customer(int id, String customerNumber, String taxNumber) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.taxNumber = taxNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerNumber=" + customerNumber + ", taxNumber=" + taxNumber + ", getId()="
				+ getId() + ", getCustomerNumber()=" + getCustomerNumber() + ", getTaxNumber()=" + getTaxNumber() + "]";
	}

}
