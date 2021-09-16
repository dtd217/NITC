package QuanLyTruongHoc;

import java.util.Scanner;

public class GiaoVien extends Chung {
	protected String name;
	protected int age;
	protected String cccd;
	private String monhoc;
	Scanner sc = new Scanner(System.in);
	public GiaoVien (String name, int age, String cccd, String monhoc) {
		super (name, age, cccd);
		this.monhoc=monhoc;
	}
	public String getMonhoc() {
		return monhoc;
	}
	public void setMonhoc(String monhoc) {
		this.monhoc=monhoc;
	}
	public void input() {
		super.input();
        System.out.print("Nhập môn học thầy(cô) đang dạy: ");
        monhoc = sc.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() +  ", giáo viên môn: " + this.monhoc;
    }
}
