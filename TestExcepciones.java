import java.util.Scanner;

public class TestExcepciones {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un número entero: ");
            String input = scanner.nextLine();


            try {
                int numero = Excepciones.convertirNumero(input);
                int resultado = Excepciones.dividirNumero(numero);
                System.out.println("El resultado de la división es: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Error: El valor ingresado no es un número entero.");
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            } finally {
                System.out.println("Fin del programa.");
            }
        }
    
    }
}
