package Herencia;

public abstract class Automovil {

//ATRIBUTOS:	
	//declaramos que nuestros atributos son del tipo "protected", para que nuestra subclase pueda acceder a su contenido.
protected int kilometros;
protected String color;
protected float precio;


//CONSTRUCTOR:
public Automovil(int kilometros, String color, float precio) {
	this.kilometros=kilometros;
	this.color=color;
	this.precio=precio;
}

//METODO ABSTRACTO (SUPER CLASE)
public abstract void nivelDeDiseño();


//METODO ABSTRACTO (SUPER CLASE)
public abstract void mostrarDatos();

//GETTER:
public int getKilometros(){
	return kilometros;
}

//GETTER:
public String getColor() {
	return color;
}

//GETTER:
public float getPrecio() {
	return precio;
}

	}


