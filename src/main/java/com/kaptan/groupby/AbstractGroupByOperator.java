package com.kaptan.groupby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * You can create operator for different type of data.
 * This class will groups data by using given condition.
 * @author kaptan
 *
 * @param <V> Class type of map key
 * @param <T> Grouped Data Type
 */
public abstract class AbstractGroupByOperator<V, T> implements GroupByOperator<V, T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected GrouperBy<V, T> groupByCondition;

	public AbstractGroupByOperator(GrouperBy<V, T> groupByCondition) {
		setGroupByCondition(groupByCondition);
	}

	public Map<V, Collection<T>> groupBy(Collection<T> listOfItems) {

		Map<V, Collection<T>> groupedMap = new HashMap<V, Collection<T>>();

		for (T item : listOfItems) {

			V mapKey = getGroupByCondition().getMapKey(item);

			if (!getGroupByCondition().isContainsKey(groupedMap, item)) {
				Collection<T> newList = new ArrayList<T>();
				groupedMap.put(mapKey, newList);
			}
			groupedMap.get(mapKey).add(item);

		}

		return groupedMap;
	}

	public Map<V, Collection<T>> groupBy(Collection<T> listOfItems, GrouperBy<V, T> grouper) {

		Map<V, Collection<T>> groupedMap = new HashMap<V, Collection<T>>();

		for (T item : listOfItems) {

			V mapKey = grouper.getMapKey(item);

			if (!grouper.isContainsKey(groupedMap, item)) {
				Collection<T> newList = new ArrayList<T>();
				groupedMap.put(mapKey, newList);
			}
			groupedMap.get(mapKey).add(item);

		}

		return groupedMap;
	}

	public GrouperBy<V, T> getGroupByCondition() {
		return groupByCondition;
	}

	public abstract void setGroupByCondition(GrouperBy<V, T> groupByCondition);

}
