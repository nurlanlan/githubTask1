package az.edu.turing.MiniFamilyProject;

public class FamilyApp {
    public static void main(String[] args) {
        // family 1
        Human fatherF1 = new Human("Micheal", "Jackson", 1958);
        Human motherF1 = new Human("Angelina", "Jolie", 1971);
        Human Mamed = new Human("Mamed", "Mamedov", 2001, motherF1, fatherF1);
        Pet petF1 = new Pet("dog", "toplan");
        Human Heyder = new Human("Heyder", "Emiraslanov", 1999, 122, petF1, motherF1, fatherF1);

//        family2
        Human fatherF2 = new Human("Faiq", "Agayev", 1980);
        Human motherF2 = new Human("Elza", "Seyidcahan", 1975);
        Human Mikail = new Human("Mikail", "Semedov", 2004, motherF2, fatherF2);
        Pet petF2 = new Pet("cat", "meow");
        Human Ismail = new Human("Ismail", "Emiraslanov", 2006, 122, petF2, motherF2, fatherF2);



        System.out.println(Mikail);
        System.out.println(Ismail);
        System.out.println(petF2);
    }

}
