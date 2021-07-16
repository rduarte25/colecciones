import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Rafael");
		personas.add("Abraham");
		personas.add("Luis");
		personas.add("David");
		
		ListIterator<String> iterador = personas.listIterator();
		
		iterador.next();
		
		iterador.add("Daniela");
		
		System.out.println(personas.size());
		
		for (String string : personas) {
			System.out.println(string);
		}
	}

}
