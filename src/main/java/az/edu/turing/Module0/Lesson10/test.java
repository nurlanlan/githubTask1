package az.edu.turing.Module0.Lesson10;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            if (i>2){
                break;
            }
            System.out.println();
        }
    }
}
