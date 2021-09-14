package Dientich_Chuvi;

import java.util.Arrays;
import java.util.Scanner;

public class Shape {
	protected int socanh;
	protected int a[];
	Scanner sc = new Scanner(System.in);
	public Shape () {
		this.socanh=0;
		this.a=null;
	}
	public Shape (int socanh, int[] a, Scanner sc) {
        this.socanh=socanh;
        this.a=a;
        this.sc=sc;
    }
	public int getSocanh() {
		return socanh;
	}
	public void setSocanh (int socanh) {
		this.socanh=socanh;
	}
	public int[] getA() {
		return a;
	}
	public void setA (int[] a) {
		this.a=a;
	}
	public Scanner getScanner () {
		return sc;
	}
	public void setScanner (Scanner sc) {
		this.sc=sc;
	}
	public void input () {
		do {
			System.out.println("Nhập số cạnh: ");
			this.socanh = sc.nextInt();
		}
		while (socanh <= 2);
		for (int i=0; i<this.socanh; i++) {
			System.out.println("Nhập độ dài cạn thứ " + (i+1) + ": ");
			this.a[i] = sc.nextInt();
		}
	}
	public int chuvi () {
		int chuvi = 0;
		for (int i=0; i<this.socanh; i++) {
			chuvi = chuvi + this.a[i];
		}
		return chuvi;
	}
	public void OutputShape(){
        for (int i = 0; i<this.socanh; i++) {
                System.out.print("\tĐộ dài cạnh thứ " + (i+1) + ":\t " + this.a[i]);
                System.out.println();
        }
    }
}
