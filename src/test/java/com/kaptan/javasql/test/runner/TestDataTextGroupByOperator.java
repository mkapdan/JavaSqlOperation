package com.kaptan.javasql.test.runner;

import com.kaptan.groupby.AbstractGroupByOperator;
import com.kaptan.groupby.GrouperBy;
import com.kaptan.javasql.test.model.TestData;

public class TestDataTextGroupByOperator extends AbstractGroupByOperator<String, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataTextGroupByOperator(GrouperBy<String, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGroupByCondition(GrouperBy<String, TestData> grouper) {

		this.groupByCondition = grouper;
	}

}
