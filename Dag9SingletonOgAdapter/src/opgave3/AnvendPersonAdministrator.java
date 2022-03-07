package opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        PersonAdministrator admin = PersonAdministrator.getInstance();

        Person p1 = new Person("Mikkel",41);
        Person p2 = new Person("Frederik",25);
        Person p3 = new Person("Kristina",28);

        admin.add(p1);
        admin.add(p2);
        System.out.println("Efter to add: " + admin.getPersoner());
        admin.add(p3);
        admin.remove(p2);
        System.out.println("Tilføjet p3, fjernet p2: " + admin.getPersoner());
    }
}
