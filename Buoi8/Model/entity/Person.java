package Model.entity;

import Model.Enum.ChucVu;
import Model.Enum.Gioitinh;

public abstract class Person {
	private int id;
	private String name;
	private int age;
	Gioitinh gt;
	ChucVu cv;
	static private int count;
	public Person (String name, int age, Gioitinh gt, ChucVu cv) {
		this.name = name;
        this.age = age;
        this.gt = gt;
        this.cv = cv;
        this.id = ++count;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gioitinh getGioitinh() {
		return gt;
	}
	public ChucVu getChucvu() {
		return cv;
	}
	abstract public Gioitinh GioiTinh();
	abstract public ChucVu ChucVu();
}
