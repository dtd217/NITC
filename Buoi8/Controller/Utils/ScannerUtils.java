package Controller.Utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int readInt(Scanner sc, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(sc.nextLine());
				if (a<min || a>max) {
					System.out.println("Nhap so trong khoang [" + min + "; " + max + "]");
					System.out.println("Moi nhap lai: ");
				}
				else return a;
			}
			catch (NumberFormatException ex) {
				System.out.println("Bi loi NumberFormatException");
				System.out.println("Moi nhap lai 1 so nguyen");
			}
		}
	}

	public static String readString(Scanner sc) {
		while (true) {
			try {
				while(true) {
					String s = sc.nextLine();
					int kt=1;
					for(int i=0; i<s.length(); i++) {
						if((s.charAt(i)-0>=97 && s.charAt(i)-0<=122) || (s.charAt(i)-0>=65 && s.charAt(i)-0<=90)) continue;
						else {
							System.out.println("Tên chứa kí tự đặc biệt");
							System.out.println("Mời bạn nhập lại: ");
							kt=0;
							break;
						}
					}
					if(kt==1 && s!=null && !s.isEmpty()) return s;
				}
			} catch (Exception ex) {
				System.out.println("Bạn đã nhập sai ");
				System.out.println("Mời bạn nhập lại ");
			}
		}
	}

}