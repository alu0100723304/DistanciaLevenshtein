# Distancia Levenshtein
## Descripción:
La **Distancia de Levenshtein**, **Distancia de Edición** o **Distancia entre palabras** es el número mínimo de operaciones requeridas para transformar una [cadena de caracteres][1] en otra, se usa ampliamente en [teoría de la información][2] y [ciencias de la computación][3]. Se entiende por operación, bien una inserción, eliminación o la sustitución de un carácter. Esta distancia recibe ese nombre en honor al científico ruso [Vladimir Levenshtein][4], quien se ocupó de esta distancia en 1965. Es útil en programas que determinan cuán similares son dos cadenas de caracteres, como es el caso de los correctores de ortografía.

Por ejemplo, la distancia de Levenshtein entre "casa" y "calle" es de 3 porque se necesitan al menos tres ediciones elementales para cambiar uno en el otro.

* casa → cala (sustitución de 's' por 'l')
* cala → calla (inserción de 'l' entre 'l' y 'a')
* calla → calle (sustitución de 'a' por 'e')

Se le considera una generalización de la [distancia de Hamming][5], que se usa para cadenas de la misma longitud y que solo considera como operación la sustitución. Hay otras generalizaciones de la distancia de Levenshtein, como la [distancia de Damerau-Levenshtein][6], que consideran el intercambio de dos caracteres como una operación.

Como buena "distancia", cumple (aunque es complicado demostrarlo formalmente), que:

*	Dist(A,B) == Dist(B,A)
* Dist(A,B) + Dist(B,C) >= Dist(A,C)

## El Algoritmo:
Se trata de un [algoritmo][7] de tipo bottom-up, común en [programación dinámica][8]. Se apoya en el uso de una matriz (n + 1) × (m + 1), donde n y m son las longitudes de las cadenas. Aquí se indica el algoritmo en [pseudocódigo][9] para una función LevenshteinDistance que toma dos cadenas, str1 de longitud lenStr1, y str2 de longitud lenStr2, y calcula la distancia Levenshtein entre ellos:

	int LevenshteinDistance(char str1[1..lenStr1], char str2[1..lenStr2])
		// d is a table with lenStr1+1 rows and lenStr2+1 columns
		declare int d[0..lenStr1, 0..lenStr2]
		// i and j are used to iterate over str1 and str2
		declare int i, j, cost
		
		for i from 0 to lenStr1
			d[i, 0] := i
		for j from 0 to lenStr2
			d[0, j] := j
			
		for i from 1 to lenStr1
			for j from 1 to lenStr2
				if str1[i-1] = str2[j-1]
					then cost := 0
				else
					cost := 1
				
				d[i, j] := minimum( d[i-1, j] + 1,		// deletion
									d[i, j-1] + 1,		// insertion
									d[i-1, j-1] + cost	// substitution
									)
		return d[lenStr1, lenStr2]

[1]: https://es.wikipedia.org/wiki/Cadena_de_caracteres
[2]: https://es.wikipedia.org/wiki/Teor%C3%ADa_de_la_informaci%C3%B3n
[3]: https://es.wikipedia.org/wiki/Ciencias_de_la_computaci%C3%B3n
[4]: https://es.wikipedia.org/wiki/Vlad%C3%ADmir_Levensht%C3%A9in
[5]: https://es.wikipedia.org/wiki/Distancia_de_Hamming
[6]: https://es.wikipedia.org/wiki/Distancia_de_Damerau-Levenshtein
[7]: https://es.wikipedia.org/wiki/Algoritmo
[8]: https://es.wikipedia.org/wiki/Programaci%C3%B3n_din%C3%A1mica
[9]: https://es.wikipedia.org/wiki/Pseudoc%C3%B3digo

## Aplicaciones:
* El proyecto ASJP usa la distancia de Levenshtein total en una lista de palabras en diferentes lenguas del mundo, para medir la "similaridad" o "cercanía" de las mismas, esa distancia calculada puede emplearse para proponer una clasificación filogenética tentativa de las lenguas del mundo.
* La distancia de Damerau-Levenshtein es una generalización de la distancia de Levenshtein usada por los correctores ortográficos y en la detección de fraudes en listas de datos.
