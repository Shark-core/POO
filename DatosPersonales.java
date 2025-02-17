class DatosPersonales {
	public static void main(String[] args) {
        final String NOMBRE = "Bryan Steven Martinez Mejia";
		final String CARNET = "25-1926-2024";

        System.out.println("Nombre: " + NOMBRE);
        System.out.println("Carnet: " + CARNET);

        int entero1 = 5;
        int entero2 = 36;
        double real1 = 1.14;
        double real2 = 10.71;
        boolean booleano = true;

        System.out.println("\nOperaciones:");
        System.out.println("Suma de enteros: " + (entero1 + entero2));
        System.out.println("Resta de reales: " + (real1 - real2));
        System.out.println("Comparación de booleano: " + (booleano == true));
    }
}
