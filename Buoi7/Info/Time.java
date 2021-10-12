package Info;

public enum Time {
	Tiet1("6h45 - 8h00"),
	Tiet2("8h10 - 9h25"),
	Tiet3("9h35 - 10h50"),
	Tiet4("11h00 - 12h15"),
	Tiet5("13h00 - 14h15"),
	Tiet6("14h25 - 15h40"),
	Tiet7("15h50 - 17h05"),
	Tiet8("17h15 - 18h30");
	public final String tg;
	private Time (String tg) {
		this.tg = tg;
	}
	public static Time getTime(String tg) {
		for(Time i : values()) {
			if(i.tg == tg) {
				return i;
			}
		}
		return null;
	}
}
