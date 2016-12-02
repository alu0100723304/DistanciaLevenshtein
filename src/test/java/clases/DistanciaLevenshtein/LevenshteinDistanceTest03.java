package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Joey
 * Test03 de la Distancia de Levenshtein.
 */
public class LevenshteinDistanceTest03 {
	@Test
	public void testComputeLevenshteinDistance() {
		int result = LevenshteinDistance.computeLevenshteinDistance("cama", "caixa");
		assertEquals(result, 2);
	}
}
