package Lich;

import Info.*;

public class LichGiangDay extends LichLamViec{
	PhongHoc ph;
	public LichGiangDay(int id, Time time, PhongHoc ph) {
		super(id, time);
		this.ph = ph;
	}
	public PhongHoc getPhonghoc() {
		return ph;
	}
	public void setPhonghoc(PhongHoc ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Id: " +getId() +"	Thời gian: " + getTime() + "	Phòng: " + getPhonghoc();
	}
}
