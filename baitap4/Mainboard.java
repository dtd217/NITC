package baitap4;

public class Mainboard {
	private String id;
	private String name;
	private Hang hang;
	public int soLuong;
	public Mainboard(String id, Hang hang) {
		this.id = id;
		this.name = name;
		this.hang = hang;
		this.soLuong=soLuong;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Hang getHang() {
		return hang;
	}
	public int getsoLuong() {
		return soLuong;
	}
}
