import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Ejercicio20 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	System.out.println("¿Cual es su nombre?");
	String nombre = in.nextLine();
	int edad = 0;
	Double peso = 0.0;
	boolean apagador = true;

	while(apagador) {
	    try {
		System.out.println("¿Cual es su edad?");
		edad = in.nextInt();
		if(edad < 2 || edad > 100) {
		    System.out.println("Ingresa una edad valida.");
		    apagador = true;
		} else
		    break;
	    } catch (InputMismatchException e) {
		System.out.println("Ingrese una edad valida.");
		apagador = true;
	    }
	    in.nextLine();// clears the buffer
	}

	while(apagador) {
	    try {
		System.out.println("Cual es su peso(Kg)?");
		peso = in.nextDouble();
		if(peso < 10 || peso > 150) {
		    System.out.println("Ingresa un peso adecuado.");
		    apagador = true;
		} else
		    break;
	    } catch (InputMismatchException e) {
		System.out.println("Ingrese su peso con decimas");
		apagador = true;		
	    }
	    in.nextLine();// clears the buffer
	}

	Ejercicio20 test = new Ejercicio20();
	Ejercicio20.etapa1();
    }

    public static void etapa1() {
	Scanner n = new Scanner(System.in);
	String respuesta;
	while(true) {
	    System.out.println("Tiene fiebre?");
	    respuesta = n.next();
	    if(respuesta.equals("no")) {
		System.out.println("Informacion insuficiente");
		break;
	    } else if(respuesta.equals("si")) {
		System.out.println("¿Tos?");
		respuesta = n.next();
		etapa2(respuesta);
		break;
	    } else {
		System.out.println("Ingrese: si ó no");
		continue;
	    }
	}
    }

    public static void etapa2(String opcion) {
	Scanner in = new Scanner(System.in);
	String respuesta;
	boolean apagador = true;
	while(apagador) {
	    if(opcion.equals("si")) {
		while(true) {
		    System.out.println("¿Dificultad para respirar o" +
				       " tos con flemas?");
		    respuesta = in.next();
		    if(respuesta.equals("si")) {
			System.out.println("Posible neumonia o infeccion en " +
					   "las vias aereas.");
			apagador = false;
			break;
		    } else if(respuesta.equals("no")) {
			while(true) {
			    System.out.println("¿Dolor de cabeza?");
			    respuesta = in.next();
			    if(respuesta.equals("si")) {
				System.out.println("Posible infeccion viral.");
				break;
			    } else if(respuesta.equals("no")) {
				etapa4();
				break;
			    } else {
				System.out.println("Ingrese: si ó no");
				continue;
			    }
			}
			apagador = false;
			break;
		    } else {
			System.out.println("Ingrese: si ó no");
			continue;
		    }
		}
	    } else if(opcion.equals("no")) {
		etapa3();
		break;
	    } else {
		System.out.println("Ingrese: si ó no");
		System.out.println("¿Tos?");
		opcion = in.next();
		continue;
	    }
	}
    }

    public static void etapa3() {
	Scanner in = new Scanner(System.in);
	String respuesta;
	System.out.println("¿Dolor de cabeza?");
	do {
	    respuesta = in.next();
	    if(respuesta.equals("no")) {
		etapa4();
		break;
	    } else if(respuesta.equals("si")) {
		System.out.println("¿Nauseas, vomito, somnolencia o" +
				   " confusion?");
		do {
		    respuesta = in.next();
		    if(respuesta.equals("si")) {
			System.out.println("Posible meningitis.");
			break;
		    }else if(respuesta.equals("no")) {
			System.out.println("¿Diarrea?");
			do {
			    respuesta = in.next();
			    if(respuesta.equals("no")) {
				etapa4();
				break;
			    } else if(respuesta.equals("si")) {
				System.out.println("Posible infeccion en el tracto"
						   + " digestivo.");
				break;
			    } else {
				System.out.println("Ingrese: si ó no");
				System.out.println("¿Diarrera?");
			    }
			} while(!respuesta.equals("si") || !respuesta.equals("no"));
			break;
		    } else {
			System.out.println("Ingrese: si ó no");
			System.out.println("¿Nauseas, vomito, somnolencia o" +
					   " confusion?");
		    }
		} while(!respuesta.equals("si") || !respuesta.equals("no"));
		break;
	    } else {
		System.out.println("Ingrese: si ó no");
		System.out.println("¿Dolor de cabeza?");		
	    }
	} while(!respuesta.equals("si") || !respuesta.equals("no"));
    }

    public static void etapa4() {
	Scanner in = new Scanner(System.in);
	String respuesta;
	System.out.println("¿Dolor de los huesos o de las articulaciones?");
	do {
	    respuesta = in.next();
	    if(respuesta.equals("si")) {
		System.out.println("Posible infeccion viral");
		break;
	    } else if(respuesta.equals("no")) {
		do {
		    System.out.println("¿Comezón?");
		    respuesta = in.next();
		    if(respuesta.equals("si")) {
			System.out.println("Informacion insuficiente");
			break;
		    } else if(respuesta.equals("no")) {
			do {
			    System.out.println("¿Dolor de Garganta?");
			    respuesta = in.next();
			    if(respuesta.equals("si")) {
				System.out.println("Posible infeccion en" +
						   " la garganta?");
				break;
			    } else if(respuesta.equals("no")) {
				do {
				    System.out.println("¿Dolor en la espalda," +
						       " arriba de la cintura" +
						       " con resfriado?");
				    respuesta = in.next();
				    if(respuesta.equals("si")) {
					System.out.println("Posible infeccion"
							   + " renal");
					break;
				    } else if(respuesta.equals("no")) {
					System.out.println("Consulte a su medico");
					break;
				    } else
					System.out.println("Ingrese: si ó no");
				} while(!respuesta.equals("si") ||
					!respuesta.equals("no"));
				break;
			    } else {
				System.out.println("Ingrese: si ó no");
			    }
			} while(!respuesta.equals("si") || !respuesta.equals("no"));
			break;
		    } else {
			System.out.println("Ingrese: si ó no");
		    }
		} while(!respuesta.equals("si") || !respuesta.equals("no"));
		break;
	    } else {
		System.out.println("Ingrese: si ó no");
		System.out.println("¿Dolor de los huesos o de las articulaciones?");
	    } 
	} while(!respuesta.equals("si") || !respuesta.equals("no"));
    }
}
