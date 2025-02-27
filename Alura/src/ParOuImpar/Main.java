package ParOuImpar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número");
        int numeroUser = sc.nextInt();
        sc.nextLine();
        if (numeroUser % 2 == 0){
            System.out.println("o número é par!");
        }else {
            System.out.println("o número é impar!");
        }

        sc.close();

    }

}
