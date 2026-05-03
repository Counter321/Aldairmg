public class Main {
    public static void main(String[] args) {
        System.out.println("Cálculo 1:");
        calcularYmostrarArea(5.0, 10.0);

        System.out.println("Cálculo 2:");
        calcularYmostrarArea(8.0, 3.0);
    }

    private static void calcularYmostrarArea(double baseRectangulo1, double alturaRectangulo1) {
        // Borra las líneas que repetían "double ..."
        double res1 = baseRectangulo1 * alturaRectangulo1;
        System.out.println("Área: " + res1);
    }
}
