package edu.fatec.lp2.figuras;

public class Piramide implements Calculable {
	private double base;
	private double altura;

	public Piramide(final double pBase, final double pAltura) {
		base = pBase;
		altura = pAltura;
	}

	@Override
	public double calcularArea() {
		return (base * base) + (((4 * base) / 2) * altura);
	}
}
