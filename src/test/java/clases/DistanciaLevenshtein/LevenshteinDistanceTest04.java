package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test04 de la Distancia de Levenshtein.
 * @author Joey
 */
public class LevenshteinDistanceTest04 {
	@Test
	public void testComputeLevenshteinDistance() {
		int result = LevenshteinDistance.computeLevenshteinDistance("casa", "calle");
		assertEquals(result, 3);
	}
}
