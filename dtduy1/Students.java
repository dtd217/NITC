package dtduy1;

import java.util.Scanner;

class Students{
    private String name,lop;
    private int age;
    private double T,L,H;
    public Students() {
    	super();
    }
    public Students (String name, String lop, int age, double T, double L, double H){
    	this.name=name;
    	this.age=age;
    	this.lop=lop;
    	this.T=T;
    	this.L=L;
    	this.H=H;
    }
    public void setName(String name){
		this.name=name;
	}
	public String getName(String name){
		return this.name;
	}
	public void setLop(String lop){
		this.lop=lop;
	}
	public String getLop(String lop){
		return this.lop;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(int age){
		return this.age;
	}
	public void setDiemToan(int T){
		this.T=T;
	}
	private double getDiemToan(int T){
		return this.T;
	}
	public void setDiemLy(int L){
		this.L=L;;
	}
	private double getDiemLy(int L){
		return this.L;
	}
	public void setDiemHoa(int H){
		this.H=H;
	}
	private double getAnh(int H){
		return this.H;
	}
	public void getInfo() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Nhập tên học sinh: ");
		name=sc1.next();
		System.out.print("Nhập tuổi học sinh: ");
		age=sc1.nextInt();
		System.out.print("Nhập lớp học sinh: ");
		lop=sc1.next();
		System.out.print("Nhập điểm Toán: ");
		T=sc1.nextDouble();
		System.out.print("Nhập điểm Lý: ");
		L=sc1.nextDouble();
		System.out.print("Nhập điểm Hóa: ");
		H=sc1.nextDouble();
	}
	public double TB() {
		return (T+L+H)/3;
	}
	public void display() {
		System.out.println("Họ và tên: "+name);
		System.out.println("Tuổi: "+age);
		System.out.println("Lớp: "+lop);
		System.out.println("Điểm trung bình: "+ TB());
	}
}