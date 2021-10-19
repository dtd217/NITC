package View;

import java.util.Scanner;
import Model.entity.*;
import Controller.Utils.ScannerUtils;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void Menu() {
		System.out.println("1. Nhập thông tin");
		System.out.println("2. Nhập lịch làm việc");
		System.out.println("3. Tìm thông tin");
		int x = ScannerUtils.readInt(sc, 1, 4);
		Input.NhapThongTin();
		while (x!=10) {
			if (x==1) {
				Input.NhapBangLichCanThem();
			}
			else if (x==2) {
				Input.NhapCaGiangDay();
			}
			else if (x==3) {
				Input.NhapCaHoc();
			}
			else if (x==4) {
				Input.NhapCaTruc();
			}
			else break;
		}
	}
}