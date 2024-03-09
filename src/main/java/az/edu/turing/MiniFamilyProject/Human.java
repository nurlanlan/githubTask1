package az.edu.turing.MiniFamilyProject;

public class Human {
    String name;
    String surname;
    int birthYear;
    int iq; //1-100 %
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
//        constructor -- name, surname, birthYear;
    }

    public Human(String name, String surname, int birthYear, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
//        constructor -- name,surname,birthYear,mother,father;
    }

    public Human(String name, String surname, int birthYear, int iq, Pet pet, Human mother, Human father /*String[][] schedule*/) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
       // this.schedule = schedule;
//        consturctor -- all fields;
    }

    public Human() {
//        empty constructor;
    }

    public void greet() {
        System.out.println("Hello " + pet.nickname);
    }

    public void describePet() {
        System.out.print("I have an " + pet.species + " is " + pet.age + " years old, he is " +
                (pet.trickLevel + (pet.trickLevel < 50 ? " almost not silly" : " very silly")));
//        "I have an [species] is [age] years old, he is [very sly]>50/[almost not sly]<50".
    }

    public String toString() {
        return "Human{name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthYear +
                ", iq=" + iq +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", pet=" + pet +
                '}';
//        overriding toString
    }
}
