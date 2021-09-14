package baitap3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {		
		ArrayList<Tacgia> lst_Tacgia = new ArrayList<Tacgia>();
        lst_Tacgia.add(new Tacgia("Paulo Coelho"));
        lst_Tacgia.add(new Tacgia("John Tolkien"));
        lst_Tacgia.add(new Tacgia("Miguel de Cervantes"));
        
        ArrayList<Soluong> lst_Soluong = new ArrayList<Soluong>();
        lst_Soluong.add(new Soluong(0));
        lst_Soluong.add(new Soluong(1));
        lst_Soluong.add(new Soluong(10));
        
        ArrayList<Trangthai> lst_Trangthai = new ArrayList<Trangthai>();
        lst_Trangthai.add(new Trangthai("Trong kho", lst_Soluong.get(0)));
        lst_Trangthai.add(new Trangthai("Trưng bày", lst_Soluong.get(1)));
        lst_Trangthai.add(new Trangthai("Đã cho mượn", lst_Soluong.get(2)));
        
		ArrayList<Tensach> lst_Tensach = new ArrayList<Tensach>();
        lst_Tensach.add(new Tensach("Nhà giả kim", lst_Tacgia.get(0)));
        lst_Tensach.add(new Tensach("Quỷ dữ và nàng Prym", lst_Tacgia.get(0)));
        lst_Tensach.add(new Tensach("Phù thủy phố Portobello", lst_Tacgia.get(0)));
        lst_Tensach.add(new Tensach("Don Quixote", lst_Tacgia.get(1)));
        lst_Tensach.add(new Tensach("The Adventures of Tom Bombadil", lst_Tacgia.get(1)));
        lst_Tensach.add(new Tensach("The Lord of the Rings", lst_Tacgia.get(2)));       
        lst_Tensach.add(new Tensach("Galatea", lst_Tacgia.get(2)));        
        
        ArrayList<Sach> lst_Sach = new ArrayList<Sach>();
        lst_Sach.add(new Sach(lst_Tacgia.get(0), lst_Tensach.get(0), lst_Soluong.get(1), lst_Trangthai.get(2)));
        System.out.println("Tác giả - Tên sách - Trạng thái - Số lượng");
        System.out.printf("%s - %s - %s - %d", lst_Sach.get(0).getTacgia().getName(), lst_Sach.get(0).getTS().getName(), lst_Sach.get(0).getTT().getName(), lst_Sach.get(0).getSoluong().getSoluong());
	}
}
