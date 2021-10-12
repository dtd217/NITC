package MainProgram;

import java.util.List;
import java.util.Scanner;
import Info.*;
import Lich.*;
import entity.*;
import singelton.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. In thông tin:");
		System.out.println("2. Thêm lịch:");
		System.out.print("Chọn số: ");
		int n = sc.nextInt();
		if (n == 1) {
			DanhSachSinhVien.addToList(new SinhVien("Nguyễn Văn A", 18, Gioitinh.Nam, ChucVu.SinhVien, Type.ChinhQuy));
			DanhSachSinhVien.addToList(new SinhVien("Nguyễn Thị B", 19, Gioitinh.Nữ, ChucVu.SinhVien, Type.LienThong));
			DanhSachSinhVien.addToList(new SinhVien("Nguyễn Bảo C", 20, Gioitinh.Khác, ChucVu.SinhVien, Type.TaiChuc));
			
			DanhSachNhanVien.addToList(new BaoVe("Bác D", 53, Gioitinh.Nam, ChucVu.BaoVe));
			DanhSachNhanVien.addToList(new BaoVe("Cô E", 49, Gioitinh.Nữ, ChucVu.BaoVe));
			DanhSachNhanVien.addToList(new BaoVe("Chú F ", 30, Gioitinh.Nam, ChucVu.BaoVe));			
			DanhSachNhanVien.addToList(new VeSinh("Bác K", 53, Gioitinh.Nam, ChucVu.VeSinh));
			DanhSachNhanVien.addToList(new VeSinh("Bác L", 49, Gioitinh.Nữ, ChucVu.VeSinh));
			
			DanhSachGiangVien.addToList(new GiangVien("Thầy G", 30, Gioitinh.Nam, ChucVu.GiangVien));
			DanhSachGiangVien.addToList(new GiangVien("Thầy H", 31, Gioitinh.Nam, ChucVu.GiangVien));
			DanhSachGiangVien.addToList(new GiangVien("Cô I", 32, Gioitinh.Nữ, ChucVu.GiangVien));
			
			System.out.println("Danh sách sinh viên:");
			List<Person> a = DanhSachSinhVien.getInfor();
			for (Person i : a) {
				System.out.println(i);
			}
			System.out.println();
			System.out.println("Danh sách nhân viên:");
			List<Person> a1 = DanhSachNhanVien.getInfor();
			for (Person i : a1) {
				System.out.println(i);
			}
			System.out.println();
			System.out.println("Danh sách giảng viên:");
			List<Person> a2 = DanhSachGiangVien.getInfor();
			for (Person i : a2) {
				System.out.println(i);
			}
			System.out.println();
		}
		else if (n==2) {
			System.out.println("1. Thêm lịch học:");
			System.out.println("2. Thêm lịch giảng dạy:");
			System.out.println("3. Thêm lịch trực:");
			System.out.print("Chọn số::");
			int m = sc.nextInt();
			if (m == 1) {
				System.out.print("Nhập Id sinh viên: ");
				int id = sc.nextInt();
				System.out.println("Chọn ca học:");
				System.out.println("1. Ca 1");
				System.out.println("2. Ca 2");
				System.out.println("3. Ca 3");
				System.out.println("4. Ca 4");
				System.out.print("Bạn chọn ca: ");
				int q = sc.nextInt();
				if (q == 1) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet1, PhongHoc.D_302));
					List<LichLamViec> b = BangLichHoc.getInstance();
					for (LichLamViec i : b) {
						System.out.println(i);
					}
				}
				else if (q==2) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet3, PhongHoc.A2_616));
					List<LichLamViec> b1 = BangLichHoc.getInstance();
					for (LichLamViec i : b1) {
						System.out.println(i);
					}
				}
				else if (q==3) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet5, PhongHoc.A2_505));
					List<LichLamViec> b2 = BangLichHoc.getInstance();
					for (LichLamViec i : b2) {
						System.out.println(i);
					}
				}
				else if (q==4) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet7, PhongHoc.A2_505));
					List<LichLamViec> b3 = BangLichHoc.getInstance();
					for (LichLamViec i : b3) {
						System.out.println(i);
					}
				}
			}
			else if (m == 2) {
				System.out.print("Nhập Id giảng viên: ");
				int id = sc.nextInt();
				System.out.println("Chọn ca dạy:");
				System.out.println("1. Ca 1");
				System.out.println("2. Ca 2");
				System.out.println("3. Ca 3");
				System.out.println("4. Ca 4");
				System.out.print("Bạn chọn ca: ");
				int q = sc.nextInt();
				if (q == 1) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet1, PhongHoc.D_302));
					List<LichLamViec> b = BangLichHoc.getInstance();
					for (LichLamViec i : b) {
						System.out.println(i);
					}
				}
				else if (q==2) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet3, PhongHoc.A2_616));
					List<LichLamViec> b1 = BangLichHoc.getInstance();
					for (LichLamViec i : b1) {
						System.out.println(i);
					}
				}
				else if (q==3) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet5, PhongHoc.A2_505));
					List<LichLamViec> b2 = BangLichHoc.getInstance();
					for (LichLamViec i : b2) {
						System.out.println(i);
					}
				}
				else if (q==4) {
					BangLichHoc.addToBangLH(new LichHoc(id, Time.Tiet7, PhongHoc.A2_505));
					List<LichLamViec> b3 = BangLichHoc.getInstance();
					for (LichLamViec i : b3) {
						System.out.println(i);
					}
				}
			}
			else {
				System.out.print("Nhập Id nhân viên: ");
				int id = sc.nextInt();
				System.out.println("Chọn ca học:");
				System.out.println("1. Ca 1");
				System.out.println("2. Ca 2");
				System.out.println("3. Ca 3");
				System.out.print("Bạn chọn ca: ");
				int q = sc.nextInt();
				if (q == 1) {
					BangLichHoc.addToBangLH(new LichTruc(id, Time.Tiet1, ViTri.CongBaoVe));
					List<LichLamViec> c = BangLichHoc.getInstance();
					for (LichLamViec i : c) {
						System.out.println(i);
					}
				}
				else if (q==2) {
					BangLichHoc.addToBangLH(new LichTruc(id, Time.Tiet3, ViTri.Sanh_D));
					List<LichLamViec> c1 = BangLichHoc.getInstance();
					for (LichLamViec i : c1) {
						System.out.println(i);
					}
				}
				else if (q==3) {
					BangLichHoc.addToBangLH(new LichTruc(id, Time.Tiet6, ViTri.Tang6));
					List<LichLamViec> c2 = BangLichHoc.getInstance();
					for (LichLamViec i : c2) {
						System.out.println(i);
					}
				}
			}
		}
	}
}
