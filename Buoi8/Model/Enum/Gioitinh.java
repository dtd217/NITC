package Model.Enum;

public enum Gioitinh {
	Nam(1), Nữ(0), Khác(2);
	public int x;
	private Gioitinh(int x) {
		this.x = x;
	}
	public static Gioitinh getGT(int gt) {
		for(Gioitinh i : values()) {
			if(i.x == gt) return i;
		}
		return null;
	}
}
