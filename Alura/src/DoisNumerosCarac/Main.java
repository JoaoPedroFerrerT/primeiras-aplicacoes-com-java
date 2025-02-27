package DoisNumerosCarac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean numeroIguais = false;
        boolean numeroDiferentes = false;
        boolean primeiroNumeroMaior = false;
        boolean segundoNumeroMaior = false;

        System.out.println("Insira dois números!");
        int number1 = sc.nextInt();
        sc.nextLine();
        int number2 = sc.nextInt();

        if (number1 == number2){
            numeroIguais = true;
        }else{
            numeroDiferentes = true;
        }

        if (number1 > number2 && number1 != number2){
            primeiroNumeroMaior = true;
        }else if(number2 > number1 && number2 != number1) {
            segundoNumeroMaior = true;
        }

        System.out.println("Aqui está os dados sobre os dois números:");
        System.out.println("Os numero são iguais: " + numeroIguais);
        System.out.println("Os numeros são diferentes: " + numeroDiferentes);
        System.out.println("O numero 1 é maior que o 2: " + primeiroNumeroMaior);
        System.out.println("O numero 2 é maior que o 1: " + segundoNumeroMaior);

        sc.close();

    }

}
