package az.edu.turing.Module1.MiniFamilyProject;

public class Human {
    String name;
    String surname;
    int birthYear;
    int iqLevel;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    //constructor which describes all the fields


    public Human(String name, String surname, int birthYear, int iqLevel, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    //constructor which describes the name, surname and the date of birth
    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    //constructor which describes the name, surname, date of birth, father and mother
    public Human(String name, String surname, int birthYear, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void greetPet() {
        System.out.println("Hello " + pet.nickname);
    }

    public void describePet() {
        System.out.println("I have a " + pet.species + " is " + pet.age + " years old, it has " + pet.trickLevel + " Level");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
