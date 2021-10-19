package Model.Enum;

public enum ViTri {
	CongBaoVe(1), Sanh_D(2), Tang6(3);
	public final int x;
	private ViTri(int x) {
		this.x = x;
	}
	public static ViTri getViTri(int x) {
		for(ViTri i : values()) {
			if(i.x == x) return i;
		}
		return null;
	}
}
