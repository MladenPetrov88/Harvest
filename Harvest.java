import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double grape = X * Y;
        double wine = 0.4 * grape /2.5;
        double leftWine = wine - Z;
        double a = Z - wine;
        if (wine >= Z) {
            double person = leftWine / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.",Math.floor(wine),Math.ceil(leftWine), Math.ceil(person));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(a));
        }
    }
}
