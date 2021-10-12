package Info;

public enum Gioitinh {
	Nam("Nam"), Nữ("Nữ"), Khác("Khác");
	public String gt;
	private Gioitinh(String gt) {
		this.gt = gt;
	}
	public static Gioitinh getGT(String gt) {
		for(Gioitinh i : values()) {
			if(i.gt == gt) {
				return i;
			}
		}
		return null;
	}
}
