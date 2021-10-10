package entity;

public class KhoaHoc extends Book{
	private int namXB;
	public KhoaHoc(String author, int price, int quantity, int namXB){
        super(author, price, quantity);
        this.namXB = namXB;
    }
    public int getNamXB(){
        return namXB;
    }
    public void setNamXB(int namXB){
        this.namXB = namXB;
    }
    public void loaisach() {
		System.out.println("Sach Khoa Hoc");
	}
}
