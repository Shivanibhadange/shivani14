package p1;

import java.util.Comparator;

public class SortedBasedOnPrice implements Comparator<Electronics> {
	
	@Override
	public int compare(Electronics e1,Electronics e2) {
		return e1.getPrice() - e2.getPrice();
}
}
