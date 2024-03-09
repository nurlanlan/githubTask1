package az.edu.turing.MiniFamilyProject;

public class FamilyApp {
    public static void main(String[] args) {
        // Create families
        Human mother1 = new Human("Alice", "Smith", 1980,101);
        Human father1 = new Human("Bob", "Smith", 1978,120);
        Family family1 = new Family(mother1, father1);

        Human mother2 = new Human("Carol", "Johnson", 1985,102);
        Human father2 = new Human("Dave", "Johnson", 1983,99);
        Family family2 = new Family(mother2, father2);

        // Add children to families
        Human child1 = new Human("Eve", "Smith", 2005,111);
        family1.addChild(child1);

        Human child2 = new Human("Frank", "Johnson", 2008,80);
        family2.addChild(child2);

        // Add pets to families
        Pet dog1 = new Pet("Dog", "Rex", 5, 75, new String[]{"eat", "sleep"});
        family1.setPet(dog1);

        // Print family information
        System.out.println("Family 1 with pet:");
        System.out.println(family1);

        System.out.println("Family 2 without pet:");
//        System.out.println(family2);

        // Get count of family members
        System.out.println("Family 1 member count: " + family1.countFamily());
        System.out.println("Family 2 member count: " + family2.countFamily());
    }
}