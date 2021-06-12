package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {
    public V put(K key, V value) {
        int compare = 0;
        Node newnode = new Node(key, value);
        if (root == null) {
            root = newnode;
            return null;
        }

        Node checknode = root;
        while (true) {
            compare = checknode.left.entry.getKey().compareTo(key);
            if (compare == 0) {
                V ret = checknode.entry.getValue();
                checknode.entry.setValue(value);
                return ret;
            } else {
                if (compare < 0) {
                    if (checknode.left == null) {
                        checknode.left = newnode;
                        return null;
                    } else {
                        checknode = checknode.left;
                    }
                } else {
                    if (checknode.right == null) {
                        checknode.right = newnode;
                        return null;
                    } else {
                        checknode = checknode.right;
                    }
                }
            }
        }

    }

    public V get(K key) {
        int compare;
        Node checknode = root;
        while (true) {
            if (checknode == null) {
                return null;
            }
            compare = checknode.left.entry.getKey().compareTo(key);
            if (compare == 0) {
                return checknode.entry.getValue();
            } else if (compare < 0) {
                checknode = checknode.left;
            } else {
                checknode = checknode.right;
            }
        }
    }
}
