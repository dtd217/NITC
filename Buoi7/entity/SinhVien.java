package entity;

import Info.ChucVu;
import Info.Gioitinh;
import Info.Type;

public class SinhVien extends Person{
	private Type lsv;
	
	public SinhVien (String name, int age, Gioitinh gt, ChucVu cv, Type lsv) {
		super(name, age, gt, cv);
		this.lsv = lsv;
	}
	@Override
	public Gioitinh GioiTinh() {
		return gt;
	}
	@Override
	public ChucVu ChucVu() {
		return cv;
	}
	public Type getType() {
		return lsv;
	}
	@Override
	public String toString() {
		return "Id:" + getId() + "	Tên: " + getName() + "	Tuổi: " + getAge() + "	Giới tính: " + getGioitinh() + "	Chức vụ: " + getChucvu() + "	Loại sinh viên: " + getType();
	}
}
