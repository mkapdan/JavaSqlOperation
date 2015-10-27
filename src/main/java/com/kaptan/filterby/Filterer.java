package com.kaptan.filterby;

import java.io.Serializable;

public interface Filterer<T, V> extends Serializable {

	boolean isEqual(T target, V source);
}
