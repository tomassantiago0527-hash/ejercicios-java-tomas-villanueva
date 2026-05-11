import java.util.Scanner;

public class Ejercicio03ConversionKilometros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en kilómetros: ");
        double kilometros = sc.nextDouble();

        double metros = kilometros * 1000;
        double centimetros = metros * 100;

        System.out.println("Metros: " + metros);
        System.out.println("Centímetros: " + centimetros);

        sc.close();
    }
}
