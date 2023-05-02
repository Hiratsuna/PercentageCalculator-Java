import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        double partOfValue = 0, totalScore = 0;
        float Percentage;

        System.out.println("Enter total score ");
        totalScore = input.nextDouble();
        System.out.println("Partial Number is: ");
        partOfValue = input.nextDouble();


        Percentage = (float) ((partOfValue*100) / totalScore);

        System.out.println("Percentage is: "+Percentage+"%");
    }
}