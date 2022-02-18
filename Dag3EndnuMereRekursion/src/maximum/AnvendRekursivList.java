package maximum;

import java.util.ArrayList;

public class AnvendRekursivList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(11);
		list.add(3);
		list.add(6);
		list.add(0);
		list.add(0);
		list.add(0);

		RekursivList rekursivList = new RekursivList();
		System.out.println(rekursivList.max(list));
		System.out.println(rekursivList.sum(list));
		System.out.println(rekursivList.zeroCounter(list));
	}

}
