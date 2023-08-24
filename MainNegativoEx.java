import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        super("Número negativo encontrado.");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class MainNegativoEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un valor numérico: ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                throw new NumeroNegativoExcepcion();
            } else {
                double raizCuadrada = Math.sqrt(valor);
                System.out.println("La raíz cuadrada de " + valor + " es " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion ex) {
            System.out.println("Excepción: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Ocurrió un error: " + ex.getMessage());
        }
    }
}