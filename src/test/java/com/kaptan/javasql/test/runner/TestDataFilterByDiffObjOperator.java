package com.kaptan.javasql.test.runner;

import com.kaptan.filterby.AbstractFilterOperator;
import com.kaptan.filterby.Filter;
import com.kaptan.javasql.test.model.CopyOfTestData;
import com.kaptan.javasql.test.model.TestData;

public class TestDataFilterByDiffObjOperator extends AbstractFilterOperator<TestData, CopyOfTestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataFilterByDiffObjOperator(Filter<TestData, CopyOfTestData> filterer) {
		super(filterer);
	}

	@Override
	public void setFilterCondition(Filter<TestData, CopyOfTestData> filterer) {
		this.filterCondition = filterer;
	}

}
