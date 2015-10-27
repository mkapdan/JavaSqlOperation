package com.kaptan.orderby;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public interface OrderBy<T> extends Serializable {

	List<T> orderBy(List<T> listOfItems);

	List<T> orderBy(List<T> listOfItems, Comparator<T> comprator);

	void setComparator(Comparator<T> comparator);
}
