public class main {

    public static void main(String args[]){
        int x=5, y=3;
        mostrarResultadoDe(Operacion.sumarLosValores(x, y));
        mostrarResultadoDe(Operacion.restaLosValores(x, y));
    }

    private static void mostrarResultadoDe(int resultado) {
        System.out.println(resultado);
    }
}
