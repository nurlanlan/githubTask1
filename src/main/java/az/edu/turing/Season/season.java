package az.edu.turing.Season;

import java.util.Scanner;

public class season {

    public static void main(String[] args){
        System.out.print(" Teqvimde Secdiyiniz aya uygun gelen ededi daxil edin (1--12) :  " );
        Scanner in = new Scanner(System.in);
        int numberOfMonth = in.nextInt();



        System.out.println(numberOfMonth>12 || numberOfMonth<1  ?"Bele bir ay yoxdur":(numberOfMonth> 2&& numberOfMonth<12 ? (numberOfMonth>2&& numberOfMonth<6?"Spring":(numberOfMonth>5 && numberOfMonth<9 ? "Summer":(numberOfMonth>8 && numberOfMonth<12 ? "Fall":"Bele bir ay yoxdur")  ) ):"Winter"));

    }


}
