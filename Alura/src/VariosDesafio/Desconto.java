package VariosDesafio;

public class Desconto {

    public static void main(String[] args) {

        double precoOriginal = 200;
        double percentualInteiro = 10;
        double percentualReal = (percentualInteiro / 100) * precoOriginal;
        double produtoComDesconto = precoOriginal - percentualReal;

        System.out.println(produtoComDesconto);


    }

}
