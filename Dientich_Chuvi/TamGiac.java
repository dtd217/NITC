package Dientich_Chuvi;

public class TamGiac extends Shape {
	public TamGiac () {
		this.a = new int[3];
		this.socanh = 3;
	}
	public void input () {
		for (int i=0; i<3; i++) {
			System.out.println("Nhập độ dài cạnh thứ " + (i+1) + ": ");
			this.a[i] = sc.nextInt();
		}
	}
	public int chuvi () {
		int chuvi = 0;
		for (int i = 0; i<3; i++) {
            chuvi += this.a[i];
        }
        return chuvi;
	}
	public double dientich () {
		double dientich = 0;
		int A = a[0];
		int B = a[1];
		int C = a[2];
		double P = (A+B+C)/2;
		dientich = Math.sqrt(P * (P-A) * (P-B) * (P-C));
		return dientich;
	}
	public void display() {
		super.OutputShape();
	}
}
