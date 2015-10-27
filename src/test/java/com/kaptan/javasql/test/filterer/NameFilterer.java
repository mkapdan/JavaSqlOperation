package com.kaptan.javasql.test.filterer;

import com.kaptan.filterby.AbstractFilterer;
import com.kaptan.javasql.test.model.TestData;

public class NameFilterer extends AbstractFilterer<TestData, TestData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isEqual(TestData target, TestData source) {

		if (nullCheckEqualty(target, source)) {

			String name1 = target.getName();
			String name2 = source.getName();

			if (null == name1) {
				if (null == name2) {
					return true;
				} else {
					return false;
				}
			} else {
				if (null == name2) {
					return false;
				}
			}

			return name1.equalsIgnoreCase(name2);
		}
		return false;
	}

}