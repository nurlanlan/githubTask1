package az.edu.turing.MiniFamilyProject;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;  //1-100 %
    String[] habits;

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
//        constructor -- species, nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
//        constructor -- all fields;
    }

    public Pet(String species) {
//       empty constructor;
    }

    public void eat() {
        System.out.println("i am eating");
    }

    ;

    public void respond() {
        System.out.println("Hello owner my name is " + nickname);
    }

    ;

    public void foul() {
        System.out.println("I need to cover it up");
    }

    ;

    public String toString() {
        return "{" + "species=" + species +
                "  nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
