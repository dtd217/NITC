package singelton;

import java.util.ArrayList;
import java.util.List;

import entity.Book;

public class Inventory {
	static private List<Book> inventory = new ArrayList<Book>();
    private Inventory(){}
    static public List<Book> getInstance(){
        return inventory;
    }
    // Them book vao inventory
    static public boolean addToInventory(Book book){
        inventory.add(book);
        return true;
    }
    /**
     * Kiem tra id co ton tai trong list hay ko
     * @param id
     * @return boolean
    */
    static public boolean isValid(int id){
        for (Book i : inventory){
            if (i.getId() == id){
                return true;
            }
        }
        return false;
    }
    /**
     * Tra ve Book dua tren id
     * @param id
     * @return boolean
    */

    static Book getBook(int id){
        return inventory.get(id-1);
    }
}
