package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Joey
 * Test04 de la Distancia de Levenshtein.
 */
public class LevenshteinDistanceTest04 {
	@Test
	public void test() {
		int result = LevenshteinDistance.computeLevenshteinDistance("casa", "calle");
		assertEquals(result, 3);
	}
}
