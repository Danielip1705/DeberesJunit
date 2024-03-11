package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

	@ParameterizedTest
	@MethodSource("magico")
	void testEsMagica(int[][] tabla, boolean expected) {
		Tablas tab = new Tablas();

		boolean result = tab.esMagica(tabla);
		assertEquals(expected, result);
	}

	private static Stream<Arguments> magico() {
		return Stream.of(
				Arguments.of(new int[][] { { 3, 5, 5 }, { 5, 3, 5 }, { 5, 5, 3 } },true),
				Arguments.of(new int[][] {{1,1,1},{2,2,2},{3,3,3}},false),
				Arguments.of(new int[][] {{1,2,3},{1,2,3},{1,2,3}},true)
				
		);
	}

	@ParameterizedTest
	@MethodSource("gira90")
	void testGira90(int tablaInicio[][], int[][] expected) {
		Tablas tab = new Tablas();

		int[][] result = tab.gira90(tablaInicio);

		assertArrayEquals(expected, result);
	}

	private static Stream<Arguments> gira90() {
		return Stream.of(
				
				Arguments.of(null,null),
				
				Arguments.of(new int[2][1],null),
				
				Arguments.of(new int[][] {{1,2,3},{4,5,6},{7,8,9}},
							new int[][] {{7,4,1},{8,5,2},{9,4,1}})
				
				
					
		);

	}
}
