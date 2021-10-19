package Model.Enum;

public enum PhongHoc {
	D_302(1), A2_505(2), A2_616(3);
	public final int x;
	private PhongHoc(int x) {
		this.x = x;
	}
	public static PhongHoc getPhongHoc(int x) {
		for(PhongHoc i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
