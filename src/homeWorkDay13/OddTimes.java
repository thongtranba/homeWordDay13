package homeWorkDay13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OddTimes {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15};
		List<Integer> result = findOddTimesAppearNum(arr);
		System.out.println("number appear odd times: " + result);
	}
	public static List<Integer> findOddTimesAppearNum(int[] arr) { //time complexity => O(2n)
		HashMap<Integer, Integer> countArr = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) { //n steps
			if (countArr.containsKey(arr[i])) {
				countArr.put(arr[i], countArr.get(arr[i]) + 1);
			} else {
				countArr.put(arr[i], 1);
			}
		}
		for (int i : countArr.keySet()) { //n steps
			if (countArr.get(i) % 2 != 0) {
				list.add(i);
			}
		}
		return list;
	}
}
