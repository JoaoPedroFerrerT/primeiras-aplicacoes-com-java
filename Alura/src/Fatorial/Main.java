package Fatorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber o fatorial");
        int numeroUser = sc.nextInt();
        int fatoracao = 1;
        sc.nextLine();

        for (int i = 1; i <= numeroUser; i++) {
            System.out.println(i);
            fatoracao *= i;
        }

        System.out.println(fatoracao);

        sc.close();

    }

}
