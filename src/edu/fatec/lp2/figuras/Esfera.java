package edu.fatec.lp2.figuras;

public class Esfera implements Calculable {
	private double raio;

	public Esfera(final double eRaio) {
		raio = eRaio;
	}

	@Override
	public double calcularArea() {
		Circulo c = new Circulo(raio);
		return 4.0 * c.calcularArea();
	}

}
