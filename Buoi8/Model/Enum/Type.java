package Model.Enum;

public enum Type {
	ChinhQuy(1), LienThong(2), TaiChuc(3);
	public final int x;
	private Type(int x) {
		this.x = x;
	}
	public static Type getType(int x) {
		for(Type i : values()) {
			if(i.x == x) {
				return i;
			}
		}
		return null;
	}
}
