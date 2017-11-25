import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String materno, paterno, nombre, mes, dia, año;
	System.out.println("Escribe tu apellido paterno:");
	paterno = input.next();
	System.out.println("Escribe tu apellido materno:");
	materno = input.next();
	System.out.println("Escribe tu nombre");
	nombre = input.next();
	System.out.println("Año de nacimiento(nnnn) :");
	año = input.next();
	System.out.println("Mes de nacimiento(nn) :");
	mes = input.next();
	System.out.println("Dia de nacimiento(nn) :");
	dia = input.next();
	materno = materno.toLowerCase();
	paterno = paterno.toLowerCase();
	nombre = nombre.toLowerCase();
	String rfc = paterno.substring(0,2) + materno.charAt(0) +
	    nombre.charAt(0) + año.substring(2) + mes + dia;
	System.out.println("Tu RFC es:\n" + rfc);
    }
}
