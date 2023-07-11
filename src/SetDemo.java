import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class SetDemo {

	public static void main(String[] args) {

		// HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> hs = new TreeSet<Integer>();

		hs.add(10);
		hs.add(20);
		hs.add(120);
		hs.add(20);
		hs.add(120);

		System.out.println(hs);

		System.out.println(hs.remove(1)); // 1 => data

	}

}


//n number -> array list -> 
//3
//10 20 30 -> 
