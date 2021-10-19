package Controller.singelton;

import java.util.ArrayList;
import java.util.List;
import Model.Lich.*;

public class BangLichTruc {
	static private List<LichLamViec> lichtruc = new ArrayList<LichLamViec>();
	private BangLichTruc() {
	}
	static public List<LichLamViec> getInstance(){
		return lichtruc;
	}
	
	static public boolean addToBangLH(LichLamViec llv) {
		lichtruc.add(llv);
		return true;
	}
}
