
/**
 * @author wejo1037
 */


package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;
import java.util.AbstractMap.SimpleEntry;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	
	public V get(Object o) {
        @SuppressWarnings("unchecked")
        K searchkey = (K)o;
        return find(searchkey).entry.getValue();
	}

    private ListElement find(K key) {
        ListElement a = null;
        ListElement counter = this.head;
        while (counter.next != null) {
            if (counter.entry.getKey().compareTo(key) == 0) {
                a = counter;
                break;
            }
            counter = counter.next;
        }
		return a;
    }
	
	public V put(K key, V value) {
		V a = null;
        ListElement checker = find(key);
        if (checker != null) {
            a = checker.entry.getValue();
            checker.entry.setValue(value);
        }  else {
            SimpleEntry<K, V> newentry = new SimpleEntry<>(key, value);
            ListElement newelement = new ListElement(newentry, null, this.head);
            this.head.previous = newelement;
            this.head = newelement;
        }
        return a;
	}
}


