package Model.entity;

import Model.Enum.ChucVu;
import Model.Enum.Gioitinh;

public class VeSinh extends Person{
	public VeSinh (String name, int age, Gioitinh gt, ChucVu cv) {
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
