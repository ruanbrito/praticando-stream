package com.stream.desafio_01;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 1 - Ordem crescente da lista de número
		System.out.println(numeros);
		numeros.stream().sorted().forEach(System.out::println);
	}

}
