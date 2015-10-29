package com.kaptan.javasql.test.grouper;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.javasql.test.model.TestData;

public class NameGrouper extends AbstractGroupBy<String, TestData> {

	public String getMapKey(TestData newData) {
		return newData.getName();
	}

}
