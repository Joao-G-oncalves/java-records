public class Main {

    public static void main(String[] args) {
        var person = new Person("João", 12);
        System.out.println(person);
        System.out.println(person.name());
        var newPerson = new Person(person.name(), 13);
        System.out.println(newPerson);
    }
}