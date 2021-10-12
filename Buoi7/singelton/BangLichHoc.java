package singelton;

import java.util.ArrayList;
import java.util.List;
import Lich.*;

public class BangLichHoc {
	static private List<LichLamViec> lichhoc = new ArrayList<LichLamViec>();
	private BangLichHoc() {
	}
	static public List<LichLamViec> getInstance(){
		return lichhoc;
	}
	
	static public boolean addToBangLH(LichLamViec llv) {
		lichhoc.add(llv);
		return true;
	}
}
