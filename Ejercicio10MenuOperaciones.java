import java.util.Scanner;

public class Ejercicio10MenuOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nMENÚ DE OPERACIONES");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
