package pruebasVomstar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import vomistr.Ejecutivo;
import vomistr.Vomistr;

class VmstrTest {

	@Test
	void testEjecutivo() {
	//para lograr este test se debe generar un getter del array	
		Vomistr.inicializarObjetos();
		int cantidadEjecutivos = Vomistr.getEjecutivos().size();
		assertEquals(2,cantidadEjecutivos);
		
	}
}
