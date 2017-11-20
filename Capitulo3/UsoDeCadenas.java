public class UsoDeCadenas {
    public static void main(String[] args) {
        String frase = "Una mosca parada en la pared";

        System.out.println("La frase :\"" + frase + "\" tiene " + frase.length() + " letras");
        System.out.println("Extraje la palabra :" + frase.substring(4,10));

        String otra = frase.toUpperCase().replace('E', 'A').replace('I', 'A');
        otra = otra.replace('O', 'A').replace('U', 'A');
        System.out.println("En mayusculas y con A: " + otra);

        otra = otra.replace('A', 'O').toLowerCase();
        System.out.println("Ahora en minusculas y con o: " + otra);

        String larga = frase.concat(" roja");
        System.out.println(larga + "\n" + frase);
    }
}