package baitap3;

public class Sach {
	Soluong soluong;
	Trangthai tt;
	Tacgia tacgia;
	Tensach ts;
	public Sach(Tacgia tacgia, Tensach ts, Soluong soluong, Trangthai tt) {
		super();
		this.tacgia=tacgia;
		this.soluong=soluong;
		this.tt=tt;
		this.ts=ts;
	}
	public Tacgia getTacgia(){
		return tacgia;
	}
	public Trangthai getTT(){
		return tt;
	}
	public Soluong getSoluong(){
		return soluong;
	}
	public Tensach getTS() {
		return ts;
	}
}
