package az.edu.turing.Module1.Lesson04;

public class Apple extends Fruit{
    String species;
    String color;
    String cameFromWhere;

    public Apple(String species, String color, String cameFromWhere,String name) {
        super(name);
        this.species = species;
        this.color = color;
        this.cameFromWhere = cameFromWhere;
    }

    public void ripe(){
        System.out.println("i riped");
    }
    public void rot(){
        System.out.println("i rotted");
    }
    public  void fall(){
        System.out.println("i fell");
    }

}
