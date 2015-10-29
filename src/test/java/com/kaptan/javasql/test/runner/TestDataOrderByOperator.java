package com.kaptan.javasql.test.runner;

import java.util.Comparator;

import com.kaptan.javasql.test.model.TestData;
import com.kaptan.orderby.AbstractOrderByOperator;

public class TestDataOrderByOperator extends AbstractOrderByOperator<TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataOrderByOperator(Comparator<TestData> orderByCondition) {
		super(orderByCondition);
	}

	public void setOrderByCondition(Comparator<TestData> orderByCondition) {
		this.orderByCondition = orderByCondition;

	}

}
