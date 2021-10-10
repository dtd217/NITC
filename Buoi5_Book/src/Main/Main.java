package Main;

import java.util.List;
import java.util.Scanner;
import entity.Book;
import entity.KhoaHoc;
import entity.NgoaiVan;
import entity.VanHoc;
import singelton.Inventory;

public class Main{
    public static void main(String[] args){
        List<Book> book = Inventory.getInstance();
        Scanner sc = new Scanner(System.in);
		System.out.println("Chọn 1 số ");
		System.out.println("1. Thông tin về sách ");
		System.out.println("2. Số lượng sách nhất có thể mua ");
		System.out.print("Số bạn chọn: ");
		int choose = sc.nextInt();
		if (choose == 1) {
			System.out.println("Chọn loại sách ");
			System.out.println("1. Sách Văn học ");
			System.out.println("2. Sách Khoa học ");
			System.out.println("3. Sách Ngoại văn ");
			System.out.print("Số bạn chọn: ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("| Id | Tên sách | Tác giả | Số lượng |     Giá     | Lần tái bản |");
				Inventory.addToInventory(new VanHoc("Colorful", "MoriEto", 70000, 20, 5));
				Inventory.addToInventory(new VanHoc("Chí Phèo", "Nam Cao", 55000, 16, 3));
				for (Book i : book) {
					System.out.println("| " + i.getId() + "  | " + i.getName() + " | " + i.getAuthor() + " |    " + i.getQuantity() + "    | " + i.getPrice() + "/quyển |      " + ((VanHoc)i).getLanTB() + "      |");
				}
			}
			else if (a == 2) {
				System.out.println("| Id |      Tên sách       |   Tác giả  | Số lượng |     Giá     | Năm xuất bản |");
				Inventory.addToInventory(new KhoaHoc("Thế giới bị quỷ ám ", "Ann Druyan", 19900, 24, 1995));
				Inventory.addToInventory(new KhoaHoc("Bản thiết kế vĩ đại", "L.Mlodinow", 34500, 32, 2010));
				for (Book i : book) {
					System.out.println("| " + i.getId() + "  | " + i.getName() + " | " + i.getAuthor() + " |    " + i.getQuantity() + "    | " + i.getPrice() + "/quyển |     " + ((KhoaHoc)i).getNamXB() + "     |");
				}
			}
			else {
				System.out.println("| Id |      Tên sách      |    Tác giả    | Số lượng |     Giá     |       Mã số ISBN       |");
				Inventory.addToInventory(new NgoaiVan("Đi tìm lẽ sống    ", "Viktor Frankl", 75000, 10, "ISBN 978-604-80-0045-5"));
			    Inventory.addToInventory(new NgoaiVan("Vào trong hoang dã", "Jon Krakauer ",  90000, 14, "ISBN 978-604-0-00000-2"));
			    for (Book i : book) {
			    	System.out.println("| " + i.getId() + "  | " + i.getName() + " | " + i.getAuthor() + " |    " + i.getQuantity() + "    | " + i.getPrice() + "/quyển | " + ((NgoaiVan)i).getMaISBN() + " |");
				}
			}
		}
		else if (choose == 2) {
			System.out.print("Nhập số tiền bạn đang có: ");
			int money = sc.nextInt();
			for(Book i : book) {
				if(i.getPrice() <= money) {
					int count = 0;
					int m = money;
					while(money >= 0) {
						money = money - i.getPrice();
						count++;
					}
					if(count >= i.getQuantity()+1) 
						System.out.println("Có thể mua tối đa: " + i.getQuantity() + " quyển sách "+i.getName());
					else
						System.out.println("có thể mua tối đa: " + (count-1) + " quyển sách "+i.getName());
					money = m;
				}
			}
		}
    }
}