package projects;
import java.util.*;

public class longestSubsequence {
	public void count(ArrayList<Integer> arr) {
		int count, l = 0;
		for (int i = 0; i < arr.size(); i++) {
			count = 1;
			int max = arr.get(i);
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j) > max) {
					max = arr.get(j);
					count++;
				}
				if (count > l)
					l = count;
			}
		}
		System.out.println("Longest Increasing Subsequence = " + l);
	}

	public static void main(String[] args) {
		longestSubsequence seq = new longestSubsequence();
		// initialize arrList as ArrayList Object
		ArrayList<Integer> arrList = new ArrayList<>();
		// add elements
		arrList.add(1);
		arrList.add(19);
		arrList.add(23);
		arrList.add(12);
		arrList.add(40);
		arrList.add(2);
		arrList.add(28);
		System.out.println("My Array List : " + arrList);
		// call count method
		seq.count(arrList);
	}
}
