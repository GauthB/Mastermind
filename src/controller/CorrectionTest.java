/**
 * 
 */
package controller;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Le test concernant la correction de combinaison
 */
public class CorrectionTest {
	Correction c1;
	Correction c2;
	Correction c3;
	Correction c4;
	Correction c5;
	char [] combi;
	char [] combiTest;
	char [] combiTest2;
	char [] combiTest3;
	char [] combiTest4;

	/**
	 * L'initialisation des différentes combinaisons.
	 * @throws Exception envoie une erreur
	 */
	@Before
	public void setUp() throws Exception {
		c1 = new Correction();
		c2 = new Correction();
		c3 = new Correction();
		c4 = new Correction();
		c5 = new Correction();
		combi = new char [4];
		combi[0] = '1'; combi[1] = '7'; combi[2] = '2'; combi[3] = '9';
		combiTest = new char [4];
		combiTest[0] = '1'; combiTest[1] = '7'; combiTest[2] = '2'; combiTest[3] = '9';
		combiTest2 = new char [4];
		combiTest2[0] = '8'; combiTest2[1] = '4'; combiTest2[2] = '6'; combiTest2[3] = '3';
		combiTest3 = new char [4];
		combiTest3[0] = '7'; combiTest3[1] = '1'; combiTest3[2] = '9'; combiTest3[3] = '2';
		combiTest4 = new char [4];
		combiTest4[0] = '7'; combiTest4[1] = '5'; combiTest4[2] = '2'; combiTest4[3] = '1';
	}

	/**
	 * Test method for {@link controller.Correction#correction(char[], char[])}.
	 * Vérifie si la combinaison reçue n'est pas nulle
	 */
	@Test
	public void testCorrectionNotNull() {
		//fail("Not yet implemented");
		assertNotNull(c1);
	}
	
	/**
	 * Vérifie si la combinaison reçue est correcte
	 */
	@Test
	public void testCorrectionCorrect() {
		//fail("Not yet implemented");
		char[] result = new char[4];
		char[] expected = new char[4];
		expected[0] = 'V'; expected[1] = 'V'; expected[2] = 'V'; expected[3] = 'V';
		result = c2.correction(combiTest, combi);
		
		assertEquals(expected[0], result[0]);
		assertEquals(expected[1], result[1]);
		assertEquals(expected[2], result[2]);
		assertEquals(expected[3], result[3]);
	}
	
	
	/**
	 * Vérifie si la combinaison reçue est fausse
	 */
	@Test
	public void testCorrectionFaux() {
		//fail("Not yet implemented");
		char[] result = new char[4];
		char[] expected = new char[4];
		expected[0] = 'X'; expected[1] = 'X'; expected[2] = 'X'; expected[3] = 'X';
		result = c3.correction(combiTest2, combi);
		
		assertEquals(expected[0], result[0]);
		assertEquals(expected[1], result[1]);
		assertEquals(expected[2], result[2]);
		assertEquals(expected[3], result[3]);
	}
	
	
	/**
	 * Vérifie si la combinaison est juste mais pas dans le bon ordre
	 */
	@Test
	public void testCorrectionMiCorrect() {
		//fail("Not yet implemented");
		char[] result = new char[4];
		char[] expected = new char[4];
		expected[0] = '/'; expected[1] = '/'; expected[2] = '/'; expected[3] = '/';
		result = c4.correction(combiTest3, combi);
		
		assertEquals(expected[0], result[0]);
		assertEquals(expected[1], result[1]);
		assertEquals(expected[2], result[2]);
		assertEquals(expected[3], result[3]);
	}
	
	
	/**
	 * Vérifie si la combinaison contient un mix de toutes les possibilités
	 */
	@Test
	public void testCorrectionMix() {
		//fail("Not yet implemented");
		char[] result = new char[4];
		char[] expected = new char[4];
		expected[0] = '/'; expected[1] = 'X'; expected[2] = 'V'; expected[3] = '/';
		result = c5.correction(combiTest4, combi);
		
		assertEquals(expected[0], result[0]);
		assertEquals(expected[1], result[1]);
		assertEquals(expected[2], result[2]);
		assertEquals(expected[3], result[3]);
	}
}
