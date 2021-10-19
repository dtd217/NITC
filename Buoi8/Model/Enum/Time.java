package Model.Enum;

public enum Time {
	Tiet1(1), Tiet3(2), Tiet5(3), Tiet7(4);
	public final int x;
	private Time (int x) {
		this.x = x;
	}
	public static Time getTime(int x) {
		for(Time i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
