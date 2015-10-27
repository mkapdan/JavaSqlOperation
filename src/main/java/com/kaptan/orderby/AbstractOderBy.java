package com.kaptan.orderby;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractOderBy<T> implements OrderBy<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Comparator<T> comparator;

	public AbstractOderBy(Comparator<T> comparator) {
		setComparator(comparator);
	}

	public Comparator<T> getComparator() {
		return comparator;
	}

	public List<T> orderBy(List<T> listOfItems) {

		Collections.sort(listOfItems, getComparator());
		return listOfItems;
	}

	public List<T> orderBy(List<T> listOfItems, Comparator<T> comprator) {
		Collections.sort(listOfItems, comprator);
		return listOfItems;
	}

	public abstract void setComparator(Comparator<T> comparator);

}
