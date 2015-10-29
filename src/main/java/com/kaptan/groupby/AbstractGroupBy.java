package com.kaptan.groupby;

import java.util.Collection;
import java.util.Map;

/**
 * You can create your own GroupByCondition by extending this class.
 * 
 * @author kaptan
 *
 * @param <V>
 *            Class type of map key
 * @param <T>
 *            Grouped Data Type
 */
public abstract class AbstractGroupBy<V, T> implements GrouperBy<V, T> {

	public boolean isContainsKey(Map<V, Collection<T>> container, T newData) {

		return container.containsKey(getMapKey(newData));
	}

	public abstract V getMapKey(T newData);

}
