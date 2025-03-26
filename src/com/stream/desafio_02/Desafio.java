package com.stream.desafio_02;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 2 - Soma dos números pares da lista
		int somaPar = numeros.stream().filter((n) -> n % 2 == 0).reduce(0, (n, n2) -> n + n2);
		// int soma = listaPar.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(somaPar);

	}

}
