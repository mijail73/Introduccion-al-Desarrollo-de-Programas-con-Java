/**
 * Calculadora de numeros racionales
 * Ejercicio15 es sinonimo de NUmero Racional
 */
public class Ejercicio15 {
    private int numerador;
    private int denominador;

    public void setNumerador(int numerador) {
	this.numerador = numerador;
    }

    public int getNumerador() {
	return numerador;
    }

    public void setDenominador(int denominador) {
	this.denominador = denominador;
    }

    public int getDenominador() {
	return denominador;
    }

    public Ejercicio15(int numerador, int denominador) {
	setNumerador(numerador);
	setDenominador(denominador);
    }

    public Ejercicio15() {
	setNumerador(0);
	setDenominador(1);
    }

    public String toString() {
	return getNumerador() + "/" + getDenominador();
    }

    public Ejercicio15 suma(Ejercicio15 b) {
	Ejercicio15 suma = new Ejercicio15();
	suma.setNumerador(getNumerador() * b.getDenominador() +
			  b.getNumerador() * getDenominador());
	suma.setDenominador(getDenominador() * b.getDenominador());
	return suma;
    }

    public Ejercicio15 resta(Ejercicio15 b) {
	Ejercicio15 resta = new Ejercicio15();
	resta.setNumerador(getNumerador() * b.getDenominador() -
			  b.getNumerador() * getDenominador());
	resta.setDenominador(getDenominador() * b.getDenominador());
	return resta;
    }

    public Ejercicio15 multiplicacion(Ejercicio15 b) {
	Ejercicio15 multiplicacion = new Ejercicio15();
	multiplicacion.setNumerador(getNumerador() * b.getNumerador());
	multiplicacion.setDenominador(getDenominador() * b.getDenominador());
	return multiplicacion;
    }

    public Ejercicio15 division(Ejercicio15 b) {
	Ejercicio15 division = new Ejercicio15();
	division.setNumerador(getNumerador() * b.getDenominador());
	division.setDenominador(getDenominador() * b.getNumerador());
	return division;
    }
}
