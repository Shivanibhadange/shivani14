package p1;

import java.util.Comparator;

public class SortedBasedOnPower implements Comparator<Electronics>  {
	
	@Override
	public int compare(Electronics e1,Electronics e2) {
		return e1.getPower() - e2.getPower();

}

}