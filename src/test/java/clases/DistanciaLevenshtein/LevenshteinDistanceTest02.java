package clases.DistanciaLevenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * \class LevenshteinDistanceTest02
 * \brief Test02 de la Distancia de Levenshtein.
 * \author Joel Perez Ramos
 */
public class LevenshteinDistanceTest02 {
	@Test
	public void testComputeLevenshteinDistance() {
		int result = LevenshteinDistance.computeLevenshteinDistance("pata", "gata");
		assertEquals(result, 1);
	}
}
