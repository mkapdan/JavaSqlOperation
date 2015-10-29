package com.kaptan.groupby;

import java.util.Collection;
import java.util.Map;

/**
 * This interface helps you create groupBycondition
 * @author kaptan
 *
 * @param <V> Class type of map key
 * @param <T> Grouped Data Type
 */
public interface GrouperBy<V, T> {

	boolean isContainsKey(Map<V, Collection<T>> container, T newData);
	
	V getMapKey(T newData);
}
