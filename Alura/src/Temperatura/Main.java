package Temperatura;

public class Main {

    public static void main(String[] args) {

        int tempCelsius = 30;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.println(String.format("A temperatura %d em celsius fica %.2f fahrenheit", tempCelsius, tempFahrenheit));


    }

}
