/**
 * Clase que representa una calculadora b�sica.
 * Esta clase permite realizar operaciones aritm�ticas como suma,
 * resta, multiplicaci�n y divisi�n.
 * * @author Sergio Berrocoso Gomez
 * @version 1.0
 * @since 11/2024
 */
public class Calculadora {
    
    private double operando1;
    private double operando2;

    /**
     * Establece los operandos para las operaciones.
     *
     * @param operando1 El primer operando.
     * @param operando2 El segundo operando.
     */
    public void setOperandos(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Suma los dos operandos.
     *
     * @return La suma de operando1 y operando2.
     */
    public double sumar() {
        return operando1 + operando2;
    }

    /**
     * Resta operando2 de operando1.
     * @return La resta de operando1 y operando2.
     */
    public double restar() {
        return operando1 - operando2;
    }

    /**
     * Multiplica los dos operandos.
     * @return El producto de operando1 y operando2.
     */
    public double multiplicar() {
        return operando1 * operando2;
    }

    /**
     * Divide operando1 entre operando2.
     *
     * @return El cociente de operando1 y operando2.
     * @throws ArithmeticException Si operando2 es cero.
     */
    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return operando1 / operando2;
    }
}
