package de.hska.iwi.ads.solution.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardboxTest {

	@Test
	void compareToTest0() {
		Cardbox<String> Box1 = new Cardbox<String>(1, "Ich bin Box 1");
		Cardbox<String> Box2 = new Cardbox<String>(2, "Ich bin Box 2");
		assertEquals(0, Box1.compareTo(Box2));
	}
	@Test
	void compareToTest1() {
		Cardbox<String> Box1 = new Cardbox<String>(2, "Ich bin Box 1");
		Cardbox<String> Box2 = new Cardbox<String>(2, "Ich bin Box 2");
		assertEquals(1, Box1.compareTo(Box2));
	}
	@Test
	void compareToTest2() {
		Cardbox<String> Box1 = new Cardbox<String>(3, "Ich bin Box 1");
		Cardbox<String> Box2 = new Cardbox<String>(2, "Ich bin Box 2");
		assertEquals(2, Box1.compareTo(Box2));
	}

}
