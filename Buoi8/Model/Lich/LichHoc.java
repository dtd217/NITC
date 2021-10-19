package Model.Lich;

import Model.Enum.*;

public class LichHoc extends LichLamViec{
	PhongHoc ph;
	public LichHoc(int id, Time time, PhongHoc ph) {
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
