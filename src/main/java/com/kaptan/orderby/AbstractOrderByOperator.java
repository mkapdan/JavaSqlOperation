package com.kaptan.orderby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author kaptan
 *
 * @param <T>
 *            type of data will be ordered.
 */
public abstract class AbstractOrderByOperator<T> implements OrderByOperator<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Comparator<T> orderByCondition;

	public AbstractOrderByOperator(Comparator<T> orderByCondition) {
		setOrderByCondition(orderByCondition);
	}

	public Comparator<T> getOrderByCondition() {
		return orderByCondition;
	}

	public Collection<T> orderBy(Collection<T> listOfItems) {

		List<T> sortList = new ArrayList<T>(listOfItems);
		Collections.sort(sortList, getOrderByCondition());
		return sortList;
	}

	public List<T> orderBy(Collection<T> listOfItems, Comparator<T> orderByCondition) {
		List<T> sortList = new ArrayList<T>(listOfItems);
		Collections.sort(sortList, orderByCondition);
		return sortList;
	}

	public Collection<T> reverseOrder(Collection<T> collection) {
		List<T> reversedList = new ArrayList<T>(collection);
		Collections.reverse(reversedList);
		return reversedList;
	}

	public abstract void setOrderByCondition(Comparator<T> orderByCondition);

}
