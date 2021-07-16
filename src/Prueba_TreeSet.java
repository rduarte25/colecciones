import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//TreeSet<String> treeset = new TreeSet<String>();
		
		//treeset.add("Rafael");
		//treeset.add("Abraham");
		//treeset.add("Luis");
		
		//for (String string : treeset) {
		//	System.out.println(string);
		//}
		
		TreeSet<Articulo> articulos = new TreeSet<Articulo>();
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(2, "Segundo Articulo");
		Articulo tercer = new Articulo(13, "Este es el tercer articulo");
		
		articulos.add(segundo);		
		articulos.add(primero);		
		articulos.add(tercer);
		
		for (Articulo articulo : articulos) {
			System.out.println(articulo.getDescripcion());
		}
		
		
		//Articulo comparadorArticulo = new Articulo();
		
		//TreeSet<Articulo> articulos2 = new TreeSet<Articulo>(comparadorArticulo);
		
		//articulos2.add(segundo);
		//articulos2.add(primero);		
		//articulos2.add(tercer);
		
		//for (Articulo articulo : articulos2) {
		//	System.out.println(articulo.getDescripcion());
		//}
		
		//ComparadorArticulo compara_art = new ComparadorArticulo();
		
		TreeSet<Articulo> articulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
			@Override
			public int compare(Articulo arg0, Articulo arg1) {
				// TODO Auto-generated method stub
				
				String descripcionA = arg0.getDescripcion();
				String descripcionB = arg1.getDescripcion();
				return descripcionA.compareTo(descripcionB);
			}
		});
		
		articulos2.add(segundo);
		articulos2.add(primero);		
		articulos2.add(tercer);
		
		for (Articulo articulo : articulos2) {
			System.out.println(articulo.getDescripcion());
		}
		
	}	

}


class Articulo implements Comparable<Articulo> /*,Comparator<Articulo>*/{
	
	/*
	public Articulo () {
		
	}*/
	
	public Articulo (int numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}

	
	public String getDescripcion (){
		return descripcion;
	}
	
	@Override
	public int compareTo(Articulo arg0) {
		// TODO Auto-generated method stub
		return numero - arg0.numero;
	}
	
	private int numero;
	private String descripcion;
	/*
	@Override
	public int compare(Articulo arg0, Articulo arg1) {
		// TODO Auto-generated method stub
		
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}*/
}


class ComparadorArticulo implements Comparator<Articulo> {
	
	
	@Override
	public int compare(Articulo arg0, Articulo arg1) {
		// TODO Auto-generated method stub
		
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
}





