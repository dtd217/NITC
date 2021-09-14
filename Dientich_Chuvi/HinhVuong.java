package Dientich_Chuvi;

public class HinhVuong extends Shape{
	public HinhVuong () {
		this.a = new int[2];
		this.socanh = 2;
	}
	public void input () {
		for (int i=0; i<2; i++) {
			System.out.println("Nhập độ dài cạnh thứ " + (i+1) + ": ");
			this.a[i] = sc.nextInt();
		}
	}
	public int chuvi () {
		int chuvi = 0;
		for (int i = 0; i<2; i++) {
            chuvi += this.a[i];
        }
        return 2*chuvi;
	}
	public double dientich () {
		double dientich = 0;
		int A = a[0];
		int B = a[1];
		dientich = A * B;
		return dientich;
	}
	public void display() {
		super.OutputShape();
	}
}
