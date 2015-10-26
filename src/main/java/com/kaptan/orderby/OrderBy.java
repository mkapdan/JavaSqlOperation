package com.kaptan.orderby;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public interface OrderBy<T> extends Serializable {

	List<T> filter(List<T> listOfItems);

	List<T> filter(List<T> listOfItems, Comparator<T> comprator);
}
