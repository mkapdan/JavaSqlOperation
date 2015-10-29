package com.kaptan.filterby;

import java.io.Serializable;
/**
 * By extending this interface, you can create your own filter condition
 * @author kaptan
 *
 * @param <T> target Class type
 * @param <V> source Class type
 */
public interface Filter<T, V> extends Serializable {

	boolean isEqual(T target, V source);
}
