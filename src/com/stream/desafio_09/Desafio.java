package com.stream.desafio_09;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 9 - Verificar se todos os números da lista são distintos (não se
		// repetem)
		numeros.stream().distinct().forEach(System.out::println);

	}

}
