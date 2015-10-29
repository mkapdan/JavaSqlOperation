package com.kaptan.filterby;
/**
 * Abstract Filter Condition Class
 * @author kaptan
 *
 * @param <T> will be filtered data class type
 * @param <V> filter data class type
 */
public abstract class AbstractFilter<T, V> implements Filter<T, V> {

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
