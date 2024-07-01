package az.edu.turing.Module0.Lesson10;

public class ShipGame {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        char[][] zone = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int randomNumber = (int) (0 + Math.random() * 5);
                if(i==randomNumber && j==1){
                    zone[i][j] = 'X';
                }else
                    zone[i][j] = '#';
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(zone[i][j] + " ");
            }
            System.out.println();

        }
    }
}
