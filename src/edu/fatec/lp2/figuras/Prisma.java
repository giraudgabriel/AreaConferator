package edu.fatec.lp2.figuras;

public class Prisma implements Calculable {
	private double nLados;
	private Calculable type;
	private Paralelograma paralelograma;

	public Prisma(final double pNLados, final Paralelograma pParalelograma, final Calculable pType) {
		nLados = pNLados;
		type = pType;
		paralelograma = pParalelograma;
	}

	@Override
	public double calcularArea() {
		double areaLateral = nLados * paralelograma.calcularArea();

		return (2 * type.calcularArea()) + areaLateral;
	}

}
