package Logica;

public class hombre extends persona {
	
	public hombre(double altura,double peso, int edad) 
	{	
		super(altura, peso,edad);
	}

	@Override
	public double calcularTMB() throws Exception {
	    double tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);

	    if (this.peso <= 60 || this.peso >= 110 
	        || this.altura < 160 || this.altura >= 195 
	        || this.edad <= 15) {
	        throw new Exception("No se cumplen con las condiciones");
	    }

	    return tmb;
	}
	}
	
