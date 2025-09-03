package presentacion;
import Logica.hombre;
import Logica.mujer;
import Logica.persona;
public class consola {
	public consola() throws Exception{
		base();
	}
	private void base() throws Exception {
		persona persona;
		persona = new hombre(180,60,45);
		System.out.println(persona.calcularTMB());
		persona = new mujer(180,60,45);
		System.out.println(persona.calcularTMB());
	}	
	public static void main(String[] args) throws Exception {
		new consola();
	}
}
