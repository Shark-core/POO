class Persona {
   //metodo private
	private String nombre;
    private int edad;
    private String ciudad;
    private double altura;

	//declarion de atributos 
    public Persona(String nombre, int edad, String ciudad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.altura = altura;
    }
	
	//aqui el metod main
    public static void main(String[] args) {
        Persona person = new Persona("Baji", 25, "Tokio", 1.80);

        System.out.println("Nombre: " + person.nombre);
        System.out.println("Edad: " + person.edad);
        System.out.println("Ciudad: " + person.ciudad);
        System.out.println("Altura: " + person.altura);
    }
}