package com.kaptan.javasql.test.grouper;

import java.util.Date;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.javasql.test.model.TestData;

public class DateGrouper extends AbstractGroupBy<Date, TestData> {

	@Override
	public Date getMapKey(TestData newData) {
		return newData.getBirthDate();
	}

}
