import java.util.Scanner;

public class CaracterEn {

    public static char caracterEn(String cadena, int posicion) throws Exception {

        if (posicion < 0 || posicion >= cadena.length()) {
            throw new Exception("La posicion " + posicion + " no es existe");
        }
        return cadena.charAt(posicion);
    }

}
