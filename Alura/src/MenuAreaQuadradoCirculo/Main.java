package MenuAreaQuadradoCirculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        System.out.println("Escolha uma das opções:");

        while (opcao != 3){
            System.out.println("1- Calcular área do quadrado");
            System.out.println("2- Calcular área do circulo");
            System.out.println("3- Sair");

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){

            case 1:
                System.out.println("Diga os valores dos lados:");
                double lado = sc.nextInt();
                sc.nextLine();
                double areaQuadrado = lado * lado;
                System.out.println("A area do quadrado é: " + areaQuadrado);
                break;
            case 2:
                System.out.println("Diga o raio");
                double raio = sc.nextInt();
                sc.nextLine();
                double pi = 3.14;
                double areaCirculo = (raio * raio) * pi;
                System.out.println("A área do circulo é: " + areaCirculo);
                break;
            case 3:
                System.out.println("Fechando sistema...");
                break;
            default:
                System.out.println("Opção não encontrada!");
                break;
        }

        }


        sc.close();

    }

}
