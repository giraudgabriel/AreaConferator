package edu.fatec.lp2.factory;

import edu.fatec.lp2.FiguraType;
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

public class FiguraFactory implements Factory<Calculable, FiguraType> {
	@Override
	public Calculable create(final FiguraType ft, Object... params) {
		Calculable obj = null;
		switch (ft) {
		case QUADRADO:
			obj = new Quadrado((double) params[0]);
			break;
		case RETANGULO:
			obj = new Retangulo((double) params[0], (double) params[1]);
			break;
		case CIRCULO:
			obj = new Circulo((double) params[0]);
			break;
		case TRIANGULO:
			obj = new Triangulo((double) params[0], (double) params[1]);
			break;
		case PARALELOGRAMA:
			obj = new Paralelograma((double) params[0], (double) params[1]);
			break;
		case TRAPEZIO:
			obj = new Trapezio((double) params[0], (double) params[1], (double) params[2]);
			break;
		case HEXAGONO:
			obj = new Hexagono((double) params[0]);
			break;
		case LOSANGO:
			obj = new Losango((double) params[0], (double) params[1]);
			break;
		case CUBO:
			obj = new Cubo((double) params[0]);
			break;
		case CILINDRO:
			obj = new Cilindro((double) params[0], (double) params[1]);
			break;
		case ESFERA:
			obj = new Esfera((double) params[0]);
			break;
		case PRISMA_TRIANGULAR:
			obj = new Prisma((double) params[0], (Paralelograma) params[1], (Triangulo) params[2]);
			break;
		case PIRAMIDE:
			obj = new Piramide((double) params[0], (double) params[1]);
			break;
		default:
			break;
		}
		return obj;
	}
}
