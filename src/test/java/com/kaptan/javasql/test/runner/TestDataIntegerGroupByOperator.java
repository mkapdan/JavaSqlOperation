package com.kaptan.javasql.test.runner;

import com.kaptan.groupby.AbstractGroupByOperator;
import com.kaptan.groupby.GrouperBy;
import com.kaptan.javasql.test.model.TestData;

public class TestDataIntegerGroupByOperator extends AbstractGroupByOperator<Integer, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataIntegerGroupByOperator(GrouperBy<Integer, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGroupByCondition(GrouperBy<Integer, TestData> grouper) {
		this.groupByCondition = grouper;
	}

}
