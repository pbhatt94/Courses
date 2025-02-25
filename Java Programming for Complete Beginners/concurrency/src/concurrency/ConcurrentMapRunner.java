package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occ = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";
		for (char ch : str.toCharArray()) {
			occ.computeIfAbsent(ch, charr -> new LongAdder()).increment();
			//			LongAdder longAdder = occ.get(ch);
			//			if (longAdder == null) {
			//				longAdder = new LongAdder();
			//			}
			//			longAdder.increment();
			//			occ.put(ch, longAdder);
		}
		System.out.println(occ);
	}
}
