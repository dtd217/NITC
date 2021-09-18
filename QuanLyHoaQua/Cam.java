package QuanLyHoaQua;

public class Cam extends HoaQua{
	private double weight;
	public Cam (String name, int gia, int soluong, double weight) {
		super (name, gia, soluong);
		this.weight=weight;
	}
	public void input() {
		super.input();
		System.out.print("Nhập cân nặng của cam:");
		weight = sc.nextDouble();
	}
	public double getWeight () {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public void inputPrice() {
		super.input();
		System.out.print("Nhập cân nặng của cam:");
		weight = sc.nextDouble();
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
		return super.toString() + ", cân nặng: " + this.weight;
    }
	public String toString1() {
		return super.toString() + ", cân nặng: " + this.weight + ", Số quả cam mà bạn có thể mua nhiều nhất là: " + mua();
    }
}
