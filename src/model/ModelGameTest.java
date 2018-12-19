/**
 * 
 */
package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert 
 * 
 */
public class ModelGameTest {
	ModelGame m1;
	ModelGame m2;
	ModelGame m3;
	ModelGame m4;
	ModelGame m5;
	ModelGame m6;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		m1 = new ModelGame();
		m2 = new ModelGame();
		m3 = new ModelGame();
		m4 = new ModelGame();
		m5 = new ModelGame();
		m6 = new ModelGame();
		
	}

	/**
	 * Test method for {@link model.ModelGame#levelSolo(java.lang.String)}.
	 */
	@Test
	public void testLevelSolo() {
		//fail("Not yet implemented");
		int retour1 = m1.levelSolo("h");
		int retour2 = m2.levelSolo("n");
		int retour3 = m3.levelSolo("e");
		int retour4 = m4.levelSolo("H");
		int retour5 = m5.levelSolo("N");
		int retour6 = m6.levelSolo("E");
		assertEquals(5, retour1);
		assertEquals(9, retour2);
		assertEquals(12, retour3);
		assertEquals(5, retour4);
		assertEquals(9, retour5);
		assertEquals(12, retour6);
	}

	/**
	 * Test method for {@link model.ModelGame#isLevelCorrect(java.lang.String)}.
	 */
	@Test
	public void testIsLevelCorrect() {
		//fail("Not yet implemented");
		boolean retour1 = m1.isLevelCorrect("h");
		boolean retour2 = m2.isLevelCorrect("n");
		boolean retour3 = m3.isLevelCorrect("e");
		boolean retour4 = m4.isLevelCorrect("H");
		boolean retour5 = m5.isLevelCorrect("N");
		boolean retour6 = m6.isLevelCorrect("E");
		boolean retour7 = m1.isLevelCorrect("");
		boolean retour8 = m2.isLevelCorrect("BJR");
		boolean retour9 = m1.isLevelCorrect("A");
		assertEquals(true, retour1);
		assertEquals(true, retour2);
		assertEquals(true, retour3);
		assertEquals(true, retour4);
		assertEquals(true, retour5);
		assertEquals(true, retour6);
		assertEquals(false, retour7);
		assertEquals(false, retour8);
		assertEquals(false, retour9);
		
	}

}
