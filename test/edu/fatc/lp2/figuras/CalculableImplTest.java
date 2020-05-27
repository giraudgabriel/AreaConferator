package edu.fatc.lp2.figuras;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.fatec.lp2.figuras.Calculable;
import edu.fatec.lp2.figuras.Cilindro;
import edu.fatec.lp2.figuras.Circulo;
import edu.fatec.lp2.figuras.Cubo;
import edu.fatec.lp2.figuras.Esfera;
import edu.fatec.lp2.figuras.Hexagono;
import edu.fatec.lp2.figuras.Losango;
import edu.fatec.lp2.figuras.Paralelograma;
import edu.fatec.lp2.figuras.Piramide;
import edu.fatec.lp2.figuras.Prisma;
import edu.fatec.lp2.figuras.Quadrado;
import edu.fatec.lp2.figuras.Retangulo;
import edu.fatec.lp2.figuras.Trapezio;
import edu.fatec.lp2.figuras.Triangulo;

@RunWith(Parameterized.class)
public class CalculableImplTest {
		private Calculable cut;
		private double expectedResult;
	
		public CalculableImplTest(final Calculable pCut, final double pExpectedResult) {
			this.cut = pCut;
			this.expectedResult = pExpectedResult;
		}
		
		@Test
		public void testCalculoFigurasGeometricas() {
			Assert.assertEquals(expectedResult, cut.calcularArea(), 0.1);
		}
		
		 @Parameters(name= "{index}: {0} = expected: {2}")
	     public static Iterable<Object[]> data() {
	         return Arrays.asList(
	        		 new Object[][] { 
	        			 { new Circulo(2.0), 12.5 }, 
	        			 { new Cubo(2.5), 37.5 }, 
	        			 { new Hexagono(3.5), 31.8 },
	        			 { new Losango(4.5, 3.5), 7.8 }, 
	        			 { new Paralelograma(15.0,  7.5), 112.5 },
	        			 { new Quadrado(4.0), 16.0},
	        			 { new Retangulo(4.0, 2.0), 8.0},
	        			 { new Trapezio(4.0, 2.0, 3.0), 9.0},
	        			 { new Triangulo(4.0, 2.0), 4.0},
	        			 { new Cilindro(15.0, 7.0), 2073.4 },
	        			 { new Esfera(4.0), 201.0},
	        			 { new Prisma(3.0, new Paralelograma(12.0, 9.0), new Triangulo(9.0, 7.8)),394.2},
	        			 { new Piramide(4.0, 8.0), 80.0},
	        		 });
	     }
}
