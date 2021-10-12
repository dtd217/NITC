package entity;

import Info.ChucVu;
import Info.Gioitinh;

public class BaoVe extends Person{
	private Gioitinh gt;
	private ChucVu cv;
	
	public BaoVe (String name, int age, Gioitinh gt, ChucVu cv) {
		super(name, age, gt, cv);
	}
	@Override
	public Gioitinh GioiTinh() {
		return gt;
	}
	@Override
	public ChucVu ChucVu() {
		return cv;
	}
	@Override
	public String toString() {
		return "Id:" + getId() + "	Tên: " + getName() + "	Tuổi: " + getAge() + "	Giới tính: " + getGioitinh() + "	Chức vụ: " + getChucvu();
	}
}
