import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
		ArrayList<Integer> list = new ArrayList<>(); // 7

		list.add(12);// 0
		list.add(new Integer(33));
//		list.add("test");//1
//		list.add(true);//2

		int x = list.get(0).intValue();// autoboxing -> boxing and unboxing

		// 8 -> 9 Void

//		list.remove(10);//
//		list.remove(new Integer(10));//

		String str = "jai jawan jai kisan";

		System.out.println(">>" + str.substring(3, 6) + "<<");// 3 4 5
		// 3 inc -> 6 -> ex

//		list.add(50, 25);
		// 1 2 5 5 4 5
		// 3,5
		// list.set(3,5)
		// 0 1 2 3 4 {10}
		list.add(5, 5);
		list.clear();
		list.contains(10);
		//list -> 10 
		//5
		//dlist -> 15 
		//
		
		LinkedList<Integer> ll; //ask allocate 
		
		//[25,123]  [30,256]  [60]
		
		//Map 
		
	}
}