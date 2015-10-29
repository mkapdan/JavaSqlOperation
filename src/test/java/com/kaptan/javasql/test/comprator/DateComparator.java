package com.kaptan.javasql.test.comprator;

import java.util.Date;

import com.kaptan.javasql.test.model.TestData;
import com.kaptan.orderby.AbstractOrderBy;

public class DateComparator extends AbstractOrderBy<TestData> {

	public int compare(TestData o1, TestData o2) {

		int nullCheck = nullEqualtyCheck(o1, o2);
		if (nullCheck == 0) {

			Date date1 = o1.getBirthDate();
			Date date2 = o2.getBirthDate();

			if (null == date1) {
				if (null == date2) {
					return 0;
				} else {
					return -1;
				}
			} else {
				if (null == date2) {
					return 1;
				}
			}

			return date1.compareTo(date2);
		} else {
			return nullCheck;
		}
	}

}
