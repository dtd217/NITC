package Info;

public enum ChucVu {
	BaoVe("bảo vệ"), SinhVien("sinh viên"), GiangVien("giảng viên"), VeSinh("vệ sinh");
	private String cv;
	private ChucVu(String cv) {
		this.cv = cv;
	}
	public static ChucVu getChucVu(String cv) {
		for(ChucVu i : values()) {
			if(i.cv == cv) {
				return i;
			}
		}
		return null;
	}
}
