package com.kaptan.javasql.test.runner;

import com.kaptan.filterby.AbstractFilterBy;
import com.kaptan.filterby.Filterer;
import com.kaptan.javasql.test.model.CopyOfTestData;
import com.kaptan.javasql.test.model.TestData;

public class TestDataFilterByDiffObjOperator extends AbstractFilterBy<TestData, CopyOfTestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataFilterByDiffObjOperator(Filterer<TestData, CopyOfTestData> filterer) {
		super(filterer);
	}

	@Override
	public void setFilterer(Filterer<TestData, CopyOfTestData> filterer) {
		this.filterer = filterer;
	}

}
