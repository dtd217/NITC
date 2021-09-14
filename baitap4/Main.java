package baitap4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hãng: ");
		int q = sc.nextInt();
		ArrayList<Hang> lst_Hang = new ArrayList<Hang>();
		for (int i1=1; i1<=q; i1++) {
			System.out.println("Mời bạn nhập hãng laptop thứ " + i1);
			String s1 = sc.next();
			Hang hang = new Hang(s1);
			lst_Hang.add(hang);
		}
		ArrayList<CPU> lst_CPU = new ArrayList<CPU>();
		System.out.println("Nhập số lượng CPU: ");
		int p = sc.nextInt();
		for (int i2=1; i2<=p; i2++) {
			System.out.println("Nhập tên CPU thứ " + i2);
			String s2 = sc.next();
			CPU cpu = new CPU(s2, lst_Hang.get(i2));
			lst_CPU.add(cpu);
		}
		ArrayList<RAM> lst_Ram = new ArrayList<RAM>();
		System.out.println("Nhập số lượng RAM: ");
		int e = sc.nextInt();
		for (int i3=1; i3<=e; i3++) {
			System.out.println("Nhập tên RAM thứ " + i3);
			String s2 = sc.next();
			RAM ram = new RAM(s2, lst_Hang.get(i3));
			lst_Ram.add(ram);
		}
		ArrayList<Mainboard> lst_Mainboard = new ArrayList<Mainboard>();
		System.out.println("Nhập số lượng Mainboard: ");
		int r = sc.nextInt();
		for (int i4=1; i4<r; i4++) {
			System.out.println("Nhập tên Mainboard thứ " + i4);
			String s3 = sc.next();
			Mainboard mainboard = new Mainboard(s3, lst_Hang.get(i4));
			lst_Mainboard.add(mainboard);
		}
		ArrayList<Laptop> lst_lapTop = new ArrayList<Laptop>();
		System.out.println("Mời bạn nhập số lượng laptop: ");
		int t = sc.nextInt();
		for (int i5=1; i5<=t; i5++) {
			System.out.println("Nhập số lượng của laptop thứ " + i5 + " còn trong kho: ");
			int s4 = sc.nextInt();
			Laptop laptop = new Laptop(lst_CPU.get(i5), lst_Ram.get(i5), lst_Mainboard.get(i5), lst_Hang.get(i5), s4);
			lst_lapTop.add(laptop);
		}
		for (int i6=1; i6<=t; i6++) {
			System.out.println("Thôn tin về laptop thứ " + i6);
			System.out.printf("%s %s %s %s %d \n", lst_lapTop.get(i6).getHang().getName(),
				lst_lapTop.get(i6).getCpu().getName(), lst_lapTop.get(i6).getRam().getName(),
				lst_lapTop.get(i6).getMainbroad().getName(), lst_lapTop.get(i6).getSoLuong());
		}
	}
}