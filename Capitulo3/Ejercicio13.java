import java.util.Random;
import java.util.Scanner;

/**
 * Escribir un programa para que jueguen disparejos entre tres jugadores, uno de
 * ellos es la computadora. El juego consiste en que cada jugador lanza su moneda
 * al aire y gana el jugador cuya cara visible de la moneda sea distinta de la cara
 * visible de cada una de las otras dos monedas.
 */
public class Ejercicio13 {

    /**
     * Clase anidada auxiliar para modelar Monedas y con el metodo lanzar.
     */
    class Moneda {
	private String valor;

	public String getValor() {
	    return this.valor;
	}

	public void setValor(String valor) {
	    this.valor = valor;
	}

	public void lanzar() {
	    Random rand = new Random();
	    int n = rand.nextInt(100) + 1;
	    if(n <= 50)
		this.setValor("cara");
	    else
		this.setValor("cruz");
	}
    }

    private Moneda uno = new Moneda(), dos = new Moneda(), tres = new Moneda();
    private String jugador1, jugador2;
    
    public void inicio(){
	Scanner input = new Scanner(System.in);
	System.out.println("Ingresa el nombre del Jugador 1:");
	jugador1 = input.nextLine();
	System.out.println("Ingresa el nombre del Jugador 2:");
	jugador2 = input.nextLine();
	System.out.println("El Jugador 3 sera la computadora.");
    }

    public String disparejos() {
	uno.lanzar();
	dos.lanzar();
	tres.lanzar();
	int n = 0;
	String resultado = "";
	while(n != 2) {
	    if(uno.getValor() != dos.getValor() && uno.getValor() != tres.getValor()) {
		n = 2;
		resultado = jugador1;
	    } else if(dos.getValor() != uno.getValor() && dos.getValor() != tres.getValor()) {
		n = 2;
		resultado = jugador2;
	    } else {
		n = 2;
		resultado = "Computadora";
	    }
	}
	return resultado;
    }

    public static void main(String[] args) {
	Ejercicio13 test = new Ejercicio13();
	test.inicio();
	System.out.println("Las monedas se han lanzado");
	System.out.println("El ganador es: " + test.disparejos());
    }
}
