package VariosDesafio;

import java.util.Scanner;

public class Media2notas {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("O resultado foi: " + (nota1 + nota2) / 2);

        sc.close();

    }


}
