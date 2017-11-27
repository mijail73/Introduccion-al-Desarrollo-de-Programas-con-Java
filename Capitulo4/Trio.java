public class Trio {
    private int x, y, z;
    public Trio() { x = 0; y = 0; z = 0; }
    public Trio(int a, int b, int c) { x = a; y = b; z = c; }
    //Escribir un constructor de copia
    public Trio(Trio t) { x = t.x; y = t.y; z = t.z; }
    //Escribir un metodo esLaSuma() que devuelva verdadero si cualquiera de los
    //elementos del trio es la suma de los otros dos y falso en otro caso.
    public boolean esLaSuma() {
        return ( x == y + z || y == x + z || z == x + y);
    }
    // SOlo para probar
    public static void main(String[] args) {
        Trio test = new Trio(3, 3, 6);
        System.out.println(test.esLaSuma());
    }
}