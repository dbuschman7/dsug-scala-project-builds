package me.lightspeed7.dsug.scala;

import java.util.List;
import java.util.ArrayList;

public class PascalJava {

	public static List<List<Long>> pascalJava(int rows) {

		List<List<Long>> results = new ArrayList<List<Long>>();
		if (rows < 0)
			return results;

		// save the last(first) row here
		ArrayList<Long> last = new ArrayList<Long>();
		last.add(1L);
		results.add(last);
		
		for (int i = 1; i < rows; ++i) {
			// work on the next row
			ArrayList<Long> thisRow = new ArrayList<Long>();
			thisRow.add(last.get(0)); // beginning
			for (int j = 1; j < i; ++j) {// loop the number of elements in this row
				thisRow.add(last.get(j - 1) + last.get(j)); // sum from the last row
			}
			thisRow.add(last.get(0)); // end
			last = thisRow; // save this row
			results.add(thisRow);
		}

		return results;
	}
}
