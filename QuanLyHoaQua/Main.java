package QuanLyHoaQua;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn 1 số ");
		System.out.println("1. Thông tin về loại quả ");
		System.out.println("2. Số lượng quả lớn nhất có thể mua ");
		System.out.print("Số bạn chọn: ");
		int choose = sc.nextInt();
		if (choose == 1) {
			System.out.println("Chọn 1 số ");
			System.out.println("1. TÁO ");
			System.out.println("2. CAM ");
			System.out.println("3. CHUỐI ");
			System.out.print("Số bạn chọn: ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("----Thông tin về mặt hàng 'táo' ----");
				HoaQua t = new Tao(null, 0, 0, 0);
				t.input();
				System.out.println(t.toString());
			}
			else if (a == 2) {
				System.out.println("----Thông tin về mặt hàng 'cam' ----");
				HoaQua c = new Cam(null, 0, 0, 0);
				c.input();
				System.out.println(c.toString());
			}
			else {
				System.out.println("----Thông tin về mặt hàng 'chuối' ----");
				HoaQua ch = new Chuoi(null, 0, 0, 0);
				ch.input();
				System.out.println(ch.toString());
			}
		}
		else if (choose == 2) {
			System.out.println("Chọn 1 số ");
			System.out.println("1. TÁO ");
			System.out.println("2. CAM ");
			System.out.println("3. CHUỐI ");
			System.out.print("Số bạn chọn: ");
			int b = sc.nextInt();
			if (b==1) {
				System.out.println("----Số lượng táo lớn nhất có thể mua---- ");
				HoaQua t = new Tao(null, 0, 0, 0);
				t.inputPrice();
				System.out.println(t.toString1());
			}
			else if (b==2) {
				System.out.println("----Số lượng cam lớn nhất có thể mua---- ");
				HoaQua c = new Cam(null, 0, 0, 0);
				c.inputPrice();
				System.out.println(c.toString1());
			}
			else {
				System.out.println("----Số lượng chuối lớn nhất có thể mua---- ");
				HoaQua ch = new Chuoi(null, 0, 0, 0);
				ch.inputPrice();
				System.out.println(ch.toString1());
			}
			
		}
	}
}
