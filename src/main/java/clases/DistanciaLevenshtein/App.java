package clases.DistanciaLevenshtein;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Prueba01: " + LevenshteinDistance.computeLevenshteinDistance("oslo", "oslo"));
		System.out.println("Prueba02: " + LevenshteinDistance.computeLevenshteinDistance("cama", "caixa"));
	}
}
