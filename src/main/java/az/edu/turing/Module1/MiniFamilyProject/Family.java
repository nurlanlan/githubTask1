package az.edu.turing.Module1.MiniFamilyProject;

public class Family {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Yumyum", 2, 57, new String[]{"Playful", "Energetic"});
        Human mother = new Human("Zaur", "Ahmad", 1975);
        Human father = new Human("Aynur", "Ahmad", 1979);
        Human child = new Human("Nurlan", "Ahmad", 2004, mother, father);
        Human child2 = new Human("Aliye", "Ahmad", 2010, 11, pet, mother, father, new String[7][3]);
        child.setPet(pet);

        System.out.println(child.name);
        System.out.println(child.surname);
        System.out.println(child.iqLevel);
        child.describePet();
        child.greetPet();
        child.pet.eat();

    }
}
