package az.edu.turing.MiniFamilyExamLastVersion;

public class App {
    public static void main(String[] args) {
        Human mother1 = new Human("Alexa", "Golberg", 1977);
        Human father1 = new Human("Alex", "Golberg", 1975);
        Pet pet1 = new Pet("dog", "Cucu", 5, 57, new String[]{"playful", "affectionate"});
        Human child1 = new Human("Nana", "Qanbarov", 2000, 120, pet1, mother1, father1, new String[][]{{"playful", "affectionate"}, {"sleepy", "curious"}});

        Human mother2 = new Human("Moleks", "Goldar", 1967);
        Human father2 = new Human("Nuex", "Alberg", 1955);
        Pet pet2 = new Pet("cat", "Nunu", 3, 66, new String[]{"playful", "affectionate"});
        Human child2 = new Human("Bobo", "Alburger", 1990, 101, pet2, mother2, father2, new String[][]{{"playful", "affectionate"}, {"sleepy", "curious"}});

    }
}
