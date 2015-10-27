package com.kaptan.groupby;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GroupBy<V, T> extends Serializable {

	Map<V, List<T>> group(List<T> listOfItems);

	Map<V, List<T>> group(List<T> listOfItems, Grouper<V, T> grouper);

	void setGrouper(Grouper<V, T> grouper);

}
