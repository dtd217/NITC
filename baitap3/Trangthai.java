package baitap3;

public class Trangthai {
	private String name;
	private Soluong soluong;
    public Trangthai (String name, Soluong soluong) {
        this.name = name;
        this.soluong=soluong;
    }
    public String getName() {
        return name;
    }
    public Soluong getSoluong() {
    	return soluong;
    }
}
