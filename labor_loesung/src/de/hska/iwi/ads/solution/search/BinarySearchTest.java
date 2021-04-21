package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

public class BinarySearchTest extends SearchTest{

	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		// TODO Auto-generated method stub
		return new BinarySearch<E>();
	}

}
