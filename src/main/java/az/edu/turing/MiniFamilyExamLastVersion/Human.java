package az.edu.turing.MiniFamilyExamLastVersion;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int birthYear;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public void greetPet() {
        System.out.println("Hello " + pet.getNickname());
    }
    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("I have a/an " + pet.getSpecies() + " is " + pet.getAge() + " years old. he is Very silly");
        } else
            System.out.println("I have a/an " + pet.getSpecies() + " is " + pet.getAge() + " years old. he is almost not silly");

    }

    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Human(String name, String surname, int birthYear, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int birthYear, int iq, Pet pet, Human mother, Human father, String[][] schedule ) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
