package az.edu.turing.Module1.Quiz6Rewind.Q5;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Osman");
        Person person3 = new Person("Osman");
        Person person4 = person1;
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        System.out.println(person1 == person3);
        System.out.println(person1 == person4);
    }
}
