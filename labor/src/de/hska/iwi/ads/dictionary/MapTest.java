package de.hska.iwi.ads.dictionary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class MapTest {

  /**
  Creates and returns an implementation of the Dictionary interface.
  Override this method in the super class
  with, for instance, a BinarySearchTree implementation
  <pre>
  @override
  public &lt;K extends Comparable&lt;K>, V> Dictionary&lt;K, V> createSearch() {
    return new BinarySearchTree&lt;K, V>();
  }
  </pre>
  */
 public abstract <K extends Comparable<K>, V> Map<K,V> createMap();
 
   private Map<Integer, String> Tree;
   
   @BeforeEach
   void setUp() {
     // Map with 1,2,3,4, 6,7,8
     Tree = createMap();
     Tree.put(6, "Sechs");
     Tree.put(3, "Drei");
     Tree.put(1, "Eins");
     Tree.put(7, "Sieben");
     Tree.put(8, "Acht");
     Tree.put(4, "Vier");
     Tree.put(2, "Zwei");
   }
   
   @Test 
   void commonTestDictionary() {
     assertNotNull(Tree);
     assertEquals(7, Tree.size());
     assertEquals("Eins", Tree.get(1));
     assertEquals("Zwei", Tree.get(2));
     assertEquals("Drei", Tree.get(3));
     assertEquals("Vier", Tree.get(4));
     assertEquals("Sechs", Tree.get(6));
     assertEquals("Sieben", Tree.get(7));
     assertEquals("Acht", Tree.get(8));
   }
   
   @Test
   void testSize0() {
     Map<Integer, String> dictionary = createMap();
   
     assertEquals(0, dictionary.size());
   }

 
  @Test
  void testSize1() {
    Map<Integer, String> dictionary = createMap();
    
    dictionary.put(5, "Fünf");
    dictionary.put(3, "Drei");
    dictionary.put(7, "Vier");
    dictionary.put(11, "Elf");
    dictionary.put(1, "Eins");
    dictionary.put(9, "Neun");
    assertEquals(6, dictionary.size());
  }

  @Test
  void testSize2() {
    Map<Integer, String> map = createMap();
    
    map.put(5, "Fünf");
    map.put(3, "Drei");
    map.put(1, "Eins");
    map.put(9, "Neun");
    map.put(3, "Drei");
    map.put(1, "Eins");
    assertEquals(4, map.size());
  }

  @Test
  void testPut() {
    Tree.put(9, "Neun");
    assertEquals(8, Tree.size());    
    assertEquals("Neun", Tree.get(9));
  }
  
  @Test
  void testPut2() {
    Tree.put(9, "Neun");
    Tree.put(5, "Fünf");
    assertEquals(9, Tree.size());    
    assertEquals("Neun", Tree.get(9));
    assertEquals("Fünf", Tree.get(5));
  }
  
  @Test
  void testPut3() {
    Tree.put(9, "Neun");
    Tree.put(5, "Fünf");
    Tree.put(2, "Two");
    Tree.put(9, "Neun");
    
    assertEquals(9, Tree.size());    
    assertEquals("Neun", Tree.get(9));
    assertEquals("Fünf", Tree.get(5));
  }
  
  @Test
  void testGet() {
    assertNull(Tree.get(5));
  }
  
  @Test
  void testGet1() {
    assertEquals("Sieben", Tree.get(7));
  }
  
  @Test
  void testGet2() {
    assertEquals("Sechs", Tree.get(6));
  }
  
  @Test
  void testGetNull() {
    assertThrows(NullPointerException.class, () -> Tree.get(null));
  }
  
  @Test
  void testPutNull() {
    assertThrows(NullPointerException.class, () -> Tree.put(null, "Null"));
  }
  

  
}
