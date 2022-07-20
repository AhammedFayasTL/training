package practice;

import java.util.*;

public class mapExample {

	public static void main(String[] args) {
		// HashMap
		System.out.println("---LinkedHashMap---");
		
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "Python Programming");
		h.put(2, "Java Programming");
		h.put(3, "CyberSecurity");
		for (Map.Entry<Integer, String> m : h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// LinkedHashMap
		System.out.println("---LinkedHashMap---");

		LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
		l.put(1, "Book");
		l.put(2, "Pen");
		l.put(3, "Pencil");
		for (Map.Entry<Integer, String> m : l.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// TreeMap
		System.out.println("---TreeMap---");

		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "Car");
		t.put(2, "Bike");
		t.put(3, "Train");
		for (Map.Entry<Integer, String> m : t.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
