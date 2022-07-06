import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
GradeBook new1;
GradeBook new2;
	@BeforeEach
	void setUp() throws Exception {
		new1 = new GradeBook(2);
		new2 = new GradeBook(2);
		new1.addScore(10.0);
		new1.addScore(20.0);
		new2.addScore(10.0);
		new2.addScore(20.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		new1= null;
		new2 = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
	assertEquals(new1.toString(),(" 10.0 20.0 "));
	}

	@Test
	void testSum() {
		assertEquals(30, new1.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(10, new1.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(new1.finalScore(), 20);
	}

}
