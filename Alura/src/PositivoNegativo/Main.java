package PositivoNegativo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número!");

        int numberUser = sc.nextInt();

        if (numberUser < 0) {
            System.out.println("O número é negativo!");
        }else{
            System.out.println("O número é positivo!");
        }

        sc.close();

    }

}
