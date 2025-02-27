package Banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dinheiro = 0;
        int opcao = 0;

        System.out.println("Bem vindo ao Banco Boquinha! Escolha uma das opções:");

        while (opcao != 4){

            System.out.println("1- Consultar saldo");
            System.out.println("2- Adicionar saldo");
            System.out.println("3- Sacar saldo");
            System.out.println("4- Sair do sistema");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("O seu saldo é: " + dinheiro);
                    break;
                case 2:
                    System.out.println("Quanto de dinheiro você vai adicionar?");
                    double adicionar = sc.nextDouble();
                    sc.nextLine();
                    dinheiro += adicionar;
                    break;
                case 3:
                    System.out.println("Quando de dinheiro você vai sacar?");
                    double sacar = sc.nextDouble();
                    if (sacar > dinheiro){
                        System.out.println("Você não pode sacar essa quantidade!");
                    }else {
                        dinheiro -= sacar;
                    }
                    break;
                case 4:
                    System.out.println("Fechando o sistema...");
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }

        }

        sc.close();

    }

}
