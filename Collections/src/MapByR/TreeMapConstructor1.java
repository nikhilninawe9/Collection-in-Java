package MapByR;

import java.util.TreeMap;

//First Constructor [default sorting]
public class TreeMapConstructor1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<>();
		t.put("ratan", 111);
		t.put("durga", 555);
		t.put("sravya", 333);
		t.put("mamta", 444);
		System.out.println(t);// {durga=555, mamta=444, ratan=111, sravya=333}

		TreeMap<Integer, String> t1 = new TreeMap<>();
		t1.put(235, "sfgdh");
		t1.put(566, "sfgdh");
		t1.put(111, "sfgdh");
		t1.put(255, "sfgdh");
		System.out.println(t1);// {111=sfgdh, 235=sfgdh, 255=sfgdh, 566=sfgdh}
	}

}
