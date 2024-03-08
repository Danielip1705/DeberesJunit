package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource ("espacio")
	void testCuentaEspacios(String frase,int espacios) {
		Cadenas cad = new Cadenas(frase);
		
		int num=cad.cuentaEspacios();
		assertEquals(espacios, num);
		
	}
	private static Stream<Arguments> espacio(){
		return Stream.of(
				Arguments.of("",0),
				Arguments.of("Hola a todos",2),
				Arguments.of("Hola",0)
				);
	}
	

	@ParameterizedTest
	@MethodSource ("reves")
	void testDelReves(String frase,String res) {
		Cadenas cad = new Cadenas(frase);
		
		String result = cad.delReves();
		
		assertEquals(res, result);
	}

	private static Stream<Arguments> reves(){
		return Stream.of(
				Arguments.of("Hola","aloH"),
				Arguments.of("Fotosintesis","sisetnisotoF")
				);
	}
	
	
	@ParameterizedTest
	@MethodSource ("contar")
	void testContarPalabra(String frase,String palabra,int expected) {
	Cadenas cad = new Cadenas(frase);
	
	int result = cad.contarPalabra(palabra);
	
	assertEquals(expected, result);
	
	}

	private static Stream<Arguments> contar(){
		return Stream.of(
				Arguments.of("Hola a todos","Hola",1),
				Arguments.of("Hola a todos","dani",0)
				);
	}
	
}
