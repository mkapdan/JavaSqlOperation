package com.kaptan.javasql.test.runner;

import java.util.Comparator;

import com.kaptan.javasql.test.model.TestData;
import com.kaptan.orderby.AbstractOderBy;

public class TestDataOrderByOperator extends AbstractOderBy<TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataOrderByOperator(Comparator<TestData> comparator) {
		super(comparator);
	}

	public void setComparator(Comparator<TestData> comparator) {
		this.comparator = comparator;

	}

}
