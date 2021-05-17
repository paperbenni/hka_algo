/**
 * @author wejo1037
 */


package de.hska.iwi.ads.solution.list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class TestDoubleLinkedList<K extends Comparable<K>,V> extends MapTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		// TODO Auto-generated method stub
		return new DoubleLinkedList<K,V>();
	}

}
