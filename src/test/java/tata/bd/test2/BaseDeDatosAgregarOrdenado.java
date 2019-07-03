package tata.bd.test2;

import static org.junit.Assert.*;

import java.util.Iterator;


import org.junit.Before;
import org.junit.Test;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class BaseDeDatosAgregarOrdenado {
	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base =new BaseDeDatos();
		
		
	}
	
	@Test
	public void CuandoElprimerDatoEsAgregadoesTrue() {
		boolean retorno = this.base.agregar(new Dato("A1","Data as"));
		assertTrue("Retorna " + retorno + " NO agregó objeto", retorno);
	}

	@Test
	public void CuandoordenarporIdEsTrue(){
		this.base =new BaseDeDatos();
		this.base.agregar(new Dato("A1","Data as"));
		this.base.agregar(new Dato("A3","Data as"));
		this.base.agregar(new Dato("A6","Data as"));
		this.base.agregar(new Dato("A5","Data as"));
		this.base.agregar(new Dato("A2","Data as"));
		
		Iterator<Dato> ite = this.base.listar().iterator();
		String siId = "";
		boolean resultado = true;
		while(ite.hasNext()) {
			String RetornaID = ite.next().getId();
			if(siId.compareTo(RetornaID)>0) {
				resultado = false;
				break;
			}else
				siId =RetornaID ;
		}
		assertTrue("Muestra falso " + resultado + " No ordenado", resultado);
	}
	

}
