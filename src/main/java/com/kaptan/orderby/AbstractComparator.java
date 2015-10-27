package com.kaptan.orderby;

import java.util.Comparator;

public abstract class AbstractComparator<T> implements Comparator<T> {

	public int nullEqualtyCheck(T o1, T o2) {
		if (null == o1) {
			if (null == o2) {
				return 0;
			} else {
				return -1;
			}
		} else {
			if (null == o2) {
				return 1;
			}
		}
		return 0;
	}

}
