package baitap4;

public class Laptop {
	private String id;
	private String name;
	private RAM ram;
	private CPU cpu;
	private Mainboard mainbroad;
	private Hang hang;
	int soLuong;
	public Laptop(String id, String name,Hang hang, RAM ram, CPU cpu, Mainboard mainbroad, int soLuong) {
		super();
		this.id = id;
		this.name = name;
		this.hang = hang;
		this.ram = ram;
		this.cpu = cpu;
		this.mainbroad = mainbroad;
		this.soLuong = soLuong;
	}
	public Laptop(CPU cpu2, RAM ram2, Mainboard mainboard, Hang hang2, int s4) {
		// TODO Auto-generated constructor stub
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
	public RAM getRam() {
		return ram;
	}
	public CPU getCpu() {
		return cpu;
	}
	public Mainboard getMainbroad() {
		return mainbroad;
	}
	public int getSoLuong() {
		return soLuong;
	}
}
