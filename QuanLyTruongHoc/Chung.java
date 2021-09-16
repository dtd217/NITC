package QuanLyTruongHoc;

import java.util.Scanner;

public class Chung {
	protected String name;
	protected int age;
	protected String cccd;
	Scanner sc = new Scanner(System.in);
	public Chung (String name, int age, String cccd) {
		this.name=name;
		this.age=age;
		this.cccd=cccd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd=cccd;
	}
	public void input() {
		System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.print("Nhập số CCCD: ");
        cccd = sc.next();
	}
	@Override
	public String toString() {
        return "Họ và tên: " + this.name + ", tuổi: " + this.age + ", số cccd: " + this.cccd;
    }
}
