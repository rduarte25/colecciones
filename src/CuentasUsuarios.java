import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cl1 = new Cliente("Rafael", "00001", 200000);
		Cliente cl2 = new Cliente("Abraham", "00002", 190000);
		Cliente cl3 = new Cliente("Luis", "00003", 180000);
		Cliente cl4 = new Cliente("David", "00004", 400000);
		Cliente cl5 = new Cliente("Rafael", "00007", 200000);
		
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		//for (Cliente cliente : clientesBanco) {
		//	System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		//	if (cliente.getNombre().equals("Rafael")) {
		//		clientesBanco.remove(cliente);
		//	}
		//}
		
		Iterator<Cliente> iterador = clientesBanco.iterator();
		
		while(iterador.hasNext()) {
			String nombre_cliente = iterador.next().getNombre();
			if (nombre_cliente.equals("Rafael")) {
				iterador.remove();
			}
		}
		
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getN_cuenta() + " " + cliente.getSaldo());
		}
		
		//Iterator<Cliente> iterador = clientesBanco.iterator();
		
		//while (iterador.hasNext()) {
		//	String nombreCliente = iterador.next().getNombre();
		//	System.out.println(nombreCliente);
		//}
	}

}
