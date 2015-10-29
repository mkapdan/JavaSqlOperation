package com.kaptan.javasql.test.comprator;

import com.kaptan.javasql.test.model.TestData;
import com.kaptan.orderby.AbstractOrderBy;

public class NameComparator extends AbstractOrderBy<TestData> {

	public int compare(TestData o1, TestData o2) {

		int nullCheck = nullEqualtyCheck(o1, o2);
		if (nullCheck == 0) {
			String name1 = o1.getName();
			String name2 = o2.getName();

			if (null == name1) {
				if (null == name2) {
					return 0;
				} else {
					return -1;
				}
			} else {
				if (null == name2) {
					return 1;
				}
			}

			return name1.compareTo(name2);
		} else {
			return nullCheck;
		}
	}

}
