package az.edu.turing.MiniFamilyProject;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private int iq; //1-100 %
    private Family family;
    private String[][] schedule;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    public Human(String name, String surname, int birthYear, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
    }

    public Human() {
//        empty constructor;
    }


    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                ", iq=" + iq +
                ", family=" + (family != null ? "Family{mother=" + family.getMother().getName() + ", father=" + family.getFather().getName()
                + ", children=" + Arrays.toString(family.getChildren()) + ", pet=" + family.getPet() + "}" : "null") +
                '}';
        //        overriding toString
    }


}

