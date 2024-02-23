package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource ("cuentaEspacio")
	void testCuentaEspacios(String frase,int espacios) {
		Cadenas cad = new Cadenas(frase);
		
		int num=cad.cuentaEspacios();
		assertEquals(espacios, num);
		
	}
	private static Stream<Arguments> espacio(){
		return Stream.of(
				Arguments.of("Hola a",1),
				Arguments.of("Hola a todos",3)
				
				);
	}
	
	

	
	
	@Test
	void testDelReves() {
		fail("Not yet implemented");
	}

	
	
	@Test
	void testContarPalabra() {
		fail("Not yet implemented");
	}

}
