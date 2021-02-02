package Herencia;

public class Main {

	public static void main(String[] args) {
		
		//creamos nuestro objeto Fiat
		//(int kilometros, String color, float precio, String modelo, int patente) 
		Fiat palio=new Fiat("fire",396,200000,"rojo", 200000.8f);
		
		//POLIMORFISMO:
		Automovil palio2=new Fiat("weekend",358,100000,"negro",300500.5f);
		
		//OPCION 1 DE "MOSTRAR DATOS":
		palio.mostrarDatos();

		//OPCION 2 DE "MOSTRAR DATOS":

		palio.mostrarDatosDirecto();
		
		//METODO ABSTRACTO MODIFICADO
		palio.nivelDeDiseño();
	
		//METODO ABSTRACTO DE NUESTRO OBJETO (POLIMORFISMO)
		palio2.mostrarDatos();
		
	}

}
