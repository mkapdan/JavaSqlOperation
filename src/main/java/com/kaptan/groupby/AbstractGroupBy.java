package com.kaptan.groupby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractGroupBy<V, T> implements GroupBy<V, T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Grouper<V, T> grouper;

	public AbstractGroupBy(Grouper<V, T> grouper) {
		setGrouper(grouper);
	}

	public Map<V, List<T>> group(List<T> listOfItems) {

		Map<V, List<T>> groupedMap = new HashMap<V, List<T>>();

		for (T item : listOfItems) {

			V mapKey = getGrouper().getMapKey(item);

			if (!getGrouper().isContainsKey(groupedMap, item)) {
				List<T> newList = new ArrayList<T>();
				groupedMap.put(mapKey, newList);
			}
			groupedMap.get(mapKey).add(item);

		}

		return groupedMap;
	}

	public Map<V, List<T>> group(List<T> listOfItems, Grouper<V, T> grouper) {

		Map<V, List<T>> groupedMap = new HashMap<V, List<T>>();

		for (T item : listOfItems) {

			V mapKey = grouper.getMapKey(item);

			if (!grouper.isContainsKey(groupedMap, item)) {
				List<T> newList = new ArrayList<T>();
				groupedMap.put(mapKey, newList);
			}
			groupedMap.get(mapKey).add(item);

		}

		return groupedMap;
	}

	public Grouper<V, T> getGrouper() {
		return grouper;
	}

	public abstract void setGrouper(Grouper<V, T> grouper);

}
