package com.kaptan.filterby;

import java.io.Serializable;
import java.util.List;

public interface FilterBy<T, V> extends Serializable {

	List<T> filter(List<T> listOfItems, V filterData);

	List<T> filter(List<T> listOfItems, V filterData, Filterer<T, V> filterer);

	void setFilterer(Filterer<T, V> filterer);
}
