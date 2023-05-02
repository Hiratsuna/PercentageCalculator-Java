import java.util.Scanner;

public class CalculateThePercentage {
        public static void main(String[] args) {
            double x = 0;
            double y = 0;

            Scanner input = new Scanner (System.in);
            float Percentage;

            System.out.println("% of: ");
            x= input.nextDouble();
            System.out.println("Percentage: ");
            y = input.nextDouble();


            double result = x * y / 100;
            System.out.println(y + "% of" + x + "is:");
            System.out.println(result);
    }
}