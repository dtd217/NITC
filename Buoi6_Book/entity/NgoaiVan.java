package entity;


public class NgoaiVan extends Book{
	private String maISBN;
	public NgoaiVan(String author, int price, int quantity, String maISBN){
        super(author, price, quantity);
        this.maISBN = maISBN;
    }
    public String getMaISBN(){
        return maISBN;
    }
    public void setMaISBN(String maISBN){
        this.maISBN = maISBN;
    }
    public void loaisach() {
		System.out.println("Sach Ngoai Van");
	}
}
