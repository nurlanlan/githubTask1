package az.edu.turing.MiniFamilyExamLastVersion;

import java.text.MessageFormat;
import java.util.Arrays;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;
    Family family;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new children[];
    }

    @Override
    public String toString() {
        return MessageFormat.format("Family'{'mother={0}, father={1}, children={2}, pet={3}'}'", mother, father, Arrays.toString(children), pet);
    }
}
