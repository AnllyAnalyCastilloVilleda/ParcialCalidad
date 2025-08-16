public class main {
    public static void main(String[] args) {
        Calculadoras2 calc = new Calculadoras2();

        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Multiplicación: " + calc.multiplicar(6, 7));
        System.out.println("División: " + calc.dividir(20, 4));

        System.out.println("Historial: " + calc.obtenerHistorial());
        System.out.println("Promedio: " + calc.promedioHistorial());
    }
}
