package QuanLyHoaQua;

import java.util.Scanner;

public class HoaQua {
	protected String name;
	protected int gia, money;
	protected int soluong;
	Scanner sc = new Scanner(System.in);
	public HoaQua(String name, int gia, int soluong) {
		this.name=name;
		this.gia=gia;
		this.soluong=soluong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name=name;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) { 
		this.gia=gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) { 
		this.soluong=soluong;
	}
	public void input() {
		System.out.print("Nhập loại quả: ");
        name = sc.nextLine();
        System.out.print("Nhập giá: ");
        gia = sc.nextInt();
        System.out.print("Nhập số lượng: ");
        soluong = sc.nextInt();
	}
	public void inputPrice() {
		System.out.print("Nhập số tiền bạn đang có: ");
		money = sc.nextInt();
	}
	@Override
	public String toString() {
        return "Loại quả: " + this.name + ", giá: " + this.gia + "đ/quả, số lượng còn lại: " + this.soluong;
    }
	public String toString1() {
		return "Loại quả: " + this.name + ", giá: " + this.gia + "đ/quả, số lượng còn lại: " + this.soluong;
	}
}
