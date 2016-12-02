# Distancia Levenshtein
## Descripción:
La **Distancia de Levenshtein**, **Distancia de Edición** o **Distancia entre palabras** es el número mínimo de operaciones requeridas para transformar una [cadena de caracteres](https://es.wikipedia.org/wiki/Cadena_de_caracteres) en otra, se usa ampliamente en [teoría de la información](https://es.wikipedia.org/wiki/Teor%C3%ADa_de_la_informaci%C3%B3n) y [ciencias de la computación](https://es.wikipedia.org/wiki/Ciencias_de_la_computaci%C3%B3n). Se entiende por operación, bien una inserción, eliminación o la sustitución de un carácter. Esta distancia recibe ese nombre en honor al científico ruso [Vladimir Levenshtein](https://es.wikipedia.org/wiki/Vlad%C3%ADmir_Levensht%C3%A9in), quien se ocupó de esta distancia en 1965. Es útil en programas que determinan cuán similares son dos cadenas de caracteres, como es el caso de los correctores de ortografía.

Por ejemplo, la distancia de Levenshtein entre "casa" y "calle" es de 3 porque se necesitan al menos tres ediciones elementales para cambiar uno en el otro.

* casa → cala (sustitución de 's' por 'l')
* cala → calla (inserción de 'l' entre 'l' y 'a')
* calla → calle (sustitución de 'a' por 'e')

Se le considera una generalización de la [distancia de Hamming](https://es.wikipedia.org/wiki/Distancia_de_Hamming), que se usa para cadenas de la misma longitud y que solo considera como operación la sustitución. Hay otras generalizaciones de la distancia de Levenshtein, como la [distancia de Damerau-Levenshtein](https://es.wikipedia.org/wiki/Distancia_de_Damerau-Levenshtein), que consideran el intercambio de dos caracteres como una operación.

Como buena "distancia", cumple (aunque es complicado demostrarlo formalmente), que:
Dist(A,B) == Dist(B,A)
Dist(A,B) + Dist(B,C) >= Dist(A,C).
