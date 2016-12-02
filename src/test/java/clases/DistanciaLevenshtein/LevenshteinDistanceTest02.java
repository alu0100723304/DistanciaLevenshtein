package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Joel Perez Ramos
 * Test02 de la Distancia de Levenshtein.
 */
public class LevenshteinDistanceTest02 {
	@Test
	public void test() {
		int result = LevenshteinDistance.computeLevenshteinDistance("pata", "gata");
		assertEquals(result, 1);
	}
}
