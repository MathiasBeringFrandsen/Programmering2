package dictionaryelev;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary map = new DictionaryHashMap<Integer,String>();
//		Dictionary<Integer, String> dictionary = new DictionaryLinked<Integer, String>();
		System.out.println(map.isEmpty());
		System.out.println(map.size());

		map.put(8, "hans");
		map.put(3, "viggo");
		System.out.println(map.isEmpty());
		System.out.println(map.size());

		System.out.println(map.get(8));

		map.put(7, "bent");
		map.put(2, "lene");
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.remove(3));

		System.out.println(map.size());

		System.out.println(map.put(8, "Ida"));
		System.out.println(map.get(8));

	}
}
