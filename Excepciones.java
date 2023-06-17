// crea una clase excepcion para el manejo de errores que extienda de la clase Exception
public class Excepciones extends Exception {

    // constructor de la clase
    public Excepciones(String mensaje) {

        // invoca al constructor de la clase padre
        super(mensaje);
    
    }

     public static int convertirNumero(String input) throws NumberFormatException {
        int numero = Integer.parseInt(input);
        if(numero < 0) {
            throw new NumberFormatException("Error: El número ingresado es negativo.");
        } 
        return numero;
    }

    public static int dividirNumero(int numero) throws ArithmeticException {
        int resultado = 10 / numero;
        return resultado;
    }
}