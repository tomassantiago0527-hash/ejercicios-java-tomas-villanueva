import java.util.Scanner;

public class Ejercicio09ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int vocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }

        System.out.println("La palabra tiene " + vocales + " vocales.");

        sc.close();
    }
}
