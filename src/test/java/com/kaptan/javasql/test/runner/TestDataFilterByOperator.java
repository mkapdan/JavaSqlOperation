package com.kaptan.javasql.test.runner;

import com.kaptan.filterby.AbstractFilterOperator;
import com.kaptan.filterby.Filter;
import com.kaptan.javasql.test.model.TestData;

public class TestDataFilterByOperator extends AbstractFilterOperator<TestData, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataFilterByOperator(Filter<TestData, TestData> filterer) {
		super(filterer);
	}

	@Override
	public void setFilterCondition(Filter<TestData, TestData> filterer) {
		this.filterCondition = filterer;
	}

}
