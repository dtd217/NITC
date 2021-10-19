package Model.Lich;

import Model.Enum.*;


public class LichTruc extends LichLamViec{
	ViTri vt;
	public LichTruc(int id, Time time, ViTri vt) {
		super(id, time);
		this.vt = vt;
	}
	public ViTri getVitri() {
		return vt;
	}
	public void setVitri(ViTri vt) {
		this.vt = vt;
	}
	@Override
	public String toString() {
		return "Id: " + getId() +"	Thời gian: "+ getTime() + " 	Vị trí: "+ getVitri(); 
	}
}
