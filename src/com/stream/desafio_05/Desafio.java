package com.stream.desafio_05;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 5 - Calcule a média dos números maiores que 5
		Double media = numeros.stream().filter((n) -> n > 5).mapToInt(n -> n).average().getAsDouble();
		System.out.println(media);

	}

}
