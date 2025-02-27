package Average;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first number");
        double number1 = sc.nextDouble();
        System.out.println("Writhe the second number");
        double number2 = sc.nextDouble();
        System.out.println("Write the third number");
        double number3 = sc.nextDouble();

        System.out.println("The avarage of the numbers are: " + FindAvarageNumber(number1, number2, number3));

        sc.close();
    }

    static double FindAvarageNumber(double numb1, double numb2, double numb3){
        return (numb1 + numb2 + numb3) / 3;
    }

}
