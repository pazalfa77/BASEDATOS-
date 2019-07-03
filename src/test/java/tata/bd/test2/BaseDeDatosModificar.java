package tata.bd.test2;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosModificar {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base =new BaseDeDatos();
		this.base.agregar(new Dato("A1","Data as"));
		this.base.agregar(new Dato("A2","Data as"));
		this.base.agregar(new Dato("A3","Data as"));
		this.base.agregar(new Dato("A4","Data as"));
		this.base.agregar(new Dato("A5","Data as"));
	                               	}

	

	@Test
	public void modificarDatosunoTrue() {
	 boolean resultado=	this.base.modificar(new Dato("A3","as"));
		assertTrue(resultado);
	}
	
	@Test
	public void cuandoNomodificarDatosunoFalse() {
	 boolean resultado=	this.base.modificar(new Dato("A6","as"));
		assertFalse(resultado);
	}

}
