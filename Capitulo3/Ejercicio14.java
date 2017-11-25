import java.util.Random;
    
/**
 * Craps
 */
public class Ejercicio14 {
    public static void main(String[] args) {
	int dado1, dado2, lleva;
	Random rand = new Random();
	dado1 = rand.nextInt(6) + 1;
	dado2 = rand.nextInt(6) + 1;
	if(dado1 + dado2 == 7 || dado1 + dado2 == 11)
	    System.out.println("Haz ganado tus dados sumaron " + (dado1 + dado2));
	else if(dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 11)
	    System.out.println("Haz perdido tus dados sumaron " + (dado1 + dado2));
	else {
	    System.out.println("Tus dados sumaron " + (dado1 + dado2) +
			       ", vuelves a tirar.");
	    lleva = dado1 + dado2;
	    dado1 = rand.nextInt(6) + 1;
	    dado2 = rand.nextInt(6) + 1;
	    if(lleva + dado1 + dado2 == 11)
		System.out.println("Tus dados sumaron " + (dado1 + dado2) +
				   ", eso mas la lanzada anterior da 11.\nHaz ganado");
	    else
		System.out.println("Haz perdido tus dados sumaron " + (dado1 + dado2) +
				   ", eso mas la lanzada anterior es distinto de 11.");
	}
    }
}
