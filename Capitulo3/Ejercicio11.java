import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("¿Como se encuentra?");
	String entrada = input.nextLine();
	System.out.println("¿Por qué dice '" + entrada + "'?");
	input.nextLine();
	System.out.println("Muy interesante, hablaremos de ello con mas" +
			   " detalle en la siguiente sesión.");
    }
}
