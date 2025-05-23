package br.com.valmir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe SimpleMath")
class SimpleMathTest {

	SimpleMath math = new SimpleMath();

	@Test
	@DisplayName("Teste de soma: 8 + 2 = 10")
	void testSum_EightAddTwoEqualTen() {
		assertEquals(10D, math.sum(8D, 2D));
	}

	@Test
	@DisplayName("Teste de subtração: 10 - 4 = 6")
	void testSub_TenMinusFourEqualsSix() {
		assertEquals(6D, math.sub(10D, 4D));
	}

	@Test
	@DisplayName("Teste de multiplicação: 3 * 5 = 15")
	void testMult_ThreeTimesFiveEqualsFifteen() {
		assertEquals(15D, math.mult(3D, 5D));
	}

	@Test
	@DisplayName("Teste de divisão: 20 / 4 = 5")
	void testDiv_TwentyDividedByFourEqualsFive() {
		assertEquals(5D, math.div(20D, 4D));
	}

	@Test
	@DisplayName("Teste de divisão por zero")
	void testDiv_DivisionByZeroThrowsException() {
		assertThrows(ArithmeticException.class, () -> math.div(10D, 0D));
	}
}
