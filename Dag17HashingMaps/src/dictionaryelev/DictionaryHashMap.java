package dictionaryelev;

import java.util.HashMap;
import java.util.Map;

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {

	private static int N = 10;
	private Map<K, V>[] tabel;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryHashMap() {
		tabel = new HashMap[N];
		for (int i = 0; i < N; i++) {
			tabel[i] = new HashMap<K, V>();
		}
	}

	@Override
	public V get(K key) {
		int i = key.hashCode() % N;
		Map<K, V> m = tabel[i];
		return m.get(key);
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		int i = 0;
		while (empty && i < N) {
			empty = (tabel[i]).isEmpty();
			i++;
		}
		return empty;
	}

	@Override
	public V put(K key, V value) {
		int i = key.hashCode() % N;
		V previous;
		previous = tabel[i].put(key,value);
		return previous;
	}

	@Override
	public V remove(K key) {
		int i = key.hashCode() % N;
		V removed;
		removed = tabel[i].remove(key);
		return removed;
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < tabel.length; i++){
			size = size + tabel[i].size();
		}
		return size;
	}

}
