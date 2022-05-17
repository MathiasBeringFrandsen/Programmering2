package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> unionSet = new HashSet<>(s1);
		unionSet.addAll(s2);
		return unionSet;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> differensSet = new HashSet<>(s1);
		for (T object : s2){
			if (s1.contains(object)){
				differensSet.remove(object);
			}
		}
		return differensSet;

	}

	public static <T> Set<T> intersection(Set<T> s1, Set<T> s2) {
		Set<T> intersectionSet = new HashSet<>();
		for (T object : s2){
			if (s1.contains(object)){
				intersectionSet.add(object);
			}
		}
		return intersectionSet;
	}

}
