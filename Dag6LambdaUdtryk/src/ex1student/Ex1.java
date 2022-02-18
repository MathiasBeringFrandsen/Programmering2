package ex1student;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();

		System.out.println(findFirst(persons, p -> p.getAge() == 44 ));
		System.out.println();
		System.out.println(findFirst(persons,p -> p.getName().startsWith("S")));
		System.out.println();
		System.out.println(findFirst(persons,p -> p.getName().indexOf("i") != p.getName().lastIndexOf("i")));
		System.out.println();
		System.out.println(findFirst(persons, p -> p.getName().length() == p.getAge()));
		System.out.println();
		System.out.println();

		System.out.println(findAll(persons,p -> p.getName().contains("i")));
		System.out.println();
		System.out.println(findAll(persons,p -> p.getName().startsWith("S")));
		System.out.println();
		System.out.println(findAll(persons,p -> p.getName().length() == 5));
		System.out.println();
		System.out.println(findAll(persons,p -> p.getName().length() > 6 && p.getAge() < 40));
	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static List<Person> findAll(List<Person> list, Predicate<Person> filter){
		List<Person> temp = new ArrayList<>();
		for (Person p : list) {
			if (filter.test(p))
				temp.add(p);
		}
		return temp;
	}

}
