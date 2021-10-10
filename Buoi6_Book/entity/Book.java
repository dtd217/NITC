package entity;

public abstract class Book {
	private int id;
	private String author;
	private int price;
	private int quantity;
	static private int count;
    
    public Book(String author, int price, int quantity){
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.id = ++count;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getId(){
        return id;
    }
    public abstract void loaisach();
}
