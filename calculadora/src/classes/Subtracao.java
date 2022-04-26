package classes;

import interfaces.ICalculadora;

public class Subtracao implements ICalculadora {

	private static final Integer Integer = null;
	private static final Float Float = null;
	private static final Double Double = null;

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if (n1 == null || n1 != Integer || n2 == null || n2 != Integer) {
			return 0;
		}
		return n1 - n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if (n1 == null || n1 != Float || n2 == null || n2 != Float) {
			return (float) 0;
		}
		return n1 - n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if (n1 == null || n1 != Double || n2 == null || n2 != Double) {
			return (double) 0;
		}
		return n1 - n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer subtracao = numeros[0];
		for (Integer i = 1; i < numeros.length; ++i) {
			subtracao -= numeros[i];
		}
		return subtracao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float subtracao = numeros[0];
		for (int i = 1; i < numeros.length; ++i) {
			subtracao -= numeros[i]; 
		}
		return subtracao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double subtracao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			subtracao -= numeros[i];
		}
		return subtracao;
	}

}
