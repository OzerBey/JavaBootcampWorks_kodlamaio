package oop1;

public class Customer {

	private int id;
	private String customerNumber;
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerNumber=" + customerNumber + ", phone=" + phone + ", getId()=" + getId()
				+ ", getCustomerNumber()=" + getCustomerNumber() + ", getPhone()=" + getPhone() + "]";
	}

}
