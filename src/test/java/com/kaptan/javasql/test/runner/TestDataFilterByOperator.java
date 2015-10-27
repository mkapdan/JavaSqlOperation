package com.kaptan.javasql.test.runner;

import com.kaptan.filterby.AbstractFilterBy;
import com.kaptan.filterby.Filterer;
import com.kaptan.javasql.test.model.TestData;

public class TestDataFilterByOperator extends AbstractFilterBy<TestData, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataFilterByOperator(Filterer<TestData, TestData> filterer) {
		super(filterer);
	}

	@Override
	public void setFilterer(Filterer<TestData, TestData> filterer) {
		this.filterer = filterer;
	}

}
