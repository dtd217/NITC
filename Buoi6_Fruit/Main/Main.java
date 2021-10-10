package example.Main;

import example.entity.*;
import example.singelton.Cart;
import example.singelton.Inventory;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Fruit> hq = Inventory.getInstance();
        Scanner sc = new Scanner(System.in);
		System.out.println("Chọn 1 số ");
		System.out.println("1. Thông tin về loại quả ");
		System.out.println("2. Thêm vào Cart ");
		System.out.print("Số bạn chọn: ");
		int choose = sc.nextInt();
		if (choose == 1) {
			System.out.println("Chọn loại quả ");
			System.out.println("1. TÁO ");
			System.out.println("2. CAM ");
			System.out.println("3. CHUỐI ");
			System.out.print("Số bạn chọn: ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("| Id |   Tên    | Số lượng |   Giá   | Lượng đường |");
				Inventory.addToInventory(new Apple("Táo Đức", 100, 5, "C, K,Mn, Cu,..", 20));
		        Inventory.addToInventory(new Apple("Táo Tàu", 50, 1, "C, K,Mn, Cu,..", 10));
				for (Fruit i : hq) {
					System.out.println("| " + i.getId() + "  | " + i.getName() + "  |    " + i.getQuantity() + "     |" + i.getPrice() + "/quả|     " + ((Apple)i).getSugar() + "      |");
				}
			}
			else if (a == 2) {
				System.out.println("| Id |   Tên    | Số lượng |   Giá    |  Khối lượng |");
				Inventory.addToInventory(new Orange("Cam Sành", 70, 7, "C, B6, B12,..", 20));
				Inventory.addToInventory(new Orange("Cam Canh", 65, 4, "C, B6, B12,..", 30));
				for (Fruit i : hq) {
					System.out.println("| " + i.getId() + "  | " + i.getName() + " |    " + i.getQuantity() + "     | " + i.getPrice() + "/quả | " + ((Orange)i).getWeight() + "g/1 quả |");
				}
			}
			else {
				System.out.println("| Id |    Tên     | Số lượng |   Giá    | Lượng kali-40 |");
				Inventory.addToInventory(new Banana("Chuối Nhật", 50, 15, "B6, C,..", 0.01));
			    	Inventory.addToInventory(new Banana("Chuối tiêu", 30, 10, "B6, C,..", 10));
			    for (Fruit i : hq) {
					System.out.println("| " + i.getId() + "  | " + i.getName() + " |    " + i.getQuantity() + "    | " + i.getPrice() + "/quả |  " + ((Banana)i).getKali() + "g/1 quả  |");
				}
			}
		}
		else if (choose == 2) {
			Cart.getInstance();
			for (Fruit i : Inventory.getInstance()) {
				System.out.println(i.getId() + "	" + i.getName() + "    " + i.getPrice() + "    "+ i.getQuantity() + "    " + i.getVitamin());
			}
			while(true) {
				System.out.print("Nhập id quả: ");
				int id = sc.nextInt();
				System.out.print("Nhập số lượng: ");
				int quantity = sc.nextInt();
				if (Cart.addToCart(id, quantity)) {
					System.out.println("Thêm vào Cart thành công!");
				}
				else {
					System.out.println("Thêm vào Cart thất bại!");
				}
				System.out.println("Bạn có muốn mua thêm không ??:");
				System.out.println("1. YES");
				System.out.println("2. NO");
				int c = sc.nextInt();
				if(c == 2) {
					System.out.println("Chúc bạn có 1 ngày vui vẻ!");
					break;
				}
			}
		}
	}
}