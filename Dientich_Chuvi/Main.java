package Dientich_Chuvi;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Thoát");
	        System.out.println("1. In ra diện tích, chu vi tam giác");
	        System.out.println("2. In ra diện tích, chu vi hình vuông");
	        System.out.println("3. In ra diện tích, chu vi hình chữ nhật");
	        System.out.println("4. In ra diện tích, chu vi hình bình hành");
	        System.out.print("Chọn 1 số: ");
	        x = sc.nextInt();
	        switch (x){
	        	case 1:
	        		TamGiac tg = new TamGiac();
	        		tg.input();
	        		System.out.println("Tam giác có: ");
	        		tg.OutputShape();
	        		System.out.println("\tDiện tích:\t\t " + tg.dientich());
	        		System.out.println("\tChuvi:\t\t\t " + tg.chuvi());
	        		break;
	        	case 2:
	        		HinhVuong hv = new HinhVuong();
	        		hv.input();
	        		System.out.println("Hình vuông có: ");
	        		hv.OutputShape();
	        		System.out.println("\tDiện tích:\t\t " + hv.dientich());
	        		System.out.println("\tChuvi:\t\t\t " + hv.chuvi());
	        		break;
	        	case 3:
	        		HinhChuNhat hcn = new HinhChuNhat();
	        		hcn.input();
	        		System.out.println("Hình chữ nhật có: ");
	        		hcn.OutputShape();
	        		System.out.println("\tDiện tích:\t\t " + hcn.dientich());
	        		System.out.println("\tChuvi:\t\t\t " + hcn.chuvi());
	        		break;
	        	case 4:
	        		HinhBinhHanh hbh = new HinhBinhHanh();
	        		hbh.input();
	        		System.out.println("Hình bình hành có: ");
	        		hbh.OutputShape();
	        		System.out.println("\tDiện tích:\t\t " + hbh.dientich());
	        		System.out.println("\tChuvi:\t\t\t " + hbh.chuvi());
	        		break;
	        }
		}
	    while (x != 0);
	}
}

