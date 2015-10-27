package com.kaptan.javasql.test.runner;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.groupby.Grouper;
import com.kaptan.javasql.test.model.TestData;

public class TestDataIntegerGroupByOperator extends AbstractGroupBy<Integer, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataIntegerGroupByOperator(Grouper<Integer, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGrouper(Grouper<Integer, TestData> grouper) {
		this.grouper = grouper;
	}

}
