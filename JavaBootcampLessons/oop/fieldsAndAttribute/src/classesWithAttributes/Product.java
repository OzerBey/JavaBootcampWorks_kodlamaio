package classesWithAttributes;

// attribute & field
public class Product {

	private int id; // primary key
	private String name;
	private String color;
	private String description;
	private double price;
	private int stockAmount;

	public Product() { // constructor without parameters

	}

	public Product(int id, String name, String color, String description, double price, int stockAmount) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	// getter/return operations
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	// setter operations
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
