package com.stream.desafio_03;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 3 - Verificar se os numeros da lista são todos positvos
		System.out.println(numeros.stream().allMatch((n) -> n > 0));

	}

}
