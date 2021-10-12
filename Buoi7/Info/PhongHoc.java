package Info;

public enum PhongHoc {
	D_302("P1"), A2_505("P2"), A2_616("P3");
	private String ph;
	PhongHoc(String ph) {
		this.ph = ph;
	}
	public static PhongHoc getPhonghoc(String ph) {
		for(PhongHoc i : values()) {
			if(i.ph == ph) {
				return i;
			}
		}
		return null;
	}
}
