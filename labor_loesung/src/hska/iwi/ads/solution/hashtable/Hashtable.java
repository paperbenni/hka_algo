package hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

public class Hashtable<K extends Comparable<K>,V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	public V get(Object o) {
		K key = (K)o;
		V ret;
		int keyHash = key.hashCode();
		while(hashtable[keyHash].getKey()!=key) {
			keyHash=keyHash*keyHash%hashtable.length;
		}

			ret = hashtable[keyHash].getValue();
			
		if(ret==null) {
			return null;
		}
		return ret;
	}
	
	
	
	
	public V put(K key, V value) {
		
		
		int keyHash = key.hashCode();
		
		if (hashtable[keyHash].getValue()==null) {
		SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
		hashtable[keyHash] = newEntry;
		}
		else {
			keyHash = quadratischSondieren(keyHash);
			SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
			hashtable[keyHash] = newEntry;
			
		}
		
	}
	public void delete(Object o) {
		throw new UnsupportedOperationException("Dat Bot ist voll!");
	}
	
	
	
	
	private int quadratischSondieren(int hash){
		hash=hash*hash;
		if (hash<hashtable.length) {
			throw new DictionaryFullException("Dat Bot ist voll!");
		}
		
		if (hashtable[hash].getValue()==null) {
			return hash;
			}
			else {
				return quadratischSondieren(hash);
			}
	}
	

}
