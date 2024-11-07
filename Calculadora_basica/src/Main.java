/**
 * Clase principal para ejecutar la calculadora básica.
 *
 * Esta clase inicia la aplicación y permite a los usuarios realizar operaciones
 * aritméticas utilizando la clase Calculadora.
 *
 * @author Sergio Berrocoso Gomez
 * @version 1.0
 * @since 11/2024
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenido a la calculadora básica.");
        while (true) {
            System.out.print("Ingrese el primer número (o 'salir' para terminar): ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("salir")) {
                break;
            }
            
            // Verificar que el input no esté vacío
            if (input1.isEmpty()) {
                System.out.println("Por favor, ingrese un número válido.");
                continue; // Volver al inicio del bucle
            }
            
            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                continue; // Volver al inicio del bucle
            }

            System.out.print("Ingrese el segundo número: ");
            String input2 = scanner.nextLine();
            
            // Verificar que el input no esté vacío
            if (input2.isEmpty()) {
                System.out.println("Por favor, ingrese un número válido.");
                continue; // Volver al inicio del bucle
            }
            
            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                continue; // Volver al inicio del bucle
            }

            // Establecer los operandos en la calculadora
            calculadora.setOperandos(num1, num2);

            System.out.println("Seleccione la operación: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, seleccione una opción válida.");
                scanner.nextLine(); // Limpiar el buffer
                continue; // Volver al inicio del bucle
            }
            
            double resultado;

            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.restar();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar();
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    try {
                        resultado = calculadora.dividir();
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close();
    }
}
