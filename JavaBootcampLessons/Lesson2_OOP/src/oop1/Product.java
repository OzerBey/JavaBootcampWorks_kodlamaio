package oop1;

public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrls;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", unitPrice=" + unitPrice + ", discount=" + discount + ", imageUrls="
				+ imageUrls + ", unitsInStock=" + unitsInStock + "]";
	}

}
