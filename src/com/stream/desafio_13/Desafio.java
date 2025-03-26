package com.stream.desafio_13;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 13 - Filtrar os números que estão dentro de um intervalo:
		numeros.stream().filter(n -> n > 3 && n < 10).forEach(System.out::println);
	}

}
