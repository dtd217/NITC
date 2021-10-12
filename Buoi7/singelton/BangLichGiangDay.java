package singelton;

import java.util.ArrayList;
import java.util.List;
import Lich.*;

public class BangLichGiangDay {
	static private List<LichLamViec> lichgiangday = new ArrayList<LichLamViec>();
	private BangLichGiangDay() {
	}
	static public List<LichLamViec> getInstance(){
		return lichgiangday;
	}
	
	static public boolean addToBangLH(LichLamViec llv) {
		lichgiangday.add(llv);
		return true;
	}
}
