public class Mensaje {
    private String mensaje;
    public Mensaje() { mensaje = ""; }
    public Mensaje(String x) { mensaje = x; }
    public String obtenerMensaje() { return mensaje; }
    public void asignarMensaje(String m) { mensaje = m; }
    public String toString() { return mensaje; }

    static public class PruebaMensaje {
        public static void main(String[] args) {
            Mensaje uno = new Mensaje("Primera parte");
            Mensaje dos = new Mensaje(" Segunda parte. :)");
            System.out.println(uno.toString() + dos.toString() );
        }
    }
}