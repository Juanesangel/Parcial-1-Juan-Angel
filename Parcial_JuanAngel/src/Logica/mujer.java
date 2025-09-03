package Logica;

public class mujer extends persona {
	public mujer(double altura,double peso, int edad) 
	{	
		super(altura, peso,edad);
	}

	@Override
	public double calcularTMB() throws Exception {
	    double tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);

	    if (this.peso <= 40 || this.peso >= 80 
	        || this.altura < 140 || this.altura >= 180 
	        || this.edad <= 15) {
	        throw new Exception("No se cumplen con las condiciones");
	    }

	    return tmb;
	}
}
