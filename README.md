# Distancia Levenshtein
## Descripción:
La **Distancia de Levenshtein**, **Distancia de Edición** o **Distancia entre palabras** es el número mínimo de operaciones requeridas para transformar una [cadena de caracteres][1] en otra, se usa ampliamente en [teoría de la información][2] y [ciencias de la computación][3]. Se entiende por operación, bien una inserción, eliminación o la sustitución de un carácter. Esta distancia recibe ese nombre en honor al científico ruso [Vladimir Levenshtein][4], quien se ocupó de esta distancia en 1965. Es útil en programas que determinan cuán similares son dos cadenas de caracteres, como es el caso de los correctores de ortografía.

Por ejemplo, la distancia de Levenshtein entre "casa" y "calle" es de 3 porque se necesitan al menos tres ediciones elementales para cambiar uno en el otro.

* casa → cala (sustitución de 's' por 'l')
* cala → calla (inserción de 'l' entre 'l' y 'a')
* calla → calle (sustitución de 'a' por 'e')

Se le considera una generalización de la [distancia de Hamming][5], que se usa para cadenas de la misma longitud y que solo considera como operación la sustitución. Hay otras generalizaciones de la distancia de Levenshtein, como la [distancia de Damerau-Levenshtein][6], que consideran el intercambio de dos caracteres como una operación.

Como buena "distancia", cumple (aunque es complicado demostrarlo formalmente), que:

* Dist(A,B) == Dist(B,A)
* Dist(A,B) + Dist(B,C) >= Dist(A,C).

[1]: https://es.wikipedia.org/wiki/Cadena_de_caracteres
[2]: https://es.wikipedia.org/wiki/Teor%C3%ADa_de_la_informaci%C3%B3n
[3]: https://es.wikipedia.org/wiki/Ciencias_de_la_computaci%C3%B3n
[4]: https://es.wikipedia.org/wiki/Vlad%C3%ADmir_Levensht%C3%A9in
[5]: https://es.wikipedia.org/wiki/Distancia_de_Hamming
[6]: https://es.wikipedia.org/wiki/Distancia_de_Damerau-Levenshtein
