package com.kaptan.filterby;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFilterBy<T, V> implements FilterBy<T, T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Filterer<T, T> filterer;

	public AbstractFilterBy(Filterer<T, T> filterer) {
		setFilterer(filterer);
	}

	public Filterer<T, T> getFilterer() {
		return filterer;
	}

	public List<T> filter(List<T> listOfItems, T filterData) {

		List<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (getFilterer().isEqual(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

	public List<T> filter(List<T> listOfItems, T filterData, Filterer<T, T> filterer) {
		List<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (filterer.isEqual(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

	public abstract void setFilterer(Filterer<T, T> filterer);

}
