package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
		List list = new CopyOnWriteArrayList<>();

		// threads = 3
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");

		//		// threads = 1000
		//		for (String element : list) {
		//			System.out.println(element);
		//		}

	}
}
