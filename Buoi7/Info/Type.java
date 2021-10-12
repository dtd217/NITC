package Info;

public enum Type {
	ChinhQuy("chính quy"), LienThong("liên thông"), TaiChuc("tại chức");
	private String type;
	private Type(String type) {
		this.type = type;
	}
	public static Type getType(String type) {
		for(Type i : values()) {
			if(i.type == type) {
				return i;
			}
		}
		return null;
	}
}
