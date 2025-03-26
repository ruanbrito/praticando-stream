package com.stream.desafio_08;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 8 - Somar os dígitos de todos os números da lista
		System.out.println(numeros.stream().mapToInt(n -> n).sum());

	}

}
