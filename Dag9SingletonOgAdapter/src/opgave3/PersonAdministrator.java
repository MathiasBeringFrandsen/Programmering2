package opgave3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonAdministrator {
    private static PersonAdministrator personAdministrator;
    Set<Person> personer;

    private PersonAdministrator(){
        personer = new HashSet<>();
    }

    public static PersonAdministrator getInstance(){
        if (personAdministrator == null){
            personAdministrator = new PersonAdministrator();
        }
        return personAdministrator;
    }

    public void add(Person person){
        personer.add(person);
    }

    public void remove(Person person){
        personer.remove(person);
    }

    public Set<Person> getPersoner(){
        return new HashSet<>(personer);
    }



}
