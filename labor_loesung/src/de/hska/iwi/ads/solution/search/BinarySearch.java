package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

    @Override
    public int search(E[] a, E key, int left, int right) {

        int ret = 0;
        if (left > right) {
            System.out.println("wut");
            return 0;
        }
        int mid = (right + left) / 2;
        int compared = key.compareTo(a[mid]);
        if (compared == 0) {
            ret = mid;
        } else {
            if (right == left + 1) {
                int extracheck = a[right].compareTo(key);
                if (extracheck == 0) {
                    ret = right;
                } else {
                    if (compared == -1) {
                        ret = left - 1;
                    } else if (extracheck == 1) {
                        ret = right + 1;
                    } else {
                        ret = right;
                    }
                }
            } else {
                if (compared == 1) {
                    ret = search(a, key, mid + 1, right);
                } else {
                    ret = search(a, key, left, mid - 1);
                }
            }
        }
        return ret;
    }


}
