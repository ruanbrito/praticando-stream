package com.stream.desafio_06;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 6 - Verificar se a lista contém algum número maior que 10:
		System.out.println(numeros.stream().anyMatch((n) -> n > 10));

	}

}
