package edu.fatec.lp2.figuras;

public class Cilindro implements Calculable {
	private double raio;
	private double altura;

	public Cilindro(final double cRaio, final double cAltura) {
		raio = cRaio;
		altura = cAltura;
	}

	@Override
	public double calcularArea() {
		return 2.0 * Math.PI * raio * (raio + altura);
	}
}
