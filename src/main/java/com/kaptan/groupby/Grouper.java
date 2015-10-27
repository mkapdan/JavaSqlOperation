package com.kaptan.groupby;

import java.util.List;
import java.util.Map;

public interface Grouper<V, T> {

	boolean isContainsKey(Map<V, List<T>> container, T newData);
	
	V getMapKey(T newData);
}
