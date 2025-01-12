import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConvertirMoneda convertidor = new ConvertirMoneda();
        Scanner lectura = new Scanner(System.in);
        int opcion;
        double cantidad;

        String menu = """
                --CONVERSOR DE MONEDAS--
                ************************
                1. Dólar => Peso Argentino
                2. Peso Argentino => Dólar
                3. Dólar => Real Brasileño
                4. Real Brasileño => Dólar
                5. Dólar => Peso Colombiano
                6. Peso Colombiano => Dólar
                7. Dólar => Peso Mexicano
                8. Peso Mexicano => Dólar
                9. Salir
                ************************
                ---Ingrese una opción---
                """;

        while (true) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de dólares a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor de " + cantidad * convertidor.convertir("USD", "ARS") + " [ARS]");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de pesos argentinos a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [ARS] corresponde al valor de " + cantidad * convertidor.convertir("ARS", "USD") + " [USD]");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dólares a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor de " + cantidad * convertidor.convertir("USD", "BRL") + " [BRL]");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de reales brasileños a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [BRL] corresponde al valor de " + cantidad * convertidor.convertir("BRL", "USD") + " [USD]");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de dólares a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor de " + cantidad * convertidor.convertir("USD", "COP") + " [COP]");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de pesos colombianos a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [COP] corresponde al valor de " + cantidad * convertidor.convertir("COP", "USD") + " [USD]");
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad de dólares a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [USD] corresponde al valor de " + cantidad * convertidor.convertir("USD", "MXN") + " [MXN]");
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad de pesos mexicanos a convertir:");
                    cantidad = lectura.nextDouble();
                    System.out.println("El valor de " + cantidad + " [MXN] corresponde al valor de " + cantidad * convertidor.convertir("MXN", "USD") + " [USD]");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
