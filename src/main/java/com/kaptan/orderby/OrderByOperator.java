package com.kaptan.orderby;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
/**
 * 
 * @author kaptan
 *
 * @param <T>   type of data will be ordered.
 */
public interface OrderByOperator<T> extends Serializable {

	Collection<T> orderBy(Collection<T> listOfItems);

	Collection<T> orderBy(Collection<T> listOfItems, Comparator<T> orderByCondition);
	Collection<T> reverseOrder(Collection<T> collection);
	void setOrderByCondition(Comparator<T> orderByCondition);
}
