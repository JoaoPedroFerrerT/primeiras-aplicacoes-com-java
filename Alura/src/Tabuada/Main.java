package Tabuada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número para saber a tabuada de 1 a 10");
        int numeroUser = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < 11; i++) {
            int numeroTabuada = numeroUser * i;
            System.out.println(numeroUser + " x " + i + " = " + numeroTabuada);
        }

        sc.close();

    }


}
