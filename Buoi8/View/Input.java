package View;

import java.util.Scanner;
import Controller.Utils.ScannerUtils;
import Model.Enum.*;
import Model.entity.*;
import Model.Lich.*;
import Controller.singelton.*;

public class Input {
	static Scanner sc = new Scanner(System.in);
	static public void NhapThongTin() {
		System.out.println("Nhap ID: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap ho ten: ");
		String ten = ScannerUtils.readString(sc);
		System.out.println("Nhap tuoi: ");
		int tuoi = ScannerUtils.readInt(sc, 18, 100);
		System.out.println("Nhap gioi tinh: ");
		int gt = ScannerUtils.readInt(sc, 0, 2);
		Gioitinh gioiTinh = Gioitinh.getGT(gt); 
		System.out.println("Nhap chuc vu: ");
		int cv = ScannerUtils.readInt(sc, 1, 4);
		ChucVu chucVu = ChucVu.getChucVu(cv);
		
		if(chucVu == ChucVu.GiangVien) {
			if(DanhSachGiangVien.isValid(id) == false) {
				DanhSachGiangVien.addToList(new GiangVien(ten, tuoi, gioiTinh, chucVu));
			}
		}
		else if(chucVu == ChucVu.SinhVien) {
			System.out.println("Nhap loai sinh vien: ");
			int lsv = ScannerUtils.readInt(sc, 1, 3);
			Type loaiSinhVien = Type.getType(lsv);
			if(DanhSachSinhVien.isValid(id) == false) {
				DanhSachSinhVien.addToList(new SinhVien(ten, tuoi, gioiTinh, chucVu, loaiSinhVien));
			}
		}
		else if(chucVu == ChucVu.BaoVe) {
			if(DanhSachNhanVien.isValid(id) == false) {
				DanhSachNhanVien.addToList(new BaoVe(ten, tuoi, gioiTinh, chucVu));
			}
		}
		else {
			if(DanhSachNhanVien.isValid(id) == false) {
				DanhSachNhanVien.addToList(new VeSinh(ten, tuoi, gioiTinh, chucVu));
			}
		}
	}	
	static public void NhapBangLichCanThem() {
		System.out.println("1. Them vao bang lich day");
		System.out.println("2. Them vao bang lich hoc");
		System.out.println("3. Them vao bang lich truc");
		System.out.println("Chon: ");
		int x = ScannerUtils.readInt(sc, 1, 3);
		if(x == 1) Input.NhapCaGiangDay();
		else if(x == 2) Input.NhapCaHoc();
		else Input.NhapCaTruc();
	}	
	 public static void NhapCaGiangDay() {
		System.out.println("Nhap ID giang vien: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian: ");
		System.out.println("Tiet 1(1), Tiet 3(2), Tiet 5(3), Tiet 7(4)");
		int tg = ScannerUtils.readInt(sc, 1, 3);
		Time time = Time.getTime(tg);
		System.out.println("Nhap phong hoc: ");
		System.out.println("D_302(1), A2_505(2), A2_616(3)");
		int ph = ScannerUtils.readInt(sc, 1, 2);
		PhongHoc phongHoc = PhongHoc.getPhongHoc(ph);
	}	 
	 public static void NhapCaHoc() {
		System.out.println("Nhap ID sinh vien: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian: ");
		System.out.println("Tiet 1(1), Tiet 3(2), Tiet 5(3), Tiet 7(4)");
		int tg = ScannerUtils.readInt(sc, 1, 1);
		Time time = Time.getTime(tg);
		System.out.println("Nhap phong hoc: ");
		System.out.println("D_302(1), A2_505(2), A2_616(3)");
		int ph = ScannerUtils.readInt(sc, 1, 3);
		PhongHoc phongHoc = PhongHoc.getPhongHoc(ph);
	}
	public static void NhapCaTruc(){
		System.out.println("Nhap ID nhan vien: ");
		int id = ScannerUtils.readInt(sc, 1, 100);
		System.out.println("Nhap thoi gian: ");
		System.out.println("Tiet 1(1), Tiet 3(2), Tiet 5(3), Tiet 7(4)");
		int tg = ScannerUtils.readInt(sc, 1, 3);
		Time time = Time.getTime(tg);
		System.out.println("Nhap vi tri truc: ");
		System.out.println("CongBaoVe(1), Sanh_D(2), Tang6(3)");
		int tang = ScannerUtils.readInt(sc, 1, 1);
	}
}
