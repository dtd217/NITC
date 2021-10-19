package View;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Controller.Utils.*;
import Controller.singelton.*;
import Model.Enum.*;
import Model.entity.*;

public class Output {
	static Scanner sc = new Scanner(System.in);
	public static void InThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.print("Chọn số: ");
		int n = sc.nextInt();
		if (n == 1) {
			if(DanhSachGiangVien.getInfo(id) != null) {
				DanhSachGiangVien.addToList(new GiangVien("Thầy G", 30, Gioitinh.Nam, ChucVu.GiangVien));
				DanhSachGiangVien.addToList(new GiangVien("Thầy H", 31, Gioitinh.Nam, ChucVu.GiangVien));
				DanhSachGiangVien.addToList(new GiangVien("Cô I", 32, Gioitinh.Nữ, ChucVu.GiangVien));
				System.out.println("Danh sách giảng viên:");
				List<Person> a2 = DanhSachGiangVien.getInfor();
				for (Person i : a2) {
					System.out.println(i);
				}	
				System.out.println();
			}
			else if(DanhSachNhanVien.getInfo(id) != null) {
				DanhSachNhanVien.addToList(new BaoVe("Bác D", 53, Gioitinh.Nam, ChucVu.BaoVe));
				DanhSachNhanVien.addToList(new BaoVe("Cô E", 49, Gioitinh.Nữ, ChucVu.BaoVe));
				DanhSachNhanVien.addToList(new BaoVe("Chú F ", 30, Gioitinh.Nam, ChucVu.BaoVe));			
				DanhSachNhanVien.addToList(new VeSinh("Bác K", 53, Gioitinh.Nam, ChucVu.VeSinh));
				DanhSachNhanVien.addToList(new VeSinh("Bác L", 49, Gioitinh.Nữ, ChucVu.VeSinh));
				System.out.println("Danh sách nhân viên:");
				List<Person> a1 = DanhSachNhanVien.getInfor();
				for (Person i : a1) {
					System.out.println(i);
				}
				System.out.println();
			}
			else if(DanhSachSinhVien.getInfo(id) != null){
				DanhSachSinhVien.addToList(new SinhVien("Nguyễn Văn A", 18, Gioitinh.Nam, ChucVu.SinhVien, Type.ChinhQuy));
				DanhSachSinhVien.addToList(new SinhVien("Nguyễn Thị B", 19, Gioitinh.Nữ, ChucVu.SinhVien, Type.LienThong));
				DanhSachSinhVien.addToList(new SinhVien("Nguyễn Bảo C", 20, Gioitinh.Khác, ChucVu.SinhVien, Type.TaiChuc));
				System.out.println("Danh sách sinh viên:");
				List<Person> a = DanhSachSinhVien.getInfor();
				for (Person i : a) {
					System.out.println(i);
				}
				System.out.println();
			}
		}
	}
}