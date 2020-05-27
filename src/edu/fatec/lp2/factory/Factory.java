package edu.fatec.lp2.factory;

public interface Factory<R, T> {
	R create(final T ft, Object... params);
}
