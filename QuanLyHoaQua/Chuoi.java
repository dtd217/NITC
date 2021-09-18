package QuanLyHoaQua;

public class Chuoi extends HoaQua{
	private double kali40weight;
	public Chuoi (String name, int gia, int soluong, double kali40weight) {
		super (name, gia, soluong);
		this.kali40weight=kali40weight;
	}
	public void input() {
		super.input();
		System.out.print("Nhập khối lượng đồng vị Kali-40 trong chuối:");
		kali40weight = sc.nextDouble();
	}
	public double getKali40weight () {
		return kali40weight;
	}
	public void setKali40weight(double kali40weight) {
		this.kali40weight=kali40weight;
	}
	public void inputPrice() {
		super.input();
		System.out.print("Nhập khối lượng đồng vị Kali-40 trong chuối:");
		kali40weight = sc.nextDouble();
		super.inputPrice();
	}
	public int mua() {
		int n=0;
		for (int i=1; i<=100; i++) {
			if (i * super.getGia() <= money) {
				n=i;
			}
			else break;
		}
		return n;
	}
	@Override
	public String toString() {
		return super.toString() + ", khối lượng đồng vị Kali-40: " + this.kali40weight;
    }
	public String toString1() {
		return super.toString() + ", khối lượng đồng vị Kali-40: " + this.kali40weight + ", Số quả chuối mà bạn có thể mua nhiều nhất là: " + mua();
    }
}
