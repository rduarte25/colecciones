import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("1", new Empleado("Rafael"));
		personal.put("2", new Empleado("Abraham"));
		personal.put("3", new Empleado("Luis"));
		personal.put("4", new Empleado("David"));
		
		//System.out.println(personal);
		
		//personal.remove("3");
		
		//System.out.println(personal);
		
		//personal.put("4", new Empleado("Daniela"));
		
		//System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave = " + clave + " Valor = " + valor);
		}
		
	}

}

class Empleado {
	
	public Empleado (String nombre) {
		
		this.nombre = nombre;
		this.sueldo = 2000;
	}
	
	public String toString () {
		
		return "[Nombre "+nombre+" sueldo "+sueldo+"]";
	}
	
	private String nombre;
	private double sueldo;
}
