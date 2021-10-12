package Info;

public enum ViTri {
	CongBaoVe("Cổng bảo vệ"), Sanh_D("Sảnh D"), Tang6("Tầng 6");
	private String vt;
	private ViTri(String vt) {
		this.vt = vt;
	}
	public static ViTri getViTri(String vt) {
		for(ViTri i : values()) {
			if(i.vt == vt) {
				return i;
			}
		}
		return null;
	}
}
