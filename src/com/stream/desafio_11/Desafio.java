package com.stream.desafio_11;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
		Double somaQuadrado = numeros.stream().mapToDouble((n)-> Math.pow(n, 2)).sum();
		System.out.println(somaQuadrado);
	}

}
