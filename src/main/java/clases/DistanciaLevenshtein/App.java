package clases.DistanciaLevenshtein;

/**
 * \class App
 * \brief Clase Principal
 * \author Joel Perez Ramos
 */
public class App {
	/**
	 * \brief Main
	 * \param args
	 */
	public static void main(String[] args) {
		System.out.println("Prueba01: " + LevenshteinDistance.computeLevenshteinDistance("oslo", "oslo"));
		System.out.println("Prueba02: " + LevenshteinDistance.computeLevenshteinDistance("pata", "gata"));
		System.out.println("Prueba03: " + LevenshteinDistance.computeLevenshteinDistance("moto", "oso"));
		System.out.println("Prueba04: " + LevenshteinDistance.computeLevenshteinDistance("casa", "calle"));
	}
}
