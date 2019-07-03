package tata.bd.test2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosEliminar {
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
	public void cuandoEliminaUnoTrue4() {
		this.base.eliminar("A1");
		int largo = this.base.listar().size();
		assertTrue(" es"+ largo+"Pero deberia ser 4",largo==4);
		
	}
	
	@Test
	public void cuandoEliminaUnoTrue() {
		boolean retorno=this.base.eliminar("A3");
		assertTrue(retorno);		
	}
	
	@Test
	public void cuandoNoEliminaFalse() {
		boolean retorno=this.base.eliminar("A6");
		assertFalse(retorno);		
	}

}
