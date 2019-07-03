package tata.bd;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class APP {

	public static void main(String[] args) {
		BaseDeDatos base=new BaseDeDatos();
		base.agregar(new Dato("c1", "DATA c1"));
		base.agregar(new Dato("c3", "DATA c2"));
		base.agregar(new Dato("c2", "DATA c3"));
		
		System.out.println("Listado:" + base.listar());
		
		
		
		base.eliminar("c3");
		base.modificar(new Dato("c1", "otra dato"));
		System.out.println("Lisado" + base.listar ());
	}

}
