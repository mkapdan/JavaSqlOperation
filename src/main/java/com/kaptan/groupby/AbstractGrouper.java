package com.kaptan.groupby;

import java.util.List;
import java.util.Map;

public abstract class AbstractGrouper<V, T> implements Grouper<V, T> {

	public boolean isContainsKey(Map<V, List<T>> container, T newData) {

		return container.containsKey(getMapKey(newData));
	}

	public abstract V getMapKey(T newData);

}
