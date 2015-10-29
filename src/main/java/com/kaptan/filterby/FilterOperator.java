package com.kaptan.filterby;

import java.io.Serializable;
import java.util.Collection;

/**
 * 
 * By extending this interface, you can create your own filter operator.
 * 
 * @author kaptan
 *
 * @param <T>
 *            target class type
 * @param <V>
 *            source class type
 */
public interface FilterOperator<T, V> extends Serializable {

	Collection<T> filter(Collection<T> listOfItems, V filterData);

	Collection<T> filter(Collection<T> listOfItems, V filterData, Filter<T, V> filterCondition);

	void setFilterCondition(Filter<T, V> filterCondition);
}
