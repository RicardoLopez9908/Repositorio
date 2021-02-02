package Herencia;

//usamos "extends" para declarar a "Fiat" como SUBCLASE/CLASE HIJA de "Automovil"
public class Fiat extends Automovil {
	
//ATRIBUTOS:	
private String modelo;
private int patente;
	
	
	//CONSTRUCTOR:
	public Fiat(String modelo,int patente,int kilometros,String color,float precio) {
		//usamos "super" para utilizar el mismo constructor que la clase Automovil, en los atributos que sean iguales
		super(kilometros, color, precio);
		this.modelo=modelo;
		this.patente=patente;	
	}
	
	//Sobreescribimos el metodo abstracto de la superclase y lo adaptamos a esta clase
	public void nivelDeDiseño() {
		System.out.println("El nivel de diseño de esta marca es de 7/10 ");;
	}

	//GETTER:
	public void getModelo(String modelo) {
		this.modelo=modelo;
	}
	
	//GETTER:
	public void getPatente(int patente) {
		this.patente=patente;
	}
	
	//"MOSTRAR DATOS" tradicional:
	public void mostrarDatos() {
		System.out.println("kilometros: "+getKilometros()+
				"\ncolor: "+getColor()+
				"\nprecio: "+getPrecio()+
				"\nmodelo: "+modelo+
				"\npatente: "+patente);
	}
	
	//"MOSTRAR DATOS" aprovechando la declaracion "protected":
	public void mostrarDatosDirecto() {
		System.out.println("kilometros:"+ kilometros
				+ "\ncolor:"+ color
				+ "\nprecio:"+ precio
				+ "\nmodelo:"+ modelo
				+ "\npatente:"+ patente);
	}
	
}


