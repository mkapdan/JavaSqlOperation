package com.kaptan.javasql.test.grouper;

import com.kaptan.groupby.AbstractGrouper;
import com.kaptan.javasql.test.model.TestData;

public class AgeGrouper extends AbstractGrouper<Integer, TestData> {

	@Override
	public Integer getMapKey(TestData newData) {
		return newData.getAge();
	}

}
