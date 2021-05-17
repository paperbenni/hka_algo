/**
 * @author wejo1037
 */


package de.hska.iwi.ads.solution.list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class TestDoubleLinkedList<K extends Comparable<K>,V> extends MapTest {


	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		// TODO Auto-generated method stub
		return new DoubleLinkedList<K,V>();
	}
	
	@Test
	void test1() {
	    Map<Integer, String> dictionary = createMap();
	    
	    dictionary.put(5, "Fünf");
	    dictionary.put(3, "Drei");
	    dictionary.put(7, "Vier");
	    dictionary.put(11, "Elf");
	    dictionary.put(1, "Eins");
	    dictionary.put(9, "Neun");
	    assertEquals(6, dictionary.size());
	    assertEquals("Fünf", dictionary.get(5));
	  }

}
