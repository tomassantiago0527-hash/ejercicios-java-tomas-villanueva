import java.util.Scanner;

public class Ejercicio01CompraDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la compra: ");
        double compra = sc.nextDouble();

        double descuento = 0;

        if (compra >= 100000) {
            descuento = compra * 0.20;
        } else if (compra >= 50000) {
            descuento = compra * 0.10;
        } else {
            descuento = compra * 0.05;
        }

        double totalPagar = compra - descuento;

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);

        sc.close();
    }
}
