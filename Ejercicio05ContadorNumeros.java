import java.util.Scanner;

public class Ejercicio05ContadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        sc.close();
    }
}
