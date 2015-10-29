package com.kaptan.groupby;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author kaptan
 *
 * @param <V> Class type of map key
 * @param <T> Grouped Data Type
 */
public interface GroupByOperator<V, T> extends Serializable {

	Map<V, Collection<T>> groupBy(Collection<T> listOfItems);

	Map<V, Collection<T>> groupBy(Collection<T> listOfItems, GrouperBy<V, T> groupCondition);

	void setGroupByCondition(GrouperBy<V, T> groupByCondition);

}
