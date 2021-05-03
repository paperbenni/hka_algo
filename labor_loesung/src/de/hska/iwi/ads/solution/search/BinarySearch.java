package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

  @Override
  public int search(E[] a, E key, int left, int right) {

    int mid;
    int compare;

    while (left <= right) {

      if (key.compareTo(a[left]) < 0) {
        if (key.compareTo(a[left - 1]) < 0) {
          return left - 2;
        } else {
          return left - 1;
        }
      }
      if (key.compareTo(a[right]) > 0)
        return right + 1;
    }
    mid = left + (right - left) / 2;
    compare = key.compareTo(a[mid]);
    if (compare == 0) {
      return mid;
    } else if (compare > 0) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
    return 0;
  }
}
