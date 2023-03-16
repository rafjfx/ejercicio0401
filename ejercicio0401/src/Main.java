import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.event.WindowStateListener;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf < 0) { // Condicion if
            System.out.println("es negativo");
        } else if (numeroIf > 0) {
            System.out.println("es positivo");
        } else {
            System.out.println("es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) { // Condicion while
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        int numerodo = 0;

        do {
            System.out.println(numerodo); // Condicion DoWhile
        }   while (numerodo != 0);

        for (int numeroFor = 0; numeroFor < 3; numeroFor++) { // Condicion For
            System.out.println(numeroFor);
        }
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}