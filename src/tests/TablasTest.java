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
	    @MethodSource("provideMatrices")
	    void testEsMagica(int[][] tabla, boolean expected) {
			Tablas tab = new Tablas();
			
			boolean result = tab.esMagica(tabla);
	        assertEquals(expected,result);
	    }

	    private static Stream<Arguments> provideMatrices() {
	        return Stream.of(
	        		
	            Arguments.of(new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}, true),
	            
	            Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, false),
	            
	            Arguments.of(new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}}, true),
	            
	            Arguments.of(new int[][]{{1}}, true)
	        		);
	    }

	@ParameterizedTest
	@MethodSource ("gira90")
	void testGira90(int tablaInicio[][],int[][] expected) {
		Tablas tab = new Tablas();
		
		int [][] result = tab.gira90(tablaInicio);
		
		assertArrayEquals(expected, result);
	}

	
	private static Stream<Arguments> gira90(){
		 return Stream.of(
		            Arguments.of(new int[][]{{1}},
		                          new int[][]{{1}}),
		       
		            Arguments.of(new int[][] {{1,2},{3,4}},
		            		
		            			new int[][]{{3,1},{4,2}}),
		            
		            Arguments.of(null,null)
		            
		        );
				
	}
}
