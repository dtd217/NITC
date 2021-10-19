package Controller.singelton;

import java.util.ArrayList;
import java.util.List;
import Model.entity.Person;

public class DanhSachNhanVien {
	static private List<Person> p = new ArrayList<Person>();
	private DanhSachNhanVien() {
	}
	static public List<Person> getInfor(){
		return p;
	}
	static public boolean addToList(Person info) {
		p.add(info);
		return true;
	}
	static public boolean isValid(int id) {
		for(Person i : p) {
			if(i.getId() == id) {
				return true;
			}
		}
		return false;
	}
	static public Person getInfo(int id) {
		return p.get(id-1);
	}
}
