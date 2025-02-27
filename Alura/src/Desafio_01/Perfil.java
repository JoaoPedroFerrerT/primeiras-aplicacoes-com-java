package Desafio_01;

import java.util.Scanner;

public class Perfil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + "!" + " Tudo bem?");

        sc.close();


    }

}
