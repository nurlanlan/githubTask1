package az.edu.turing.Module1.MiniFamilyProject;

import java.lang.reflect.Array;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) { //constructor which describes all the fields for the pet
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {  //constructor which describes the pet's species a nickname
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {                              // empty constructor
        this.species = "Unknown";
        this.nickname = "Unknown";
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new String[0];
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + " I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
