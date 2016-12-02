package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Joey
 * Test01 de la Distancia de Levenshtein.
 */
public class LevenshteinDistanceTest01 {
	@Test
	public void testComputeLevenshteinDistance() {		
		int result = LevenshteinDistance.computeLevenshteinDistance("oslo", "oslo");
		assertEquals(result, 0);
	}
}
