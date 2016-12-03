package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test03 de la Distancia de Levenshtein.
 * @author Joel Perez Ramos
 */
public class LevenshteinDistanceTest03 {
	@Test
	public void testComputeLevenshteinDistance() {
		int result = LevenshteinDistance.computeLevenshteinDistance("cama", "caixa");
		assertEquals(result, 2);
	}
}
