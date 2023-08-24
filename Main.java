import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Introduce la posicion del caracter que deseas obtener: ");
        int posicion = scanner.nextInt();

        try {
            char caracter = CaracterEn.caracterEn(cadena, posicion);
            System.out.println("El caracter en la posicion " + posicion + " es: " + caracter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
