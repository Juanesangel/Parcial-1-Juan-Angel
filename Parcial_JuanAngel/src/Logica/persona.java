package Logica;

public abstract class persona {
	protected double altura;
	protected double peso;
	protected int edad;
	
	public double getaltura() {
		return altura;	
	}
	public double getpeso() {
		return peso;
	}
	public double getedad() {
		return edad;
	}
	public  persona(double altura,double peso,int edad) {
		this.altura=altura;
		this.peso=peso;
		this.edad=edad;
	}
	public abstract double calcularTMB() throws Exception;
}
