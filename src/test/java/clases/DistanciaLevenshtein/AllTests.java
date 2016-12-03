package clases.DistanciaLevenshtein;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Joel Perez Ramos 
 * AllTest de la Distancia de Levenshtein.
 */
@RunWith(Suite.class)
@SuiteClasses({AppTest.class, LevenshteinDistanceTest01.class,
		LevenshteinDistanceTest02.class, LevenshteinDistanceTest03.class,
		LevenshteinDistanceTest04.class})
public class AllTests {

}
