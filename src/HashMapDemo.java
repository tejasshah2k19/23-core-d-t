import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		// key - unique
		// value - duplicate

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12345, "ram");
		hm.put(456, "sita");

		System.out.println(hm);

		System.out.println(hm.get(456));

		hm.put(456, "laxman");// O(1)
		hm.put(4567, "laxman");// O(1)

		System.out.println(hm);// key duplicate -> existing over-update

		// default -> grow ->
		System.out.println(hm.size());
		hm.remove(456);
		System.out.println(hm);
		hm.clear(); 
		System.out.println(hm);
	}
}
