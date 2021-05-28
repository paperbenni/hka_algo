package hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

public class Hashtable<K extends Comparable<K>,V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	public V get(Object o) {
		K key = (K)o; 						// key wird zu K gecastet
		int i =0;
		int keyHash = Math.abs(key.hashCode()%hashtable.length);// hash berechnen
		if (hashtable[keyHash]==null) {
			return null;
		}
		while(hashtable[keyHash].getKey()!=key&& i<hashtable.length) {
			i++;
			keyHash=quadtatischSondiere(keyHash);
		}
		if(i>=hashtable.length) {
			return null;
		}
			return hashtable[keyHash].getValue();

	}
	

	public V put(K key, V value) {
		
		int keyHash = Math.abs(key.hashCode()%hashtable.length);
		int i =0;
		V ret = value;
		if (hashtable[keyHash]==null||hashtable[keyHash].getKey()==null) {
		SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
		hashtable[keyHash] = newEntry;
		}
		else {
			while(hashtable[keyHash].getKey()!=key&& i<hashtable.length) {
				i++;
				keyHash=quadtatischSondiere(keyHash);
			}

			SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
			ret = hashtable[keyHash].getValue();
			hashtable[keyHash] = newEntry;
		}
		return ret;
		
	}
	private int quadtatischSondiere(int hash) {
		return Math.abs((hash*hash)%hashtable.length);
	}
	
	public void delete(Object o) {
		throw new UnsupportedOperationException("Was mein ist bleibt auch mein !");
	}
	
	
	public static void main(String[] args) {
		Hashtable<Integer, String> Map = new Hashtable<>(4);
		Map.put(1, "Gärster");
		Map.put(1, "Müller");
		Map.put(123, "Riese");
		
		System.out.println(Map.get(1));
		System.out.println(Map.get(123));
		
		
	}

}
