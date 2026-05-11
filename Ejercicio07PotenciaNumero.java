import java.util.Scanner;

public class Ejercicio07PotenciaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();

        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();

        int resultado = 1;

        if (exponente < 0) {
            System.out.println("Este programa solo acepta exponentes enteros positivos.");
        } else {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }

            System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        }

        sc.close();
    }
}
