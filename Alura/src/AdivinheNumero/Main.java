package AdivinheNumero;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 5;
        // Jogo da adivinhação

        System.out.println("Tente adivinhar o número!");

        for (int i = 0; i < tentativas; i++) {
            int numeroJogador = sc.nextInt();
            sc.nextLine();
            if (numeroJogador == numeroAleatorio){
                System.out.println("Parabéns você acertou!");
                break;
            } else {
                System.out.println("Tente novamente!");
                if (i == tentativas - 1){
                    System.out.println("Você perdeu!");
                    break;
                }
            }
        }

        System.out.println("O numero era: " + numeroAleatorio);


        sc.close();

    }

}
