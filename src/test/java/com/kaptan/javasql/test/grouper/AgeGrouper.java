package com.kaptan.javasql.test.grouper;

import com.kaptan.groupby.AbstractGroupBy;
import com.kaptan.javasql.test.model.TestData;

public class AgeGrouper extends AbstractGroupBy<Integer, TestData> {

	@Override
	public Integer getMapKey(TestData newData) {
		return newData.getAge();
	}

}
