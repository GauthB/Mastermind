/**
 * 
 */
package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author humbertmeyers
 *
 */
public class ModelGameTest {
	ModelGame m1;
	ModelGame m2;
	ModelGame m3;
	ModelGame m4;
	ModelGame m5;
	ModelGame m6;
	char [] combi;
	char [] combiTest1;
	char [] combiTest2;
	char [] combiTest3;
	char [] combiTest4;
	
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
		combi[0] = '1'; combi[1] = '7'; combi[2] = '2'; combi[3] = '9';
		combiTest1 = new char [4];
		combiTest1[0] = '1'; combiTest1[1] = '7'; combiTest1[2] = '2'; combiTest1[3] = '9';
		combiTest2 = new char [4];
		combiTest2[0] = '8'; combiTest2[1] = '4'; combiTest2[2] = '6'; combiTest2[3] = '3';
		combiTest3 = new char [4];
		combiTest3[0] = '7'; combiTest3[1] = '1'; combiTest3[2] = '9'; combiTest3[3] = '2';
		combiTest4 = new char [4];
		combiTest4[0] = '7'; combiTest4[1] = '5'; combiTest4[2] = '2'; combiTest4[3] = '1';
		
		
	}

	/**
	 * Test method for {@link model.ModelGame#chooseLevel()}.
	 */
	@Test
	public void testChooseLevel() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.ModelGame#convertTab2String(char[])}.
	 */
	@Test
	public void testConvertTab2String() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.ModelGame#convertString2Tab(java.lang.String)}.
	 */
	@Test
	public void testConvertString2Tab() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.ModelGame#ifCorrect(java.lang.String)}.
	 */
	@Test
	public void testIfCorrect() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.ModelGame#levelSolo(java.lang.String)}.
	 */
	@Test
	public void testLevelSolo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.ModelGame#isLevelCorrect(java.lang.String)}.
	 */
	@Test
	public void testIsLevelCorrect() {
		fail("Not yet implemented");
	}

}
