package com.kaptan.javasql.test.runner;

import java.util.Date;

import com.kaptan.groupby.AbstractGroupByOperator;
import com.kaptan.groupby.GrouperBy;
import com.kaptan.javasql.test.model.TestData;

public class TestDataDateGroupByOperator extends AbstractGroupByOperator<Date, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataDateGroupByOperator(GrouperBy<Date, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGroupByCondition(GrouperBy<Date, TestData> grouper) {

		this.groupByCondition = grouper;
	}

}
