package com.kaptan.filterby;

import java.util.ArrayList;
import java.util.Collection;

/**
 * By extending this, you can create your own filter operator.
 * 
 * {T,V} options gives you flexibility, you can filter any obj with different type obj.
 * 
 * @author kaptan
 *
 * @param <T> target class type	( will be filtered data type)
 * @param <V> source class type (filter data type)
 */
public abstract class AbstractFilterOperator<T, V> implements FilterOperator<T, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Filter<T, V> filterCondition;

	public AbstractFilterOperator(Filter<T, V> filterCondition) {
		setFilterCondition(filterCondition);
	}

	public Filter<T, V> getFilterCondition() {
		return filterCondition;
	}

	public abstract void setFilterCondition(Filter<T, V> filterCondition);

	public Collection<T> filter(Collection<T> listOfItems, V filterData) {

		Collection<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (filterCondition.isConditionMet(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

	public Collection<T> filter(Collection<T> listOfItems, V filterData, Filter<T, V> filterCondition) {
		Collection<T> filteredItems = new ArrayList<T>();

		for (T item : listOfItems) {
			if (filterCondition.isConditionMet(item, filterData)) {
				filteredItems.add(item);
			}
		}
		return filteredItems;
	}

}
