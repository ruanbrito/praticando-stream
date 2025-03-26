package com.stream.desafio_17;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		// List<Integer> numeros = Arrays.asList(3,3,3,3,3,3);

		// Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
		int soma = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, (a, b) -> a + b);
		System.out.println(soma);
	}
}