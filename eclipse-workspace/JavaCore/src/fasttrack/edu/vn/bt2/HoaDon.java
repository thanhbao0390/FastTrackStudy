package fasttrack.edu.vn.bt2;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {

	
	List<ThucDon> thucdon = new ArrayList<ThucDon>();
	
	float tongtien() {
		
		float sum = 0;
		for (ThucDon td : thucdon) {
			sum += td.thanhtien();
		}
		
		return sum;
	}
}
