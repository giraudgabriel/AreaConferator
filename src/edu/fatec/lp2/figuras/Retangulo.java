package edu.fatec.lp2.figuras;

public class Retangulo implements Calculable {
	private double ladoA;
	private double ladoB;
	
	public Retangulo(final double pLadoA, final double pLadoB) {
		ladoA = pLadoA;
		ladoB = pLadoB;
	}

	@Override
	public double calcularArea() {
		return ladoA * ladoB;
	}
	
}
