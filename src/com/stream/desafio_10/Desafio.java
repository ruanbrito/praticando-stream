package com.stream.desafio_10;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
		numeros.stream().filter((n) -> n % 3 == 0 || n % 5 == 0).forEach(System.out::println);

	}

}
