package Lich;

import Info.Time;

public abstract class LichLamViec {
	private int id;
	Time time;
	public LichLamViec(int ID, Time time) {
		this.id = id;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int iD) {
		id = iD;
	}
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}