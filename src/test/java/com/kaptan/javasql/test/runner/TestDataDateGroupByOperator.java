package com.kaptan.javasql.test.runner;

import java.util.Date;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.groupby.Grouper;
import com.kaptan.javasql.test.model.TestData;

public class TestDataDateGroupByOperator extends AbstractGroupBy<Date, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDataDateGroupByOperator(Grouper<Date, TestData> grouper) {
		super(grouper);
	}

	@Override
	public void setGrouper(Grouper<Date, TestData> grouper) {

		this.grouper = grouper;
	}

}
