package Controller.singelton;

import java.util.ArrayList;
import java.util.List;
import Model.Lich.*;

public class BangLichGiangDay {
	static private List<LichLamViec> lichgiangday = new ArrayList<LichLamViec>();
	private BangLichGiangDay() {
	}
	static public List<LichLamViec> getInstance(){
		return lichgiangday;
	}
	
	static public boolean addToBangGD(LichLamViec llv) {
		lichgiangday.add(llv);
		return true;
	}
}
