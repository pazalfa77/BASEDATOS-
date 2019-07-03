package tata.bd.test2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosListar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base =new BaseDeDatos();
	}

	

	@Test
	public void test() {
		int largo = this.base.listar().size();
		assertTrue(" es"+ largo+"Pero deberia ser 0",largo==0);
	}
	
	@Test
	public void cuantoAgrega1EnotncesListaSize1() {
		this.base.agregar(new Dato("A1", "Datoss"));
		int largo = this.base.listar().size();
		assertTrue(" es"+ largo+"Pero deberia ser 1",largo==1);
	}
	

	@Test
	public void cuantoAgrega5EnotncesListaSize5() {
		this.base.agregar(new Dato("A1", "Datos"));
		this.base.agregar(new Dato("A3", "Datos"));
		this.base.agregar(new Dato("A2", "Datos"));
		this.base.agregar(new Dato("A4", "Datos"));
		this.base.agregar(new Dato("A5", "Datos"));
		int largo = this.base.listar().size();
		assertTrue(" es"+ largo+"Pero deberia ser 5",largo==5);
	}
	
	

}
