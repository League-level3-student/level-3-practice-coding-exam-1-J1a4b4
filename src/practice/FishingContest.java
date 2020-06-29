package practice;

import java.util.HashMap;
import java.util.Set;

public class FishingContest {

	HashMap<String, double[]> h;
	FishingContest(HashMap<String, double[]> h){
		this.h = h;
	}
	
	public double findBiggestFish(String string) {
		return findLargestFish(string, h);
	}
	
	public String findWinner() {
		double[] largestFish = new double[h.size()];
		Set<String> s = h.keySet();
		String[] sI = new String[s.size()];
		s.toArray(sI);
		for (int i = 0; i < h.size(); i++) {
			largestFish[i] = findBiggestFish(sI[i]);
		}
		double biggest = 0;
		int key = 0;
		for (int i = 0; i < sI.length; i++) {
			if (largestFish[i] > biggest) {
				biggest = largestFish[i];
				key = i;
			}
		}
		return sI[key];
	}
	
	public double findLargestFish(String string, HashMap<String, double[]> hashmap) {
		double[] d = hashmap.get(string);
		double largest = 0.0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] > largest) {
				largest = d[i];
			}
		}
		return largest;
	}
}
