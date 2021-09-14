package Dientich_Chuvi;

public class HinhBinhHanh extends Shape{
	public HinhBinhHanh () {
		this.a = new int[2];
		this.socanh = 2;
	}
	public void input () {
		for (int i=0; i<2; i++) {
			System.out.println("Nhập độ dài cạnh thứ " + (i+1) + ": ");
			this.a[i] = sc.nextInt();
		}
		System.out.println("Độ dài chiều cao: ");
		this.a[2]= sc.nextInt();
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
		int A = a[1];
		int B = a[2];
		dientich = B * A;
		return dientich;
	}
	public void display() {
		super.OutputShape();
	}
}
