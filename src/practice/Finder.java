package practice;

import java.util.ArrayList;

public class Finder {

	public int lastIndexOf(ArrayList<String> strings, String s) {
		int lastIndex = -1;
		for (int i = 0; i < strings.size(); i++) {
			if (equalsCaseIgnored(strings.get(i), s) == true) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	
	public boolean equalsCaseIgnored(String sI, String sII) {
		if (sI.length() == sII.length()) {
			boolean consistency = false;
			for (int i = 0; i < sI.length() - 1; i++) {
				if (sI.substring(i, i + 1).toLowerCase().equals(sII.substring(i, i + 1).toLowerCase())) {
					consistency = true;
				}else {
					return false;
				}
			}
			if (consistency == true) {
				return true;
			}
		}
		return false;
	}
}
