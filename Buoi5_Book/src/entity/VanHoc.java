package entity;

public class VanHoc extends Book{
	private int lanTB;
    public VanHoc(String name, String author, int price, int quantity, int lanTB){
        super(name, author, price, quantity);
        this.lanTB = lanTB;
    }
    public int getLanTB(){
        return lanTB;
    }
    public void setLanTB(int lanTB){
        this.lanTB = lanTB;
    }
    
}