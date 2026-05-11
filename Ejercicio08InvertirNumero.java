import java.util.Scanner;

public class Ejercicio08InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        System.out.println("Número original: " + original);
        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}
