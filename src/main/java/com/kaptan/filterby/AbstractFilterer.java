package com.kaptan.filterby;

public abstract class AbstractFilterer<T, V> implements Filterer<T, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean nullCheckEqualty(T target, V source) {
		if (null == target) {
			if (null == source) {
				return true;
			} else {
				return false;
			}
		} else {
			if (null == source) {
				return false;
			}
		}

		return true;
	}

}
