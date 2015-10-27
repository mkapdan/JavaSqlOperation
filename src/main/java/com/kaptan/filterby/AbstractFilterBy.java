package com.kaptan.filterby;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilterBy<T, V> implements FilterBy<T, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Filterer<T, V> filterer;

	public AbstractFilterBy(Filterer<T, V> filterer) {
		setFilterer(filterer);
	}

	public Filterer<T, V> getFilterer() {
		return filterer;
	}

	public abstract void setFilterer(Filterer<T, V> filterer);

	public List<T> filter(List<T> listOfItems, V filterData) {

		List<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (getFilterer().isEqual(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

	public List<T> filter(List<T> listOfItems, V filterData, Filterer<T, V> filterer) {
		List<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (filterer.isEqual(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

}
