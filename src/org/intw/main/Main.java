/**
 * 
 */
package org.intw.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.intw.model.ZipCodes;

/**
 * @author Admin
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		
		List<ZipCodes> arrCodes = new LinkedList<>();
		arrCodes.add(new ZipCodes(94133,94133));
		arrCodes.add(new ZipCodes(94200,94299));
		arrCodes.add(new ZipCodes(94226,94399));
		
		Set<ZipCodes> zipRanges = new TreeSet<>();
		zipRanges.addAll(arrCodes);
		
		System.out.print("Unique Zip Codes ranges:- " + zipRanges);
	}
}
