
/**
 * @author scbe1048
 */

package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hska.iwi.ads.solution.hashtable.Hashtable;



public class BinarySearchTreeTest extends de.hska.iwi.ads.dictionary.MapTest {

    private BinarySearchTree<Integer, String> tree;

    @Override
    public BinarySearchTree<Integer,String> createMap() {
        return new BinarySearchTree<Integer,String>();

    }
    @BeforeEach()
	void setUp() {
		tree = createMap();
		tree.put(6, "Sechs");
		tree.put(3, "Drei");
		tree.put(1, "Eins");
		tree.put(7, "Sieben");
		tree.put(8, "Acht");
		tree.put(4, "Vier");
		tree.put(2, "Zwei");
	}
    @Test
	void commonTestDictionary() {
		assertNotNull(tree);
		assertEquals("Eins", tree.get(1));
		assertEquals("Zwei", tree.get(2));
		assertEquals("Drei", tree.get(3));
		assertEquals("Vier", tree.get(4));
		assertEquals("Sechs", tree.get(6));
		assertEquals("Sieben", tree.get(7));
		assertEquals("Acht", tree.get(8));
	}

}