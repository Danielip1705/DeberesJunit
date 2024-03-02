package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int num, int expected) {
		FuncionesRecursivas fun = new FuncionesRecursivas();

		int result = fun.sumatorio(num);

		assertEquals(expected, result);
	}

	private static Stream<Arguments> sumatorio() {
		return Stream.of(

				Arguments.of(1, 1),

				Arguments.of(2, 3)
				
				);
	}

	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(double a, int n, double expected) {
		FuncionesRecursivas fun = new FuncionesRecursivas();

		double result = fun.potencia(a, n);

		assertEquals(expected, result);
	}

	private static Stream<Arguments> potencia() {
		return Stream.of(

				Arguments.of(5,0,1),

				Arguments.of(3,3,27)
				
				);
	}

	@ParameterizedTest
	@MethodSource ("fibonnaci")
	void testFibonacci(int num, int expected) {
		FuncionesRecursivas fun = new FuncionesRecursivas();
		
		int result = fun.fibonacci(num);
		assertEquals(expected, result);
		
	}
	
	private static Stream<Arguments> fibonnaci(){
		
		return Stream.of(
				
				Arguments.of(1,1),
				
				Arguments.of(2,1),
				
				Arguments.of(5,5)
				
				);
				
	}

}
