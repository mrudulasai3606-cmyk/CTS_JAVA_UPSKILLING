package MODULE21_30;


import java.util.List;

public class RecordExample {

    public static void main(String[] args) {

        Person p1 = new Person("Sai", 22);
        Person p2 = new Person("Ravi", 18);
        Person p3 = new Person("Anil", 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> persons = List.of(p1, p2, p3);

        System.out.println("\nPeople age >= 21:");

        persons.stream()
                .filter(person -> person.age() >= 21)
                .forEach(System.out::println);
    }
}

record Person(String name, int age) {}