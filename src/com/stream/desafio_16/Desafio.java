package com.stream.desafio_16;

import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Desafio 16 - Agrupe os números em pares e ímpares:
		List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
		List<Integer> impares = numeros.stream().filter(n -> {
			if (n < 2)
				return false;
			for (int i = 2; i < n; i++)
				if (n % i == 0)
					return false;
			return true;
		}).toList();
		System.out.println(pares);
		System.out.println(impares);
	}
}