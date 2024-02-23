package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("primo")
	void testEsPrimo(int numero, boolean expected) {

		Numeros num = new Numeros(numero);
		boolean esperado = num.esPrimo();
		assertEquals(expected, esperado);
	}

	private static Stream<Arguments> primo() {
		return Stream.of(Arguments.of(1, false), 
				
				Arguments.of(4, false), 
				
				Arguments.of(5, true), 
				
				Arguments.of(2, true),
				
				Arguments.of(16,false)
				);
	}

	@ParameterizedTest
	@MethodSource("capicua")
	void testEsCapicua(Boolean esperado, int numero) {

		Numeros num = new Numeros(numero);

		boolean resultado = num.esCapicua();

		assertEquals(esperado, resultado);

	}

	private static Stream<Arguments> capicua() {

		return Stream.of(

				Arguments.of(false, 12),

				Arguments.of(true, 121),

				Arguments.of(true, 0),

				Arguments.of(false, 243)

		);

	}

}
