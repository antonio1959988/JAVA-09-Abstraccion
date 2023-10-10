package Animal;

public class Perro extends Animal{ //Herencia de la clase superior animal

	//"Polimorfear" o sobreescribir el metodo heredado
	@Override //Con la anotacion override,le decimos a java que el metodo hacerSonido sera sobreescrito
	public void hacerSonido() {
			System.out.println("El perrito ladra y hace wau");
	} //metodo hacerSonido heredado de Animal
	
	public static void main(String[] args) {
		
		//Genera un animal generico abstracto (Aqui no hay polimorfismo ya que instancio un animal generico, y utilizo su metodo hacerSonido)
		Animal generico = new Animal();
		generico.hacerSonido(); //Antes de la ejecucion
		
		//Generar la instancia de mi perrito
		//Si hay polimorfismo porque es el equivalente a decir "instancia un animal que es un perrito"
		//Referenciar primero la clase general y luego la instancia particular, permito el polimorfismo
		Animal chilaquil = new Perro();
		chilaquil.hacerSonido(); //Polimorfismo en tiempo de ejecuccion
		
	}

} //cierre clase perro
