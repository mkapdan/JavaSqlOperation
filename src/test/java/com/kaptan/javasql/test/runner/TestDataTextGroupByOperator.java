package com.kaptan.javasql.test.runner;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.groupby.Grouper;
import com.kaptan.javasql.test.model.TestData;

public class TestDataTextGroupByOperator extends AbstractGroupBy<String, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataTextGroupByOperator(Grouper<String, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGrouper(Grouper<String, TestData> grouper) {

		this.grouper = grouper;
	}

}
