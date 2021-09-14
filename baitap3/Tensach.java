package baitap3;

public class Tensach {
	private String name;
	private Tacgia tacgia;
    public Tensach (String name, Tacgia tacgia) {
        this.name = name;
        this.tacgia=tacgia;
    }
    public String getName() {
        return name;
    }
    public Tacgia getTacgia() {
        return tacgia;
    }
}
