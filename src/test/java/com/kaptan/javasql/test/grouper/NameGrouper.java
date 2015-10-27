package com.kaptan.javasql.test.grouper;

import com.kaptan.groupby.AbstractGrouper;
import com.kaptan.javasql.test.model.TestData;

public class NameGrouper extends AbstractGrouper<String, TestData> {

	public String getMapKey(TestData newData) {
		return newData.getName();
	}

}
