package QuanLyHoaQua;

import java.util.Scanner;

public class Tao extends HoaQua {
	private double GI;
	Scanner sc = new Scanner(System.in);
	public Tao (String name, int gia, int soluong, double GI) {
		super (name, gia, soluong);
		this.GI=GI;
	}
	public void input() {
		super.input();
		System.out.print("Nhập chỉ số đường huyết trong táo:");
		GI = sc.nextDouble();
	}
	public double getGI () {
		return GI;
	}
	public void setGI(double GI) {
		this.GI=GI;
	}
	public void inputPrice() {
		super.input();
		System.out.print("Nhập chỉ số đường huyết trong táo:");
		GI = sc.nextDouble();
		super.inputPrice();
	}
	public int mua() {
		int n=0;
		for (int i=1; i<=100; i++) {
			if (i * super.getGia() <= money) {
				n=i;
			}
			else break;
		}
		return n;
	}
	@Override
	public String toString() {
		return super.toString() + ", chỉ số đường huyết: " + this.GI;
    }
	public String toString1() {
		return super.toString() + ", chỉ số đường huyết: " + this.GI + ", Số quả táo mà bạn có thể mua nhiều nhất là: " + mua();
    }
}
