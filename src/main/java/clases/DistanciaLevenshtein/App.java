package clases.DistanciaLevenshtein;

/**
 * @author Joel Perez Ramos
 * Clase Principal
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Prueba01: " + LevenshteinDistance.computeLevenshteinDistance("oslo", "oslo"));
		System.out.println("Prueba02: " + LevenshteinDistance.computeLevenshteinDistance("pata", "gata"));
		System.out.println("Prueba03: " + LevenshteinDistance.computeLevenshteinDistance("moto", "oso"));
	}
}
