package example.entity;

public abstract class Fruit {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private static int count = 0;
	public Fruit (String name, double price, int quantity, String vitamin) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public abstract void vitamin();
	public int getVitamin() {
		// TODO Auto-generated method stub
		return 0;
	}
}