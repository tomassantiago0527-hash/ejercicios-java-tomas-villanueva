import java.util.Scanner;

public class Ejercicio06SumaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        int suma = 0;

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 2; i <= n; i += 2) {
                suma += i;
            }

            System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
        }

        sc.close();
    }
}
