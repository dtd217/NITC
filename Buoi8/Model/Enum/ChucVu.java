package Model.Enum;

public enum ChucVu {
	BaoVe(1), SinhVien(2), VeSinh(3), GiangVien(4);
	public final int x;
	private ChucVu(int x) {
		this.x = x;
	}
	public static ChucVu getChucVu(int x) {
		for(ChucVu i : values()) {
			if(i.x == x) {
				return i;
			}
		}
		return null;
	}
}
