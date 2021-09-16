package QuanLyTruongHoc;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng giáo viên: ");
		int n = sc.nextInt();
		GiaoVien[] gv = new GiaoVien[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhập thông tin giáo viên thứ " + (i+1) + ":");
			gv[i] = new GiaoVien(null, i, null, null);
			gv[i].input();
		}
		System.out.println("Thông tin giáo viên trong trường:----------------------------------------------");
		System.out.println("Số lượng giáo viên: " + n);
		for (int i=0; i<n; i++) {
            System.out.println(gv[i].toString());
        }
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.print("Nhập số lượng học sinh: ");
		int n1 = sc.nextInt();
		HocSinh[] hs = new HocSinh[n1];
		for (int i=0; i<n1; i++) {
			System.out.println("Nhập thông tin học sinh thứ " + (i+1) + ":");
			hs[i] = new HocSinh(null, i, null);
			hs[i].input();
		}
		System.out.println("Thông tin học sinh:------------------------------------------------------------");
		System.out.println("Số lượng học sinh: " + n1);
		for (int i=0; i<n1; i++) {
            System.out.println(hs[i].toString());
        }
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.print("Nhập số lượng nhân viên bảo vệ: ");
		int n2 = sc.nextInt();
		NhanVienBaoVe[] nvbv = new NhanVienBaoVe[n2];
		for (int i=0; i<n2; i++) {
			System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ":");
			nvbv[i] = new NhanVienBaoVe(null, i, null);
			nvbv[i].input();
		}
		System.out.println("Thông tin nhân viên bảo vệ-----------------------------------------------------");
		System.out.println("Số lượng nhân viên bảo vệ: " + n2);
		for (int i=0; i<n2; i++) {
            System.out.println(nvbv[i].toString());
        }
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.print("Nhập số lượng nhân viên vệ sinh: ");
		int n3 = sc.nextInt();
		NhanVienVeSinh[] nvvs = new NhanVienVeSinh[n3];
		for (int i=0; i<n3; i++) {
			System.out.println("Nhập thông tin nhân viên thứ " + (i+1) + ":");
			nvvs[i] = new NhanVienVeSinh(null, i, null);
			nvvs[i].input();
		}
		System.out.println("Thông tin nhân viên vệ sinh:------------------------------------------------------------");
		System.out.println("Số lượng nhân viên vệ sinh: " + n3);
		for (int i=0; i<n3; i++) {
            System.out.println(nvvs[i].toString());
        }
		System.out.println("-------------------------------------------------------------------------------");
	}
}
